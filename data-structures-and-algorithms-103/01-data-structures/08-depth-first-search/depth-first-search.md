# Depth First Search 

# Concept
Depth First Search is a graph traversal algorithm that traverses the graph in a depthward motion and uses a stack to remember to get the next vertex to start a search when a dead end occurs in any iteration.

<!-- Theory Image to support the explation -->

# Implementation



**Depth First Search** Function:   
   
```java 
public void DFS(int StartVerIndx) {
        // Array to track visited vertices
        boolean[] visited = new boolean[this.vertices.size()];
    
        Stack<Integer> stack = new Stack<>();
        stack.push(StartVerIndx);
    
        while (!stack.isEmpty()) {
            int vertexIndex = stack.pop();
            if (!visited[vertexIndex]) {
                visited[vertexIndex] = true;
                System.out.print(vertices.get(vertexIndex).get(0).data + " ");
    
                LinkedList<Vertex> list = vertices.get(vertexIndex);
                for (int i = 1; i < list.size(); i++) {
                    int adjacentVertexIndex = getVertexIndex(list.get(i).data);
                    if (!visited[adjacentVertexIndex]) {
                        stack.push(adjacentVertexIndex);
                    }
                }
            }
        }
    }
    
    private int getVertexIndex(char data) {
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).get(0).data == data) {
                return i;
            }
        }
        return -1;
    }


```

Main method: 
  
Create the following `graph` and perform the **DFS** on it:   
  
A -> B  
B -> C -> D -> E  
C -> A  
D -> F  
E -> F  
F ->   
  
   
```java

public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addVertex(new Vertex('A'));
        graph.addVertex(new Vertex('B'));
        graph.addVertex(new Vertex('C'));
        graph.addVertex(new Vertex('D'));
        graph.addVertex(new Vertex('E'));
        graph.addVertex(new Vertex('F'));

        // A -> B
        graph.addEdge(0, 1);
        // B -> C
        graph.addEdge(1, 2);
        // C -> A
        graph.addEdge(2, 0);

        // B -> D
        graph.addEdge(1, 3);
        // B -> E
        graph.addEdge(1, 4);

        // D -> F
        graph.addEdge(3, 5);

        // E -> F
        graph.addEdge(4, 5);

        System.out.println(graph.vertices.size());
        graph.DFS(0);

        

    }  
```  
    
Output :
```
A B E F D C
``` 


  
