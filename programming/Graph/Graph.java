package programming.Graph;

public class Graph {

	public static void main(String[] args) {
//		AdjacencyMatrix graph = new AdjacencyMatrix(5);
//		graph.addEdge(0, 1);
//		graph.addEdge(0, 4);
//		graph.addEdge(1, 2);
//		graph.addEdge(1, 3);
//		graph.addEdge(1, 4);
//		graph.addEdge(2, 3);
//		graph.addEdge(3, 4);
//		graph.printGraph();
//		System.out.println(graph.edgeExists(2,4));

//		AdjacencyList graph = new AdjacencyList(7);
//		graph.addEdge(0,1);
//		graph.addEdge(0,2);
//		graph.addEdge(1,3);
//		graph.addEdge(1,4);
//		graph.addEdge(2,3);
//		graph.addEdge(3,5);
//		graph.addEdge(4,6);
//		graph.addEdge(5,6);
//		graph.printGraph();

		int vertices = 6;
		WeightedGraph.Graph graph = new WeightedGraph.Graph(vertices);
		graph.addEdge(0, 1, 4);
		graph.addEdge(0, 2, 3);
		graph.addEdge(1, 3, 2);
		graph.addEdge(1, 2, 5);
		graph.addEdge(2, 3, 7);
		graph.addEdge(3, 4, 2);
		graph.addEdge(4, 0, 4);
		graph.addEdge(4, 1, 4);
		graph.addEdge(4, 5, 6);
		graph.printGraph();
	}
}
