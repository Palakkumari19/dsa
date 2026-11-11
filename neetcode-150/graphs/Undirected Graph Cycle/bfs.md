 class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    
    public boolean checkForCycle(int src, int V, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        Queue<Pair> q = new LinkedList<>();
        vis[src] = true;
        q.add(new Pair(src,-1));
        while(!q.isEmpty()){
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();
            for(int adjNode: adj.get(node)){
                if(vis[adjNode]==false){
                    vis[adjNode] = true;
                    q.add(new Pair(adjNode,node));
                }else if(parent!=adjNode)
                    return true;
            }
        }
        return false;
    }
    
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int V = adj.size();
        boolean[] vis = new boolean[adj.size()];
        for(int i=0;i<V;i++)
            vis[i] = false;
        for(int i=0;i<V;i++){
            if(vis[i]==false)
                if(checkForCycle(i, V, adj, vis))
                    return true;
        }
        return false;
    }
}

# Detect Cycle in an Undirected Graph

## Approach

Breadth-First Search (BFS) is used to detect whether an undirected graph contains a cycle.

A `visited` array keeps track of explored vertices. Since the graph may be disconnected, every unvisited vertex is considered as a starting point for BFS.

A queue stores pairs containing the current node and its parent. Initially, the source node is marked as visited and inserted into the queue with `-1` as its parent.

For every adjacent node:
- If it is unvisited, it is marked as visited and added to the queue with the current node as its parent.
- If it is already visited and is not the current node's parent, a cycle is detected.

If BFS completes for all connected components without detecting a cycle, the graph is acyclic.

## Complexity

**Time:** O(V + E) — Every vertex is visited once, and every edge is examined at most twice in an undirected adjacency list.

**Space:** O(V) — The visited array and BFS queue can each store up to V vertices.