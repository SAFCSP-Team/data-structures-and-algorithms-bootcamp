# Depth First Search 

# Concept
Depth First Search is a graph traversal algorithm that traverses the graph in a depthward motion and uses a `stack` to remember to get the next `vertex` to start a search when a dead end occurs in any iteration.   
  
Consider the below `graph` of vertices of characters :   
  
Image in progress.    
  
Figure 1   
<img width="910" alt="AVL" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-103/01-data-structures/08-depth-first-search/images/fish_4x_720.png">
 
A -> B  
B -> C -> D -> E  
C -> A  
D -> F  
E -> F  
F ->   
   
  
The graph is built by a collection of vertices, and each vertex contains a list.     
Ex:   
- The vertex (A) is a list of (A) -> (B).     
- The vertex (B) is a list of (B) -> (C) -> (D) -> (E).    
   
## The Depth First Search technique:       
- Push the first vertex to the stack (A).     
- Pop and print the vertex (A).  
- Mark (A) as visited.  
- Loop the first list (A) -> (B), and check whether the vertex is traveled or not.    
- Push the first list's **unvisited vertices** until the last vertex (B).       
- The stack now has all the **unvisited vertices** of the first list. (A) is already visited so the stack now has only (B).  
  
Repeat till the end of the vertices   
- Pop and print the vertex (B).   
- Mark (B) as visited.     
- ...   


  
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
  
Create the `graph` in the Figure 1 and perform the **DFS** on it:   
  
  
   
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


## Projects
| Project Title
:-----------:|
|[Depth first search](https://github.com/SAFCSP-Team/depth-first-search-project)|



  
