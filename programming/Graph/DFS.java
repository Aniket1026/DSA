package programming.Graph;

import java.util.ArrayList;

public class DFS {
     int vertices;
	 ArrayList<ArrayList<Integer>> adjacencyList;
	 boolean[] visited;

	 public DFS(int v){
		 this.vertices =v+1;
		 adjacencyList = new ArrayList<>(vertices);
		 for(int i=0;i<vertices;i++){
			 adjacencyList.add(new ArrayList<>());
		 }
		 visited = new boolean[this.vertices];
	 }
	 public void addEdge(int source, int destination){
		 adjacencyList.get(source).add(destination);
		 adjacencyList.get(destination).add(source);
	 }

	 public void dfsTraversal(int node){
//		 if(visited[node]) return; use either this or the 29th line both work same but the later one makes lesser calls
	     visited[node] = true;
		 System.out.print(node + " ");
		 int size = adjacencyList.get(node).size();
		 for(int i=0;i<size;i++){
			 if(!visited[adjacencyList.get(node).get(i)])
				 dfsTraversal(adjacencyList.get(node).get(i));
			 }
	 }

	public static void main(String[] args) {
		DFS dfs = new DFS(8);

	    dfs.addEdge(1,2);
		dfs.addEdge(1,3);
		dfs.addEdge(2,5);
		dfs.addEdge(2,6);
		dfs.addEdge(3,4);
		dfs.addEdge(4,8);
		dfs.addEdge(8,7);
		dfs.addEdge(7,3);

		System.out.println("Following is Depth First Traversal");
		dfs.dfsTraversal(1);
	}
}
