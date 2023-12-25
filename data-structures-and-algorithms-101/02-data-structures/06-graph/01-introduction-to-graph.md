# Introduction to Graph
You can think of the `graph` as a **relationship between people in a social network**. Let's say Khaled is connected to Fahad and Fahad is connected to Majed, but Majed is not connected to Khaled. We can **organize this data by using Graph**.

<img width="350" alt="Graph Example" src="data-structures-and-algorithms - Intro Graph Directed Example.jpg">

### **Graph Attributes are**:
Let's take the image above as an example.
The **nodes** are holding data, which represent Khaled, Fahad, and Majed.

<img width="300" alt="Graph - Node" src="data-structures-and-algorithms - Copy of Intro Graph Directed Example.jpg">

The **edges** are the arrows between the nodes, which represent the relationship between them.

<img width="300" alt="Graph - Node" src="data-structures-and-algorithms - Copy of Intro Graph Directed Example (1).jpg">


**Weight** which is the value of the edge.

> The difference between the edges and weighted is that the edges are just a connection between the nodes, but the weighted have a value of the edge.

> An example of the weighted graph is the map navigation, where the nodes are the cities and the edges are the roads between the cities. And the weight of the edge is the distance between the cities.

> Some resources refer to the node as a **vertex** and the edge as an **arc**.


## Concept
A **Graph is a non-linear data structure** is a pictorial representation of a set of objects where some pairs of objects are connected by links. The interconnected objects are represented by points termed as nodes, and the links that connect the nodes are called edges.

There are two components of a graph:
1. Node - A node represents an entity (object) in the graph.
2. Edge - An edge is a line or arc that connects a pair of vertices in the graph.

The way to represent a graph is using an Adjacency Matrix, Adjacency List or Graph.

* **Adjacency Matrix**

![Alt text](<Screenshot 1445-06-11 at 10.35.03 AM.png>)

* **Adjacency List**

![Alt text](<data-structures-and-algorithms - Adjacency Matrix.jpg>)



* **Graph**


<img width="350" alt="Graph Directed Example" src="data-structures-and-algorithms - Intro Graph Directed Example (1).jpg">


> Generally, graphs are used to model problems defined in terms of relationships or connections between objects. One example of this is a social network, where the nodes are people and the edges are friendship relationships between them.
## Implementation
There are many way to implement the graph, but we'll use the **Adjacency Matrix**.
We can implement the graph using **two dimensional array**. Where the first dimension is the number of nodes and the second dimension is the number of nodes that are connected to the first node.


```java
import java.util.ArrayList;
class Node {
    char data;

    public Node(char data) {
        this.data = data;
    }
}

class Graph {

    public ArrayList<Node> nodes = new ArrayList<>();
    int[][] adjMatrix;

    public Graph(int size) {
        nodes = new ArrayList<>();
        adjMatrix = new int[size][size];
    }

    public void addNode(Node item){
        nodes.add(item);
    }

    public void addEdge(int src, int dst) {
        adjMatrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        if(adjMatrix[src][dst] == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void printGrapn() {

        for(Node node : nodes) {
            System.out.print("\t"+ node.data + " ");
        }
        System.out.println();

        for(int i = 0; i < adjMatrix.length; i++) {
            System.out.print(nodes.get(i).data + "\t");

            for(int j = 0; j < adjMatrix.length; j++) {
                System.out.print(adjMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Graph graphObj = new Graph(5);

        graphObj.addNode(new Node('A'));
        graphObj.addNode(new Node('B'));
        graphObj.addNode(new Node('C'));
        graphObj.addNode(new Node('D'));
        graphObj.addNode(new Node('E'));

        graphObj.addEdge(0,1);
        graphObj.addEdge(1,2);
        graphObj.addEdge(1,4);
        graphObj.addEdge(2, 3);
        graphObj.addEdge(2, 4);
        graphObj.addEdge(4, 0);
        graphObj.addEdge(4, 2);


        graphObj.printGrapn();

    }
}
```


## Types

* ###  **Directed Graph** 
It's a graph where each edge is directed. Each node is directed at another node with a specific requirement of what node should be referenced next.

<img width="350" alt="An element in the queue array" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/149315149/526780a5-45f0-43c1-b0c2-80606975eb41">

<hr>



* ### **Undirected Graph** 
It's a graph where each edge is undirected or bi-directional. This means that the undirected graph does not move in any direction.

<img width="350" alt="An element in the queue array" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/149315149/3ddb74c8-f4e0-4d32-9491-e1a37761a3f2">



## Projects

Project ID | Project Title | Deadline |
|:-----|:-----------:|:-------------|
|GraphProject01| [Type of Graph]() | - | 
