package programming.Graph;

import java.util.ArrayList;

public class WeightedGraph {
    static class Edge{
	int source;
	int destination;
	int weight;
	public Edge(int source, int destination , int weight){
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	   }
    }
	static  class Graph{
		int vertices;
		ArrayList<ArrayList<Edge>> adjacencyList;
		 public Graph(int vertices){
			 this.vertices = vertices;
			 adjacencyList = new ArrayList<>(vertices);
			 for(int i=0;i<vertices;i++){
				 adjacencyList.add(new ArrayList<>());
			 }
		 }
		 public void addEdge(int source, int destination,int weight){
		  Edge edge = new Edge(source,destination,weight);
		  adjacencyList.get(source).add(edge); // for directed graph
		 }

		 public void printGraph(){
			 for (int i=0;i<vertices;i++){
				 ArrayList<Edge> list = adjacencyList.get(i);
				 for (int j=0;j<list.size();j++){
					 System.out.println("vertex "+i+" is connected to " +list.get(j).destination+" with weight "+list.get(j).weight);
				 }
			 }
		 }
	}
}
