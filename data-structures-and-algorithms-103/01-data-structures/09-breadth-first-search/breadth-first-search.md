# Breadth First Search

## Concept
Explores all the vertices of a graph in breadth-first order, we use a queue data structure technique to store the vertices. The queue follows the First In First Out (FIFO) principle, which means that the neighbors of the node will be displayed, beginning with the node that was put first.


so we operate BFS algorithm:

1. start from the source node.
2. add that node at the front of the queue to the visited list.
3. make a list of the nodes as visited that are close to that vertex.
4. dequeue the nodes once they are visited.
5. repeat the actions until the queue is empty.

the BFS algorithm ensures that all vertices at a particular level are visited before moving on to the next level, by enqueuing the neighboring vertices of each vertex.


[gif in progress]()
## Implementation

 Function to perform `Breadth First Search` on a graph and represented using adjacency list 

```java
   public void breadthfirstSearch(int startNode){

        /* Create a queue for BFS */
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];

        /* Mark the current node as visited and enqueue it */
        visited[startNode] = true;
        queue.add(startNode);

        /* Iterate over the queue */
        while (!queue.isEmpty()) {
            /* Dequeue a vertex from queue and print it */
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            /* Get all adjacent vertices of the dequeued */

            /* vertex currentNode If an adjacent has not been visited, then mark it visited and enqueue it */
            for (int neighbor : adjList[currentNode]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
```

`Graph` class to represent a graph using an adjacency list

```java
import java.util.LinkedList;
import java.util.Queue;


class Graph {
    int vertices;
    LinkedList<Integer>[] adjList;

    public Graph(int vertices)
    {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i)
            adjList[i] = new LinkedList<>();
    }

    /* function to add an edge to the graph */
    void addEdge(int u, int v) { 
        adjList[u].add(v); 
    
    }
}
```

```java
public class Main {
    public static void main(String[] args)
    {
        /* Number of vertices in the graph */
        int vertices = 5;

        /* Create a graph */

        Graph graph = new Graph(vertices);

        /* Add edges to the graph */
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        // Perform BFS traversal starting from vertex 0
        System.out.print(
            "Breadth First Traversal starting from vertex 0: ");
        graph.bfs(0);
    }
}
```

## Projects
| Project Title | Deadline |
:-----------:|:-------------|
|[Breadth first search](https://github.com/SAFCSP-Team/breadth-first-search-project/tree/main)|



