# Introduction to Graph
You can think of the graph as a relationship between people in a social network. Let's say Khaled is connected to Fahad and Fahad is connected to Majed, but Majed is not connected to Khaled.

> We can represent the connection between them as a graph drawing.

<img width="350" alt="Graph Example" src="images/Intro Graph Directed Example.jpg">


## Concept
A **Graph is a non-linear data structure** is a pictorial representation of a set of objects where some pairs of objects are connected by links. The interconnected objects are represented by points termed **vertices**, and the links that connect the vertices are called **edges**.

> **vertices** are another name for **nodes**.

### Graph Attributes

* The **node** is holding data, which represents Khaled, Fahad, and Majed.

<img width="300" alt="Graph - Node" src="images/Graph Directed Node Example.jpg">

* The **edge** is the arrow between the nodes, which represent the relationship between them.

<img width="300" alt="Graph - Node" src="images/Graph Directed Edge Example.jpg">


* The **weight** is the value of the edge.

An example of the weighted graph is map navigation, where the **nodes** are the cities and the **edges** are the roads between the cities. The **weight** of the edge is the **distance** between the cities.

<img width="350" alt="Graph - Node" src="images/Graph-Weight.jpg">

> The difference between the edges and weighted is that the edges are just a connection between the nodes, but the weighted have a value of the edge.

## Terminology
* **Simple Graph** - A simple graph is an unweighted, undirected graph containing no loops or multiple edges.
* **In-degree** - The number of edges pointing to a vertex in a directed graph.
* **Out-degree** - The number of edges pointing out of a vertex in a directed graph.
* **Path** - A path is a sequence of edges between two vertices.
* **Self-Loop** - A self-loop is an edge that connects a vertex to itself.
> Vertex A is self-loop.
<img width="200" alt="Graph - Node" src="images/graph-loop.png">

* **Cyclic Graph** - A node that can traverse through a path and return to itself.

<img width="200" alt="Graph - Node" src="images/graph-cyclic.png">

> Vertex  A is a self-loop vertex.

* **Acyclic Graph** - When a directed graph doesn't have a cyclic vertex it's called Acyclic.
* **Connected Graph** - A connected graph is a graph in which each vertex is connected to at least one other vertex.

<img width="200" alt="Graph - Node" src="images/graph-connected.png">

* **Disconnected Graph** - A disconnected graph is a graph where some vertices may not have edges.

<img width="200" alt="Graph - Node" src="images/graph-disconnected.png">


* **Complete Graph** - A complete graph is a graph where each vertex is connected to every other vertex.

<img width="200" alt="Graph - Node" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/149315149/30b0d3aa-f85a-45cc-98b6-4116a23e37dd">

* **Subgraph** - A subgraph is a subset of the vertices and edges of a graph.
* **Strongly Connected Graph** - A directed graph is strongly connected when there is a path between each pair of vertices.

<img width="200" alt="Graph - Node" src="images/graph-connected.png">

* **Weakly Connected Graph** - A directed graph is weakly connected when there is a path between each pair of vertices when the graph   

<img width="200" alt="Graph - Node" src="images/graph-weakly-connected.png">


### Graph Representation
Tho most popular ways to represent a graph are using an **Adjacency Matrix** or **Adjacency List**.

* **Adjacency Matrix**

<img width="350" alt="Graph - Node" src="images/Graph Adjacency Matrix Example.png">

<br><br>

* **Adjacency List**

<img width="350" alt="Graph - Node" src="images/Graph Adjacency List.jpg">

<br><br>

* **Graph**


<img width="350" alt="Graph Directed Example" src="images/Graph Directed Example.jpg">

<br><br>

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

2. Create a class called **Graph** that has an array list of Node and in the constructor initialize the array list.

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

5. To connect the nodes to each other, create two dimensional array attribtue called **adjMatrix**. 
And in the constructor we have initialized the array with the size of nodes length.

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

