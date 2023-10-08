package programming.Graph;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;


public class BFS {
	int vertices;
	ArrayList<ArrayList<Integer>> list;
	Queue<Integer> queue;
	public static void main(String[] args) {
		BFS graph = new BFS(6);
		graph.addEdge(0, 1);
		graph.addEdge(0, 3);
		graph.addEdge(0, 4);
		graph.addEdge(4, 5);
		graph.addEdge(3, 5);
		graph.addEdge(1, 2);
		System.out.println("Breadth First Traversal for the graph is:");
		graph.bfsTraversal(0);
	}
	public BFS(int v){
		this.vertices = v;
		list = new ArrayList<>(v);
		for(int i=0;i<v;i++){
			list.add(new ArrayList<>());
		}
		queue = new LinkedList<>();
	}

	public void addEdge(int source , int destination){
		list.get(source).add(destination);
		list.get(destination).add(source);
	}

	public void bfsTraversal(int startNode){
		int[] visited = new int[vertices];
		queue.add(startNode);
		visited[startNode] = 1;
		while(!queue.isEmpty()){
			int temp = queue.poll();
			System.out.print(temp +" ");
			int size = list.get(temp).size();
			for(int i=0;i<size;i++){
				int node = list.get(temp).get(i);
				if(visited[node]!=1){
					queue.add(node);
					visited[node] = 1;
				}
			}
		}
	}
}
