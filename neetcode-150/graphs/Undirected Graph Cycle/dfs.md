class Solution {
    
    public boolean dfs(int src, int parent, ArrayList<ArrayList<Integer>> adj, int[] vis){
        vis[src] = 1;
        for(int adjNode : adj.get(src)){
            if(vis[adjNode] == 0 ){
                if(dfs(adjNode, src, adj, vis)== true) return true;
            }
            else if(adjNode != parent)  return true;
        }
        return false;
    }
    
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int V = adj.size();
        int[] vis = new int[V];
        for(int i=0;i<V;i++)
            if(vis[i]==0)
                if(dfs(i,-1,adj,vis) == true)   return true;
        return false;
    }
}


# Detect Cycle in an Undirected Graph (DFS)

## Approach

Depth-First Search (DFS) is used to detect cycles in an undirected graph.

A `visited` array keeps track of explored vertices. Since the graph may be disconnected, every unvisited vertex is considered as a starting point for DFS.

DFS marks the current node as visited and explores all its adjacent nodes:
- If an adjacent node is unvisited, DFS is called recursively with the current node as its parent.
- If an adjacent node is already visited and is not the current node's parent, a cycle is detected.

The parent check is necessary because, in an undirected graph, every edge appears in both directions. If no cycle is found across all connected components, the graph is acyclic.

## Complexity

**Time:** O(V + E) — Every vertex is visited once, and every edge is examined at most twice through the adjacency list.

**Space:** O(V) — The visited array requires O(V) space, and the recursive DFS stack can take up to O(V) space in the worst case.