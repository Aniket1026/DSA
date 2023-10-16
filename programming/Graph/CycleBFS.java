package programming.Graph;

// Link -> https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=detect-cycle-in-an-undirected-graph
// problem -> Detect cycle in a graph using bfs

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class CycleBFS {

	public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
		// Code here
		boolean visited[] = new boolean[V];
		for(int i=0;i<V;i++){
			if(!visited[i]){
				if(detectCycle(i,V,adj,visited))
					return true;
			}
		}
		return false;
	}

	private boolean detectCycle(int start,int V ,ArrayList<ArrayList<Integer>> adj, boolean[] visited){
		Queue<Integer> queue = new LinkedList<>();
		int[] parent = new int[V];
		Arrays.fill(parent, -1);

		visited[start] = true;
		queue.add(start);

		while (!queue.isEmpty()) {
			int u = queue.poll();
			for (int i : adj.get(u)) {
				if (!visited[i]) {
					visited[i] = true;
					queue.add(i);
					parent[i] = u;
				} else if (parent[u] != i) {
					// If v is already visited and not the parent of u, then there is a cycle
					return true;
				}
			}
		}
		return false;
	}
}
