/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node, Node> map = new HashMap<>();
    void dfs(Node node, Node cloned){
        for(Node n: node.neighbors){
            if(!map.containsKey(n)){
                Node clone = new Node(n.val);
                map.put(n,clone);
                cloned.neighbors.add(clone);
                dfs(n,clone);
            }else{
                cloned.neighbors.add(map.get(n));
            }
        }
    }

    public Node cloneGraph(Node node) {
        if(node == null)   return null;
        Node clone_node = new Node(node.val);
        map.put(node, clone_node); 
        dfs(node, clone_node);
        return clone_node;
    }
}