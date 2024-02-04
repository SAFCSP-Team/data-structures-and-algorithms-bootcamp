
# Selection Sort Algorithm

Imagine you are **organizing** a stack of `flashcards` with numbers written on them. The numbers are randomly arranged, and you want to sort them in **ascending order** using the `selection sort algorithm`.

## Concept

The `selection sort` algorithm is a simple sorting algorithm that works by repeatedly selecting the minimum (or maximum) element from the unsorted part of the array and swapping it with the first unsorted element. This gradually builds up a sorted portion of the array.

[image]()

Here's how the selection sort algorithm can be applied to the flashcards scenario:
> partition point or boundary represents the point of division between the sorted and unsorted sections of the flashcards.

You begin with the unsorted section, which contains all the flashcards with numbers: `8, 3, 2, 9, 7`. The sorted section is **initially empty**.

* Step 1: Find the `smallest` number in the unsorted section.

  You scan through the flashcards and find the card with the smallest number, it's 2.

* Step 2: **Replace** the smallest number with the first number in the unsorted section `8, 3, 2, 9, 7`.

   * unsorted section: ` 8, 3, 9, 7`

   * Sorted section: `2`

* Step 3: **Move** the boundary between the sorted and unsorted sections to the right.

   * The flashcard with 2 is now in the sorted section, and the remaining unsorted section contains the flashcards: `8, 3, 9, 7`

Repeat Steps 1 to 3 until the entire stack is sorted.

In the next iteration:

The smallest number in the unsorted section is `3`

Replace the flashcard with 3 with the first flashcard in the unsorted section.

Unsorted section: `8, 9, 7`

Sorted section: `2, 3`

After moving the boundary:
Unsorted section: `8, 9, 7`

Sorted section: `2, 3`

In the subsequent iterations, you continue to find the smallest number in the unsorted section, swap it with the first number in the unsorted section, and move the boundary.

Unsorted section: `8, 9, 7`

Sorted section: `2, 3`

Unsorted section: `8, 9`

Sorted section: `2, 3, 7`

Unsorted section: `9`

Sorted section: `2, 3, 7, 8`

Finally, after the last iteration:
Unsorted section: (empty)
Sorted section: `2, 3, 7, 8, 9`



## Example

* The `selectionSort` method implements the selection sort algorithm by iterating through the array and finding the minimum element in the unsorted part of the array. It then swaps that element with the first element in the unsorted part. This process is repeated until the entire array is sorted.

```java  
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            /* Find the index of the minimum element in the unsorted part of the array */
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            /* Swap the found minimum element with the first element */
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
```
* In the main method, an array of numbers is initialized, and the unsorted array is printed, The `selectionSort` method is called to sort the array and then the sorted array will be printed it."

```java
  public static void main(String[] args) {
        int[] numbers = {9, 2, 5, 1, 7, 4};

        System.out.println("Unsorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        /* Call the selectionSort method */
        selectionSort(numbers);

        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
```
The output is :
```
Unsorted numbers:
9 2 5 1 7 4
Sorted numbers:
1 2 4 5 7 9
```
## Projects
| Project Title | Deadline |
|:-----------:|:-------------|
| [Selection sort](https://github.com/SAFCSP-Team/selection-sort) | - | 



