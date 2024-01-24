# Merge Sort Algorithm 

## Concept
`Merge sort` is a popular sorting algorithm that follows the `divide-and-conquer` approach to sort a list of things, like numbers, in a particular order. It works by dividing the list into smaller parts, sorting those parts, and then combining them back together to get the final sorted list. 

[image]()

Imagine you have a list of numbers `[5, 1, 3, 9, 4, 2, 7, 6]`.

The steps  to sort them using merge sort are as follows:


1. **Divide**:  divide the list into two halves.
```  [5, 1, 3, 9],  [4, 2, 7, 6]. ```

2. **Sort**: Now, you focus on each half separately. You repeat the process of dividing and sorting for each half until you reach the smallest possible parts. 
```
divide [5, 1, 3, 9] into [5, 1] and [3, 9]. We sort those smaller parts to get [1, 5] and [3, 9].
Similarly, with the second part [4, 2, 7, 6] to get [2, 4] and [6, 7].
```



3. **Merge**: Once you have sorted the smaller parts, you start merging them back together. You compare the numbers from both parts and put them in the correct order. You keep doing this until you have merged all the parts into one big sorted list.


```
We merge the two halves [1, 5] and [3, 9] to get [1, 3, 5, 9]. 
and merge [2, 4] and [6, 7] to get [2, 4, 6, 7]
```
Merging them back together, you obtain the final sorted list: `[1, 2, 3, 4, 5, 6, 7, 9]`.

## Implementation

Here's an example of sorting elements of an array using the `Merge Sort` algorithm  in Java:

```java
public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        /* Divide the array into two halves */
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        /* Recursively sort the two halves */
        mergeSort(left);
        mergeSort(right);

        /* Merge the sorted halves */
        merge(arr, left, right);
    }
```
The `mergeSort` method, recursively sorts the given array by dividing it into two halves, and `mergeSort` is called recursively on each half. Otherwise, if the array has only one element or is empty, it is already sorted, so the method returns.

```
Use the System.arraycopy() method to copy the elements from the original array to the left and right arrays. 
The left array will contain the elements from index 0 to mid-1.
The right array will contain the elements from mid to the end of the array.
```

```java
public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        /* Copy the remaining elements of left[] if any */
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        /* Copy the remaining elements of right[] if any */
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
```
The `merge` method combines the sorted sub-arrays into a single sorted array. It takes three parameters: the original array and two subarrays (left and right) that are already sorted.
The method combines the elements from the left and right subarrays in the correct order and places them back into the original array.

## Example

The `mergeSort` method takes an integer array (arr) as a parameter and sorts it using the merge sort algorithm.

```java

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, temp, left, mid);         /* Sort left subarray */
            mergeSort(arr, temp, mid + 1, right);   /* Sort right subarray */
            merge(arr, temp, left, mid, right);    /* Merge both sorted subarrays */
        }
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        /* Copy elements to the temporary array */
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }
        
        int i = left;        /* Pointer for the left subarray */
        int j = mid + 1;    /* Pointer for the right subarray */
        int k = left;      /* Pointer for the merged array */

        /* Merge the two subarrays by comparing elements */
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

         /* Copy the remaining elements from the left and right subarrays */

        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
        
        while (j <= right) {
            arr[k] = temp[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 5, 1, 3, 8, 4, 2, 7, 6 };
        System.out.println("Original array: ");
        printArray(arr);
        mergeSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}



```

## Projects
| Project Title | Deadline |
|:-----------:|:-------------|
| [Merge sort](https://github.com/SAFCSP-Team/merge-sort) | - | 


