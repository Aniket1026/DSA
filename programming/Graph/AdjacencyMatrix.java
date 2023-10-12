package programming.Graph;

public class AdjacencyMatrix {
int vertex;
int[][] matrix;

   public AdjacencyMatrix(int vertex){
	this.vertex = vertex;
	matrix = new int[vertex][vertex];
    }

	public void addEdge(int source, int destination){
	   matrix[source][destination]=1;
	   matrix[destination][source] =1;
	}

	public void addDirectedEdge(int source , int destination){
	   matrix[source][destination]=1;
	}
	public void addWeightedEdge(int source, int destination, int weight){
	   matrix[source][destination] = weight;
	   matrix[destination][source] = weight;
	}

	public void printGraph(){

		for(int i=0;i<vertex;i++){
			for(int j=0;j<vertex;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

		System.out.print("Graph using adjacency matrix");
		for(int i=0;i<vertex;i++){
			System.out.print("vertx "+i+" is connected to: ");
			for(int j=0;j<vertex;j++){
                if(matrix[i][j]==1){
	                System.out.print(j+" ");
                }
			}
			System.out.println();
		}
	}
	public boolean edgeExists(int source, int destination){
	   return matrix[source][destination] == 1;
	}
}
