# Depth First Search 

# Concept
Depth First Search is a graph traversal algorithm that traverses the graph in a depthward motion and uses a stack to remember to get the next vertex to start a search when a dead end occurs in any iteration.

<!-- Theory Image to support the explation -->

# Implementation



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
