# Introduction to recursion   
Recursion is a powerful algorithm used to solve complex programming problems. It will be explained in detail in the following section.  
   
## Concept  
Recursion algorithm is the process of solving programming problems by breaking the problem into smaller ones. It involves the function calling itself in its definition. Recursion could be **single** ( calling it-self once ) or **multiple** ( calling it-self more than once )
   
The recursion algorithm structure must follow 2 main conditions/processes in the function definition:    
1. Base case:   
The condition that breaks the loop and stops the function.    
2. Recursive call:    
A statement that calls the function itself.    

## Example 
 
Factorial:   
The factorial of a non-negative integer N is written as N! and pronounced "N factorial".

The definition of (N!) recursively:    
0! = 1    
N! = N x (N-1)!    
  
For example, let's calculate 3! :  
3! = 3 x 2!   
= 3 x 2 x 1!   
= 3 x 2 x 1 x 0!   
= 3 x 2 x 1 x 1   
  
## Implementaion

- The factorial () function below solves the factorial problem by using the recursion algorithm:

``` java
 public static int Factorial(int n) {
        // Base case: 0! = 1
        if (n == 0) {
            return 1;
        // Recursive call: n! = n * (n-1)!
        } else {
            return n * Factorial(n - 1);
        }
    }
```  

Call the Factorial() function in the main method:
```java
public static void main(String[] args) {
        System.out.println(Factorial(3));
    }
```

Output:
```java
6
```

- print() function below is the same function we used to print the tree values using stack, we will see how we can print tree values using the recursion algorithm instead of stack.
  
1. print() using stack:   
  
```java 
  
// Pre-order traverse
  public void printTreeValues() {

    if (this.root == null) {
      System.out.println("Tree is empty");
      return;
    }

    Stack<Node> stack = new Stack<Node>();
    stack.push(this.root);

    while (!stack.isEmpty()) {
      Node currentNode = stack.pop();

      System.out.print(" " + currentNode.data);

      if (currentNode.right != null) {
        stack.push(currentNode.right);
      }

      if (currentNode.left != null) {
        stack.push(currentNode.left);
      }

    }
    return;
  }

```
2. print() using recursion:   

```java

void print(Node node){
                
        // Base case
        if (node == null)
            return;

        // First print data of node
        System.out.print(node.key + " ");

        // Recursive call on left subtree
        print(node.left);

        // Recursive call on right subtree
        print(node.right);
    }

```



## Projects

|Project Title | Deadline |
|:-----------:|:-------------|
|[Recursion project](https://github.com/SAFCSP-Team/recursion-project) | - | 


