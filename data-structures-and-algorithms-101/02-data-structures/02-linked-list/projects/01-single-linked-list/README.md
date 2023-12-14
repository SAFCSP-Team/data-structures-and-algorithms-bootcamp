# Single Linked List

### Objective
In this project, our main goal will be to understand the fundamentals of a linked list, and their operations.
### Concepts
Using the provided resources for a better understanding.
|Concept|	Resources|
|-------|----------|
|Class LinkedList |[oracle decumention](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) |
| Linked List Implementation|[java Tutorial](https://www.youtube.com/watch?v=SMIq13-FZSE) |

### Problem

Given the head of a single linked list primitive type, reverse the list, and return the reversed list.

### Implementation

Write  the implementation of `reverseList` method that takes a single linked list and returns the reversed list

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
