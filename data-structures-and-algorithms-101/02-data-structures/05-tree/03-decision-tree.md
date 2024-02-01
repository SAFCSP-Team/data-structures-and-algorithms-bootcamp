# Decision tree  

## Concept  
A decision tree is one of the binary tree's applications. it's a binary tree associated with the decision process.    
A decision tree helps the program decide whether to take an action or not based on specific actions/questions.   
  
  
## Example   

### Primitive  
   
Let's say you want to decide whether to go on a trip or not? and you want that to be decided based on some questions:  
  
Did your company approve your vacation?   
Is the airline ticket available?   
Do you have the budget for this trip?   
   
Here is how the decision tree should be built as the following (Figure 1) shows:  
  
Figure 1     
<img width="910" alt="Introduction to Decision tree-01" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/05-tree/images/Decision-Tree-Example.jpg">

## Implementation

```java

import java.util.Scanner;
import java.util.Stack;

class Node {

    String question;

    Node right;
    Node left;

    public Node(String question) {
        this.question = question;
        this.right = null;
        this.left = null;
    }
}

public class DecisionTree {

    Node root;

    public DecisionTree(Node root) {
        this.root = root;
    }

    public void addRight(String parentQu, String newNodeData) {

        Node newNode = new Node(newNodeData);
        Node parent = search(parentQu);

        if (parent != null) {

            if (parent.right == null) {
                parent.right = newNode;
                System.out.println(newNodeData + " added successfully");
            } else {
                System.out.println("parent already has a right child");
                return;
            }
        } else {
            System.out.println(parentQu + " parent not fount");
        }

    }

    public void addLeft(String parentQu, String newNodeData) {
        Node newNode = new Node(newNodeData);
        Node parent = search(parentQu);

        if (parent != null) {

            if (parent.left == null) {
                parent.left = newNode;
                System.out.println(newNodeData + " added successfully");
            } else {
                System.out.println("parent already has a right child");
                return;
            }
        } else {
            System.out.println(parentQu + " parent not fount");
        }

    }

    public Node search(String target) {

        if (root == null) {
            System.out.println("Tree is empty");
            return null;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(this.root);

        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();

            if (currentNode.question == target) {
                return currentNode;
            }

            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }

            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }

        }
        return null;
    }

    public static void main(String[] args) {

        /* Add your code here */
        DecisionTree decisionTree = new DecisionTree(new Node("Did your company approve your vacation?"));
        decisionTree.addRight("Did your company approve your vacation?", "Is the airline ticket available?");
        decisionTree.addRight("Is the airline ticket available?", "Do you have the budget for this trip?");
        /* Add your code here */

        System.out.println("---------------------------------------------");

        Node currentNode = decisionTree.root;
        System.out.println(decisionTree.root.question);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Boolean acceptOffer = true;

        while (currentNode.right != null) {


            if ("yes".equalsIgnoreCase(userInput)) {

                currentNode = currentNode.right;
                System.out.println(currentNode.question);
                userInput = scanner.nextLine();
                acceptOffer = true;

            } else if ("no".equalsIgnoreCase(userInput)) {

                acceptOffer = false;
                break;


            } else {

                System.out.println("Invalid input. Please answer with yes or no.");

            }

        }
        scanner.close();

        if(acceptOffer){
            System.out.println("Go on trip");
        }else {
            System.out.println("Don't go on trip");
        }

    }

}

```  
  
After running the above code, the user is asked to answer the 3 questions with either yes or no, let's see the input-output below:  
  
- Action 1: go on the trip
```java

Did your company approve your vacation?  
yes  
Is the airline ticket available?
yes
Do you have the budget for this trip?
yes
Go on trip

```
  
  
- Action 2: don't go on the trip
```java
Did your company approve your vacation?
yes
Is the airline ticket available?
no
Don't go on trip

```


## Projects  

Project Title | Deadline |
|:-----------:|:-------------|
|[Decision tree project](https://github.com/SAFCSP-Team/decision-tree-project) | - | 

