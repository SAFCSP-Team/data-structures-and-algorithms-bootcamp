# Introduction to Graph
You can think of the graph as a relationship between people in a social network. Let's say Khaled is connected to Fahad and Fahad is connected to Majed, but Majed is not connected to Khaled.

<img width="350" alt="Graph Example" src="images/Intro Graph Directed Example.jpg">

### **Graph Attributes are**:
Let's take the image above as an example.
The **nodes** are holding data, which represent Khaled, Fahad, and Majed.

<img width="300" alt="Graph - Node" src="images/Graph Directed Node Example.jpg">

The **edges** are the arrows between the nodes, which represent the relationship between them.

<img width="300" alt="Graph - Node" src="images/Graph Directed Edge Example.jpg">


**Weight** which is the value of the edge.

> The difference between the edges and weighted is that the edges are just a connection between the nodes, but the weighted have a value of the edge.

> An example of the weighted graph is the map navigation, where the nodes are the cities and the edges are the roads between the cities. And the weight of the edge is the distance between the cities.

## Concept
A **Graph is a non-linear data structure** is a pictorial representation of a set of objects where some pairs of objects are connected by links. The interconnected objects are represented by points termed as nodes, and the links that connect the nodes are called edges.

There are two components of a graph:
1. Node - A node represents an entity (object) in the graph.
2. Edge - An edge is a line or arc that connects a pair of vertices in the graph.

The way to represent a graph is using an Adjacency Matrix, Adjacency List, or Graph.

* **Adjacency Matrix**

<img width="350" alt="Graph - Node" src="images/Graph Adjacency Matrix Example.png">

* **Adjacency List**

<img width="350" alt="Graph - Node" src="images/Graph Adjacency List.jpg">


* **Graph**


<img width="350" alt="Graph Directed Example" src="images/Graph Directed Example.jpg">


> Generally, graphs are used to model problems defined in terms of relationships or connections between objects. One example of this is a social network, where the nodes are people and the edges are friendship relationships between them.
## Implementation
We will implement **the directed graph** using the **adjacency matrix**.
The way to implement the adjacency matrix is by using a **two-dimensional array**. Where the first dimension is the number of nodes and the second dimension is the number of nodes that are connected to the first node.


1. Create a class called **Node** that has data and a constructor that takes the data as a parameter.
   
```java

class Node {
    char data;

    public Node(char data) {
        this.data = data;
    }
}

```

1. Create a class called **Graph** that has an array list of nodes and in the constructor initialize nodes.

```java
import java.util.ArrayList;


class Graph {

    public ArrayList<Node> nodes = new ArrayList<>();

    public Graph() {
        nodes = new ArrayList<>();
    }

}
```
> Now we have created two classes, one for the node and the other for the graph. The next step is to create a method to add a node to the graph.

3. In **Graph** class, create a method called **addNode** that takes a node as a parameter and add it to the array list of nodes.

```java

public void addNode(Node item){
        nodes.add(item);
    }

```

4. In main method, create an object from the **Graph** class and add the nodes A and B to the graph.

```java

public class Main {
    public static void main(String[] args) {
        
        Graph objGraph = new Graph();

        objGraph.addNode(new Node('A'));
        objGraph.addNode(new Node('B'));

        System.out.println(objGraph.nodes.get(0).data);
        System.out.println(objGraph.nodes.get(1).data);
    }
}

```

**OUTPUT** 

```
A
B
```

Right now we have only created a node but we didn't create a relationship between them.
Create two dimensional array attribtue called **adjMatrix**. And in the constructor we have initialized the array with the size of nodes length.

```java
class Graph {

    public ArrayList<Node> nodes = new ArrayList<>();
    int[][] adjMatrix;

    public Graph(int size) {
        nodes = new ArrayList<>();
        // Initialize the adjacency matrix
        adjMatrix = new int[size][size];
    }
}

```

In the code above we have created a two dimensional array attribtue called **adjMatrix**. And in the constructor we have initialized the array with the size of nodes length.

5. In Graph class create a method called **addEdge** that takes two parameters, the first one is the source node and the second one is the destination node. And set the value of the adjMatrix to 1. which means that the source node is connected to the destination node.

```java
public void addEdge(int src, int dst) {
        adjMatrix[src][dst] = 1;
    }
```



6. Call **addEdge** in the main method, and pass the index of A and B, to create an edge between the node A and B.

```java
public class Main {
    public static void main(String[] args) {

        // 4 Create a graph node object
        Graph objGraph = new Graph(2);

        objGraph.addNode(new Node('A'));
        objGraph.addNode(new Node('B'));

        // pass the index of the source node and the index of destination node
        objGraph.addEdge(0,1);

        objGraph.printAdjMatrix();

    }
}
```

> In the objGraph constructor, we have passed 2 as a parameter, which is the count of the nodes. 

We have succssfully created a graph with two nodes and an edge between them.

<img width="350" alt="A-B_Graph" src="images/Directed Nodes Connected.jpg">


7. Create a method to print the graph using **Adjacency Matrix**.

```java
    public void printAdjMatrix() {

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
```
**OUTPUT**
```
	A 	B 
A	0	1	
B	0	0

```

8. Create a method called **deleteEdge** that takes two parameters, the first one is the source node and the second one is the destination node. And set the value of the adjMatrix to 0. which means that the source node is not connected to the destination node.

```java
public void deleteEdge(int src, int dst) {
        adjMatrix[src][dst] = 0;
    }

```

9. Call **deleteEdge** in the main method, and pass the index of A and B, to delete the edge between the node A and B.

```java

objGraph.deleteEdge(0, 1);

```

10. Create **updateNode** method that takes two parameters, the first one is the index of node that you want to update and the second one is the new node.

```java

public void updateNode(int index, Node item) {
        if(index < nodes.size()) {
            nodes.set(index, item);
        }
    }

```

11. Call **updateNode** in the main method, and pass the index of B and the new node.

```java

objGraph.updateNode(1, new Node('C'));
```

**OUTPUT**
```
	A 	C 
A	0	0	
C	0	0
```

## Types

* ###  **Directed Graph** 
It's a graph where each edge is directed. Each node is directed at another node with a specific requirement of what node should be referenced next. In the image below A is adjacent to B, but B is not adjacent to A. That's mean you can't go from B to A, without having to go through other nodes. 

<img width="350" alt="An element in the queue array" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/149315149/526780a5-45f0-43c1-b0c2-80606975eb41">

<hr>



* ### **Undirected Graph** 
It's a graph where each edge is undirected or bi-directional. This means all nodes are connected to each other. 
In the image below D is adjacent to B, and B is adjacent to D.

<img width="350" alt="An element in the queue array" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/149315149/3ddb74c8-f4e0-4d32-9491-e1a37761a3f2">



## Projects

Project ID | Project Title | Deadline |
|:-----|:-----------:|:-------------|
|GraphProject01| [Type of Graph](https://github.com/SAFCSP-Team/introduction-to-graph-project) | - | 
