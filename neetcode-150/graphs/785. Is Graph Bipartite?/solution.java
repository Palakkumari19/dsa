class Solution {

    public boolean checkBipartite(int src, int V, int[][] graph, int[] set){
        set[src] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int node = q.poll();
            for(int adjNode : graph[node]){
                if(set[adjNode] == -1){
                    set[adjNode] = 1 - set[node];
                    q.add(adjNode);
                }else if(set[adjNode] == set[node])
                    return false;
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int[] set = new int[graph.length];
        for(int i=0;i<graph.length;i++)
            set[i] = -1;
        for(int i=0;i<graph.length;i++)
            if(set[i]==-1)
                if(checkBipartite(i,graph.length, graph, set)==false)
                    return false;
        return true;
    }
}