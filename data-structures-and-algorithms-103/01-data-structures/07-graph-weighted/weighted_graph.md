# Weighted Graph
<!-- Here I give a real life example of weighted graph -->
If a graph edge has a value associated with it, then it is called a weighted graph. The value is referred to as the weight or cost of the edge.


One of the use case of the weighted graph is map navigation. Where the **vertices** are the current location and destination and the **edges** are the roads which connected to the destination, and the **weights** are the distance between the two locations.

<!-- Image descripte the uses of weighted graph in map navigation -->

## Concept
<!-- What is the weighted graph? -->
Weighted Graph is a graph in which each edge has a value. The value is referred to as the weight or cost of the edge.

# Implementation
We can implement weighted graph using **Adjacency Matrix**, where each cell of the matrix represents the weight of the edge.

> Adjacency Matrix is a 2D array, the column represents the source vertex and the row represents the destination vertex.

<!-- Weighted Graph Theory + 2D Array Image -->


```java 
public class GraphWeighted {

    private int[][] adjacencyMatrix;

    public GraphWeighted(int numVertices) {
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyMatrix[source][destination] = weight;
        adjacencyMatrix[destination][source] = weight;
    }

    public static void main(String[] args) {

        GraphWeighted graph = new GraphWeighted(4);

         // source , destination, weight
        graph.addEdge(0, 1, 5);
        graph.addEdge(1, 2, 13);
        graph.addEdge(2, 3, 9);
        graph.addEdge(3, 1, 7);
        
        // Print the adjacency matrix
        for (int source = 0; source < 4; source++) {
            for (int dest = 0; dest < 4; dest++) {
                System.out.print(graph.adjacencyMatrix[source][dest] + "\t");
            }
            System.out.println();
        }
    }
}

```

## Projects

Project ID | Project Title | Deadline |
|:-----|:-----------:|:-------------|
|WeightedGraph| [Weighted Graph Project](https://github.com/SAFCSP-Team/weighted-graph-project/tree/main) | - | 
