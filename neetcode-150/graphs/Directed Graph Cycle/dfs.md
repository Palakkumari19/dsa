class Solution {
    
    public boolean dfsCheck(int node, int[] vis ,int[] pathVis, ArrayList<ArrayList<Integer>> adj){
        vis[node] =1;
        pathVis[node] = 1;
        for(int adjNode: adj.get(node)){
            if(vis[adjNode] ==0){
                if(dfsCheck(adjNode, vis, pathVis, adj))    return true;
            }else if(pathVis[adjNode] == 1)
                return true;
        }
        pathVis[node] = 0;
        return false;
    }
    
    public boolean isCyclic(ArrayList<ArrayList<Integer>> adj){
        // code here
        int[] vis = new int[adj.size()];
        int[] pathVis = new int[adj.size()];
        for(int i=0;i<adj.size();i++)
            if(vis[i]==0)
                if(dfsCheck(i,vis, pathVis, adj))
                    return true;
        return false;
    }
}