6. In Graph class create a method called **addEdge** that takes two parameters, the first one is the source node and the second one is the destination node. And set the value of the adjMatrix to 1. which means that the source node is connected to the destination node.

```java
public void addEdge(int src, int dst) {
        adjMatrix[src][dst] = 1;
    }
```



7. Call **addEdge** in the main method, and pass the index of A and B, to create an edge between the node A and B.

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

> Vertice A is adjacent to B

<br>

8. Create a method to **print** the graph using **Adjacency Matrix**.

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

9. Create a method called **deleteEdge** that takes two parameters, the first one is the source node and the second one is the destination node. And set the value of the adjMatrix to 0. which means that the source node is not connected to the destination node.

```java
public void deleteEdge(int src, int dst) {
        adjMatrix[src][dst] = 0;
    }

```

10. Call **deleteEdge** in the main method, and pass the index of A and B, to delete the edge between the node A and B.

```java

objGraph.deleteEdge(0, 1);

```

11. Create **updateNode** method that takes two parameters, the first one is the index of node that you want to update and the second one is the new node.

```java

public void updateNode(int index, Node item) {
        if(index < nodes.size()) {
            nodes.set(index, item);
        }
    }

```

12. Call **updateNode** in the main method, and pass the index of B and the new node.

```java

objGraph.updateNode(1, new Node('C'));
```

13. Call **printAdjMatrix** in the main method, to print the graph, so we can see the changes.



**OUTPUT**
```
	A 	C 
A	0	0	
C	0	0
```

### Adjacency List
an Adjacency List is a collection of unordered lists used to represent a finite graph. Each list describes the set of neighbors of a vertex in the graph.

> It's basically an array of linked lists.

Let's implement adjacency list to represent the graph.

1. Create a class called **Node** that has data and a constructor that takes the data as a parameter.
   
```java

class Node {
    char data;

    public Node(char data) {
        this.data = data;
    }
}

```

2. Create a class called **Graph** that has an attribute of array list of Linked list and in the constructor initialize the array list.

```java

public class Graph {

    static ArrayList<LinkedList<Node>> array;

    Graph() {
        array = new ArrayList<>();
    }

}

```

> ArrayList or Dynamic Array is a resizable array. It's like an array but it's size is not fixed.

3. In the main method create an object from the **Graph** class and add a vertex to the graph.

```java

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.array.get(0).add(new Node('A')); // index of the vertex is 0

    }
}
```

4. To make the adding process easier, create a method called **addVertex** that takes a node as a parameter and add it to the array list of nodes.

```java

public void addVertex(Node node) {
        LinkedList<Node> nodeList = new LinkedList<>();
        nodeList.add(node);
        array.add(nodeList);
}

```

5. Call **addVertex** in the main method, and pass the node A as a parameter.

```java

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addVertex(new Node('A')); // index of the vertex is 0

    }
}
```

6. Create a method called **addEdge** that takes two parameters, the first one is the source node and the second one is the destination node. And add the destination node to the source node.

```java

public void addEdge(int src, int dst) {
        
        LinkedList<Node> currentList = array.get(src); // list type
        Node dstNode = array.get(dst).get(0); // node type
        currentList.add(dstNode);

    }

```

7. Call **addEdge** in the main method.

```java

Graph graph = new Graph();

graph.addVertex(new Node('A')); // 0
graph.addVertex(new Node('B')); // 1
graph.addVertex(new Node('C')); // 2
        
graph.addEdge(0, 1);
graph.addEdge(1, 1);
graph.addEdge(1, 2);

```

8. Create a method called **print** that prints the graph using adjacency list.

```java

public void print() {
        for (LinkedList<Node> list : array) {
            for (Node node : list) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }

```

9. Call **print** in the main method.

```java 

public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addVertex(new Node('A')); // 0
        graph.addVertex(new Node('B')); // 1
        graph.addVertex(new Node('C')); // 2


        graph.addEdge(0, 1);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);


        graph.print();
}

```

**Output**

```

A -> B -> 
B -> A -> C -> 
C -> 

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
