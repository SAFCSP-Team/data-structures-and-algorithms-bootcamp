# Single Linked List

### Objectives
In this project, our main goal will be to Understand the fundamentals of a linked list, their operations.
### Concepts
The project solution strongly depends on these concepts as they form the core foundation, highlighting the importance of using the provided resources for a better understanding.
|Concept|	Resources|
|-------|----------|
|What is Difference between an array and a linked list|[Array VS Linked List](https://www.youtube.com/watch?v=Muo0UdwESn4)|
|What is a Linked List  | [linked-list-concept](https://github.com/lamabeta/linked-list/blob/main/resources/linked-list-concept.md), [Linked List in Java](https://medium.com/nerd-for-tech/linked-list-in-java-40f96951097a)  |
|Class LinkedList |[oracle decumention](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) |
| Linked List Implementation|[java Tutorial](https://www.youtube.com/watch?v=SMIq13-FZSE) |

### Problem

Given the head of a singly linked list, reverse the list, and return the reversed list.

### Implementation

Write  the implementation of `reverseList` method  that take a single linked list and returns the reversed list

```java
public class Main {
    public static void main(String[] args) {
        listNode head = new ListNode(1);
        listNode second = new ListNode(2);
        listNode third = new ListNode(3);
        head.next = second;
        second.next = third;
        Solution solution = new Solution();
        ListNode reversedList = solution.reverseList(head);
        }
    }
```
