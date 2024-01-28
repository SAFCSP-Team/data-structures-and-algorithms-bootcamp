# Quick Sort Algorithm
Imagine you have a stack of unsorted papers with different numbers written on them, and you want to arrange them in ascending order. Each paper represents a task, and the numbers on the papers indicate their priority. You want to use `Quick Sort` to efficiently sort the tasks **based on their priority**.

 Here's how Quick Sort can be applied to this **scenario**:

**Select a Pivot:** Choose a random paper from the stack as the pivot.

**Partitioning:** Divide the remaining papers into two groups - one group with tasks having higher priority than the pivot and the other group with tasks having lower priority. Place the pivot paper in its correct sorted position.

**Recursive Sorting:** Recursively apply the above steps to the two groups of papers until each group contains only one paper.

**Combine:** As the recursive calls return, combine the sorted groups of papers to obtain the final sorted stack.

By using `Quick Sort`, you can efficiently sort the stack of papers based on the priority numbers. This allows you to easily identify and work on tasks in the order of their importance, helping you effectively manage your workload.

## Concept

`Quick sort` is a widely used and efficient sorting algorithm that follows the divide-and-conquer paradigm. It works by selecting a pivot element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. 

[image]()

 the Pivot can be Picked as the first, last element or can be a random element.

Let's see how this would play out with a stack of papers and their names:

Unsorted stack: `[Sarah, Mark, Emma, John, Alex, Lisa]`

Step 1: Select a pivot.

Let's say we randomly choose "Emma" as the pivot.

Step 2: Partition the papers.

You compare each name to the pivot ("Emma") and place them on the left or right side accordingly:
Names smaller than "Emma" go to the left: [Alex, Emma]
Names larger than "Emma" go to the right: [Mark, John, Sarah, Lisa]

Step 3: Recursively apply steps 1 and 2.

Now, you have two smaller stacks: [Alex, Emma] and [Mark, John, Sarah, Lisa].
You repeat steps 1 and 2 for each smaller stack.
For the [Alex, Emma] stack:

Select "Alex" as the pivot.

Partition the remaining names: `[Alex, Emma]`
For the `[Mark, John, Sarah, Lisa]` stack:

Select "John" as the pivot.

Partition the remaining names: `[John, Mark, Sarah, Lisa]`
Now, you have the following smaller stacks:

* `[Alex, Emma]`
* `[John, Mark, Sarah, Lisa]`
For each smaller stack, you repeat steps 1 and 2 until you have individual papers or stacks with only one paper in them.

Combine the sorted stacks.

Once all the smaller stacks are sorted, you combine them to obtain the fully sorted stack of papers: 

`[Alex, Emma, John, Lisa, Mark, Sarah]`
  
## Example 
```java
public class QuickSort {

    /* Function to swap two elements */
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* Function to partition the array and return the pivot index */
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; /* Choosing the last element as the pivot */
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    /* Function to perform Quick Sort */
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            /* Recursively sort the left and right sub-arrays */
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

```

## Projects

|Project Title | Deadline |
|:-----------:|:-------------|
|[Quick Sort](https://github.com/SAFCSP-Team/quick-sort) | - | 


