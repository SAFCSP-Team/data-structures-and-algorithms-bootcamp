# Weighted Graph
<!-- Here I give a real-life example of a weighted graph -->
If a graph edge has a value associated with it, then it is called a weighted graph. The value is referred to as the weight or cost of the edge.


One of the use cases of the weighted graph is map navigation. Where the **vertices** are the current location and destination the **edges** are the roads which connected to the destination, and the **weights** are the distance between the two locations.


## Concept
<!-- What is the weighted graph? -->
Weighted Graph is a graph in which each edge has a value. The value is referred to as the weight or cost of the edge.

# Implementation
We can implement weighted graph using **Adjacency Matrix**, where each cell of the matrix represents the weight of the edge.

> Adjacency Matrix is a 2D array, the column represents the source vertex and the row represents the destination vertex.


<p align="center" >
<img src="https://github.com/user-attachments/assets/cd76712b-958a-4423-b217-1b3205f8052f" width="250" alt="example sub-problems">
</p>

```java 
import java.util.ArrayList;

public class GraphWeighted {

    class Vertex {
        char data;

        public Vertex(char data) {
            this.data = data;
        }
    }

    private ArrayList<Vertex> vertices = new ArrayList<>();
    private int[][] adjacencyMatrix;

    public GraphWeighted(int numVertices) {
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addVertex(char data) {
        vertices.add(new Vertex(data));
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyMatrix[source][destination] = weight;
    }

    public void display() {
        System.out.print("\t");
        for (Vertex vertex : vertices) {
            System.out.print(vertex.data + "\t");
        }
        System.out.println();
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            System.out.print(this.vertices.get(i).data + "\t");
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphWeighted graph = new GraphWeighted(3);
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');

        graph.addEdge(0, 1, 2);
        graph.addEdge(1, 2, 6);
        graph.addEdge(2, 0, 8);

        graph.display();
    }
}

```
**OUTPUT**
```
        A       B       C
A       0       2       0
B       0       0       6
C       8       0       0
```
## Projects

Project ID | Project Title | Deadline |
|:-----|:-----------:|:-------------|
|WeightedGraph| [Weighted Graph Project](https://github.com/SAFCSP-Team/weighted-graph-project/tree/main) | - | 
