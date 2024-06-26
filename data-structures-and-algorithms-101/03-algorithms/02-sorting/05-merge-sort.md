# Merge Sort Algorithm 

## Concept
`Merge sort` is a popular sorting algorithm that follows the `divide-and-conquer` approach to sort a list of things, like numbers, in a particular order. It works by dividing the list into smaller parts, sorting those parts, and then combining them back together to get the final sorted list. 

![202402041653-ezgif com-video-to-gif-converter](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/47e8aa7f-c559-4a9a-8342-7832283159d1)

Imagine you have a list of numbers `[5, 1, 3, 9, 4, 2, 7, 6]`.

The steps  to sort them using merge sort are as follows:


1. **Divide**:  divide the list into two halves.
```  [5, 1, 3, 9],  [4, 2, 7, 6]. ```

2. **Sort**: Now, you focus on each half separately. You repeat the process of dividing and sorting for each half until you reach the smallest possible parts.
   
```
divide [5, 1, 3, 9] into [5, 1] and [3, 9] then [5], [1] and [3], [9]. We sort those smaller parts to get [1], [5] and [3], [9].

Similarly, with the second part [4, 2, 7, 6] to get [2], [4] and [6], [7].
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
> System.arraycopy() copies an array from a source array to a destination array, starting the copy action from the source position to the target position until the 
 specified length.
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

The `mergeSort` method takes an integer array (numbers) as a parameter and sorts it using the merge sort algorithm.

```java
public class MergeSort {
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
    
    public static void main(String[] args) {
        int[] numbers = {9, 2, 5, 1, 7, 4};
        
        System.out.println("Unsorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        
        /* Call the mergeSort method */
        mergeSort(numbers);
        
        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
```

Output is 
```
Unsorted numbers:
9 2 5 1 7 4 
Sorted numbers:
1 2 4 5 7 9 
```

## Projects
| Project Title | Deadline |
|:-----------:|:-------------|
| [Merge sort](https://github.com/SAFCSP-Team/merge-sort) | - | 


