import java.util.*;
class Solution {
    PriorityQueue<Integer> maxHeap;
    public int lastStoneWeight(int[] stones) {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++)
            maxHeap.offer(stones[i]);
        while(maxHeap.size()>1){
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            if(x!=y)
                maxHeap.offer(y-x);
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}