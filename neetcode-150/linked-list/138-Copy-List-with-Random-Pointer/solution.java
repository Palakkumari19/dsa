/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        HashMap<Node, Node> map = new HashMap<>();
        while(temp!=null){
            Node newNode = new Node(temp.val);
            map.put(temp, newNode);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            Node curr = map.get(temp);
            Node next = temp.next;
            Node ran = temp.random;
            curr.next = map.get(next);
            curr.random = map.get(ran);
            temp = temp.next;
        }
        return map.get(head);
    }
}