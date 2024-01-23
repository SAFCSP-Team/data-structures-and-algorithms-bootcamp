
# Insertion Sort Algorithm

Insertion sort is similar to how you would sort playing cards. You start with an empty left hand and the cards face down on the table. Then you remove one card at a time from the table and insert it into the correct position in the left hand. To find the correct position for a card, you compare it with each of the cards already in the hand. At all times, the cards held in the left hand are sorted.

An array is split into two parts: sorted and unsorted. Initially, the sorted part just has one element (the first element). Then, we pick an element from the unsorted part and insert it into the sorted part at the correct position. We do this until the unsorted part becomes empty.

## Concept

`Insertion sort` is a simple sorting algorithm that builds the final sorted array one item at a time. It works by iteratively inserting each element into its proper position within the already sorted portion of the data set.


[image]()

Let's look at an example:
```
[4, 3, 2, 10, 12, 1, 5, 6]
```

* The first element is already sorted. So, we pick the second element (3) and compare it with the first element (4). Since 3 is smaller than 4, we swap them. Now, the first two elements are sorted.

```
[3, 4, 2, 10, 12, 1, 5, 6]
```
* Next, we pick the third element (2) and compare it with the first element (3). Since 2 is smaller than 3, we swap them. Then, we compare 2 with 4 and swap them. Now, the first three elements are sorted.

```
[2, 3, 4, 10, 12, 1, 5, 6]
```
We continue this process until the unsorted part becomes empty.


## Implementation 

 Before we implement the code, here's how the insertion sort algorithm works:

1. Start with the second element (index 1) of the array. Assume that the first element (index 0) is already sorted. 
2. Compare the second element with the previous element. If the second element is smaller, swap them. Otherwise, leave them as they are. Now, the first two elements are sorted in ascending order. 
3. Move to the next unsorted element (index 2) and repeatedly compare it with the elements before it. Swap it with the previous element until it reaches its correct position.
4. Repeat this process for all remaining unsorted elements, moving from left to right through the array. 
5. Once all elements are sorted, the array is in ascending order. 
``` java
public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 4, 6, 1, 3};
        
        System.out.print("Original Array: ");
        printArray(numbers);
        
        insertionSort(numbers);
        
        System.out.print("Sorted Array: ");
        printArray(numbers);
    }
    
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            /* Move elements of arr[0..i-1] that are greater than key, to one position ahead of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = key;
            
            /* Print array after each iteration */
            System.out.print("Iteration " + i + ": ");
            printArray(arr);
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

```

The output

```
Original Array: 5 2 4 6 1 3 
Iteration 1: 2 5 4 6 1 3 
Iteration 2: 2 4 5 6 1 3 
Iteration 3: 2 4 5 6 1 3 
Iteration 4: 1 2 4 5 6 3 
Iteration 5: 1 2 3 4 5 6 
Sorted Array: 1 2 3 4 5 6 
```
## Projects
| Project Title | Deadline |
|:-----------:|:-------------|
| [Insertion sort](https://github.com/SAFCSP-Team/insertion-sort/tree/main) |-| 

