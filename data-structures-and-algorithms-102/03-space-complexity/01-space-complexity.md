
# Space Complexity


## Concept

The `space complexity` of an algorithm refers to the amount of memory or storage space required by the algorithm to perform its computations, it includes the space used by auxiliary data structures as well as the space needed to store input values during the algorithm's execution.

## Calculation

To calculate the space complexity of an algorithm, we consider the auxiliary space used by the algorithm, which refers to any extra or temporary space it requires. Additionally, we factor in the space used by the input values.
 
```
Space Complexity = Auxiliary Space + Space used for input values
```

So we can say that `space complexity `is the combination or sum up of the auxiliary space and the space used by input values.


let’s determine the space complexity of a program that sums all integer elements in an array:
> when you declare variables they occupy memory space based on their size and data type.

![sc3](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/128614ea-474e-4f5b-96d9-3c5dc7cd5ae6)


So how we can enhance the space complexity:

```java
public int sum(int[] array) {
    if (array == null || array.length == 0) {
        return 0;
    }
    return Arrays.stream(array).sum();
}
```
* The `if` statement has a space complexity of O(1).
* The `Arrays.stream` method has a space complexity of O(1).
* The `sum` method has a space complexity of O(1).

  
> we use the Arrays.stream method to create a stream of the elements in the input array and then calculate the sum of the elements using the sum method. So is easier 
  to read, but it requires the use of the Java Streams API.

The space complexity of the `sum` function is `O(1)`.


### Examples of different space complexity:

1. Constant Space `O(1)`
   
```java
 public static int calculateSum(int x, int y) {    // 4 bytes for each variable
        int a = x + y;      // 4 bytes
        return a;   // 4 bytes
    } // 4 + 4 + 4 = 16 bytes
```
* `a` , `x` and `y` : is constant so each of them have a O(1) space complexity.

The space complexity of the `calculateSum` function is O(1).


2. Linear Space `O(n)`

```java
public int[] createArray(int n) {   // 4 bytes
    int[] arr = new int[n];  // 4 * n bytes
    for (int i = 0; i < n; i++) { // 4 bytes
        arr[i] = i;
    }
    return arr; // 4 bytes
}
```

* `int n`: is constant so O(1) space complexity.
* `arr`: is n so the space complexity is linear O(n).
* `i` : is constant so O(1) space complexity.
  
The space complexity of the `createArray` function is O(n).


3. Quadratic Space `O(n^2)`

```java
public int[][] create2DArray(int n) { // 4 bytes
    int[][] arr = new int[n][n]; // 4 * n * n bytes
    for (int i = 0; i < n; i++) {       // 4 bytes
        for (int j = 0; j < n; j++) {  // 4 bytes
            arr[i][j] = i * n + j;
        }
    }
    return arr; // 4 bytes
}
```
 * `int n`: is constant so O(1) space complexity.
 * `arr`: size of n x n so, the space complexity of a 2D array is O(n^2) in this case.
 * `i and j`: is constant so O(1) space complexity.
 
 The space complexity of the `create2DArray` function is O(n^2), 

## Example

Here's a comparison of Bubble Sort and Insertion Sort in terms of their space complexity, along with their implementations 

1. Bubble Sort.

 ```java
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // The variable 'n' has a space complexity of O(1)
        for (int i = 0; i < n - 1; i++) { // The loop counter 'i' has a space complexity of O(1)
            for (int j = 0; j < n - i - 1; j++) { // The loop counter 'j' has a space complexity of O(1)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // The variable 'temp' has a space complexity of O(1)
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
```

The output

```
space complexity is constant (O(1))
```

2. Insertion Sort:

   
``` java
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        // The input parameter 'arr' has a space complexity of O(n), but it is not included in the calculation for the function
        int n = arr.length; // The variable 'n' has a space complexity of O(1)
        for (int i = 1; i < n; i++) { // The loop counter 'i' has a space complexity of O(1)
            int key = arr[i]; // The variable 'key' has a space complexity of O(1)
            int j = i - 1; // The loop counter 'j' has a space complexity of O(1)
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
```

The implementation uses variables such as key and j for element comparisons and shifting. The sorting is performed directly on the input array without needing additional memory.

The output
```
space complexity (O(1))
```






## Projects
| Project Title | Deadline |
|:-----------:|:-|
|[Space complexity project](https://github.com/SAFCSP-Team/space-compexity/tree/main)| |


