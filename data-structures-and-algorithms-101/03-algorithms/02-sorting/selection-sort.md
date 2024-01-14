
# Selection Sort Algorithm

Imagine you are organizing a stack of flashcards with numbers written on them. The numbers are randomly arranged, and you want to sort them in ascending order using the selection sort algorithm.

## Concept

The `selection sort` algorithm is a simple sorting algorithm that works by repeatedly selecting the minimum (or maximum) element from the unsorted part of the array and swapping it with the first unsorted element. This gradually builds up a sorted portion of the array.

[image]()

Here's how the selection sort algorithm can be applied to the flashcards scenario:

You begin with the unsorted section, which contains all the flashcards. The sorted section is **initially empty**.

Step 1: Find the `smallest` number in the unsorted section.

You scan through the flashcards and find the card with the smallest number, let's say it's 5.

Step 2: **Swap** the smallest number with the first number in the unsorted section.
You swap the flashcard with 5 with the first flashcard in the unsorted section.

Unsorted section: ` 8, 3, 2, 9, 7`

Sorted section: `5`

Step 3: **Move** the boundary between the sorted and unsorted sections to the right.

The flashcard with 5 is now in the sorted section, and the remaining unsorted section contains the flashcards: `8, 3, 2, 9, 7`

Unsorted section: `8, 3, 2, 9, 7`

Sorted section: `5`

Repeat Steps 1 to 3 until the entire stack is sorted.

In the next iteration:

The smallest number in the unsorted section is `2`

Swap the flashcard with 2 with the first flashcard in the unsorted section.

Unsorted section: `8, 3, 9, 7`

Sorted section: `2, 5`

After moving the boundary:
Unsorted section: `8, 3, 9, 7`

Sorted section: `2, 5`

In the subsequent iterations, you continue to find the smallest number in the unsorted section, swap it with the first number in the unsorted section, and move the boundary.

Unsorted section: `8, 9, 7`

Sorted section: `2, 5, 3`

Unsorted section: `8, 9`

Sorted section: `2, 5, 3, 7`

Unsorted section: `9`

Sorted section: `2, 5, 3, 7, 8`

Finally, after the last iteration:
Unsorted section: (empty)
Sorted section: `2, 3, 5, 7, 8, 9`



## Example

* The `selectionSort` method implements the selection sort algorithm by iterating through the array and finding the minimum element in the unsorted part of the array. It then swaps that element with the first element in the unsorted part. This process is repeated until the entire array is sorted.

```java  
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
```
The output is :
```
Original Array: 5 2 4 6 1 3 
Sorted Array: 1 2 3 4 5 6
```
## Projects


