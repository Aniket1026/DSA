package programming.Graph;
import java.util.ArrayList;
// This is a graph where nodes are number from 0 to n-1
public class AdjacencyList {
	int vertex;
	ArrayList<ArrayList<Integer>> adjacencyList;

	public  AdjacencyList(int nodes){
		this.vertex = nodes;
        adjacencyList = new ArrayList<>();
		for(int i=0;i<nodes;i++){
			adjacencyList.add(new ArrayList<>());
		}
	}
	public void addEdge(int source, int destination){
		adjacencyList.get(source).add(destination);
		adjacencyList.get(destination).add(source);
	}

	public void addDirectedEdge(int source, int destination){
		adjacencyList.get(source).add(destination);
	}
	public void printGraph(){
		for (int i=0;i<vertex;i++){
			ArrayList<Integer> list = adjacencyList.get(i);
			System.out.print("["+ i +"] ->");
			System.out.print("[");
			for (int j=0;j<list.size()-1;j++){
				System.out.print(list.get(j)+",");
			}
			System.out.print(list.get(list.size()-1));
			System.out.print("]");
			System.out.println();
		}

	}
}
