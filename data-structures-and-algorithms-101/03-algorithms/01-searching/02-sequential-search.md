# Sequential Search

The diagram below shows how this search works. Starting at the first item in the list, we simply move from item to item, following the underlying **sequential ordering** until we either find what we are looking for or run out of items. If we run out of items, we have discovered that the item we were searching for was not present.
<img width="910" alt="Sequential Search" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/03-algorithms/01-searching/resources/sequential-search.png" />

## Concept
In `sequential search`, also known as **linear search**, we **check each item in the list one by one until we find a match or reach the end of the list**. If a matching item is found, **we return its position**. However, if we go through the entire list without finding a match, **we return -1 to indicate that the item was not found**.

The number of **total comparisons** in this algorithm is equal to the size of the **data structure**. If our **data structure has N items**, it takes **N comparisons in the worst case** if the item at the end of the data structure or does not exist.

Pseudocode representation of the Sequential Search algorithm:
```
unction sequentialSearch(list, item):
    for i from 0 to length(list)-1 do:
        if list[i] equals item then:
            return i
    return -1
```
In this pseudocode, the list represents the list in which we are performing the search, and the item is the element we are searching for.
> You can translate this pseudocode into your preferred programming language to implement the Sequential Search algorithm.
## Example 
- Implementing the Sequential Search algorithm in Java for an array:
```java
public class SequentialSearch {
    public static int sequentialSearch(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] Array = {3, 7, 2, 1, 9, 5};
        int searchItem = 9;
        int result = sequentialSearch(myArray, searchItem);
        if (result == -1) {
            System.out.println("Item not found in the array");
        } else {
            System.out.println("Item found at index " + result);
        }
    }
}
```
In the main method, we create an example array **Array** and specify the **searchItem as 9**. We call the sequentialSearch method with these arguments and store the result in the result variable.

- Implementing the Sequential Search algorithm in Java for a linked list:
```java
    public int sequentialSearch(int item) {
        Node current = head;
        int index = 0; // position of the node

        while (current != null) {
            if (current.data == item) {
                return index;  // Return the index if found
            }
            current = current.next;
            index++;
        }

        return -1;  // Return -1 if not found
    }
```


## Projects
|Project Title | Deadline |
|:-----------:|:-------------|
|[text](-) | - | 



