package programming.Graph;
import java.util.*;
/*
Problem -> Detect if there is a cycle in the graph using dfs
Approach : start from a node and if you visit the node again there is a cycle
           carry the node and its parent if the visiting node is parent just return
           if it's visited and not even parent cycle is detected , return true;
 */
public class CycleDfs {
public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
	// Code here
	boolean[] visited = new boolean[V];
	int[] parent = new int[V];
	for(int i=0;i<V;i++){
          if(!visited[i]){
			  if(detectCycle(i,-1,visited,parent,adj))  return true;
          }
	  }
	return false;
    }
    private boolean detectCycle(int node,int parentNode ,boolean[] visited ,int[] parent,ArrayList<ArrayList<Integer>> adj ){
	if(parent[node] == parentNode || visited[node]) return false;
	visited[node] = true;
	parent[node] =parentNode;
	for(int u : adj.get(node)){
		if(!visited[u]){
			if(detectCycle(u,node,visited,parent,adj))
				return true;
		}else if(parent[node]!=u) return true;
	}
	return false;
    }
}
