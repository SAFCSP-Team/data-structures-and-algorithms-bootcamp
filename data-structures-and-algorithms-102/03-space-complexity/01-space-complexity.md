
# Space Complexity


## Concept

`Space complexity` refers to the amount of memory or storage space required by an algorithm to solve a problem. It is a measure of the space used by the algorithm, to perform its computations.

## Calculation
 let’s understand how to calculate the space complexity of an algorithm.
 
```
Space Complexity = Auxiliary Space + Space used for input values
```

 The auxiliary space is nothing but the space required by an algorithm during the execution of that algorithm and it's not equal to the space complexity because space complexity includes space for input values 
 along with it also.

So we can say that space complexity is the combination or sum up of the auxiliary space and the space used by input values.

let’s determine the space complexity of a program that sums all integer elements in an array:

```java

public int sum(int[] array) {
    int sum = 0;
    int[] temp = new int[array.length];
    System.arraycopy(array, 0, temp, 0, array.length);
    array = temp;
    return sum;
}

```
  

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

  
> This code uses the Arrays.stream method to create a stream of the elements in the input array and then calculates the sum of the elements using the sum method. So is easier 
  to read, but it requires the use of the Java Streams API.

The space complexity of the `sum` function is `O(1)`.


### Rules for Calculating Space Complexity

**Variables and data structures take up space:** When you declare variables or use data structures (arrays, objects, etc.) in your code, they occupy memory space based on their size and data type. The space complexity increases with the number and size of variables and data structures used in your program.

**Function calls take up space:** When you call a function, the program needs to allocate memory for the function call stack, which includes function arguments, local variables, return addresses, and other bookkeeping information. Each function call adds to the space complexity, and if you have nested function calls or recursive functions, it can lead to a significant increase in space usage.

### Examples of different space complexity:

1. Constant Space `O(1)`: algorithms that use a fixed number of variables or a fixed-size array have constant space complexity.


```java

public void printNumbers(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }
}
```
* `int[] numbers` - This is an array of integers, the size of an integer (int) is 4 bytes and the size of the array is determined by the length of the array, which is stored as an integer value. 
* `i` - This is an integer variable used as the loop counter. The size of an integer (int) in Java is typically 4 bytes.
* `i++` - loop counter so the size is 4 bytes.

The space complexity of the `printNumbers` function is O(1), 


2. Linear Space `O(n)`: if the amount of memory used is directly proportional to the input size (n).

```java

public int[] createArray(int n) {
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = i;
    }
    return arr;
}
```
The `createArray` method creates an array of size n and assigns consecutive numbers to its elements. The space complexity is linear because the memory usage grows proportionally with the input size n. The method requires space to store the array of size n, as well as a few variables for iteration.

* `int n` - This is an integer value representing the size of the array to be created so n takes 4 bytes.
* `arr` - This is an array of integers with a length of n. The space complexity of an array is proportional to its length, which is n in this case.
* `i` - This is an integer variable used as the loop counter so takes 4 bytes.
* `arr[i] = i` statement - This statement assigns the value of i to the i-th element of the array arr. It does not require any additional memory, as it only performs an operation on the existing data in 
   the array and the loop counter so takes 4 bytes 

 the space complexity of the `createArray` function is O(n)


3. Quadratic Space `O(n^2)`: if the amount of memory used is proportional to the square of the input size. These algorithms often involve nested loops or matrices where the dimensions are determined by the input size.

```java
public int[][] create2DArray(int n) {
    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            arr[i][j] = i * n + j;
        }
    }
    return arr;
}
```
 * `int n` - This is an integer value representing the size of the 2D array to be created so takes 4 bytes.
 * `arr` - This is a 2D array of integers with a size of n x n. The space complexity of a 2D array is proportional to its size, which is n^2 in this case.
 * `i and j` - These are integer variables used as loop counters so each of them takes 4 bytes.
 * `arr[i][j]` - This sssigns the value of i * n + j to the (i, j) element of the array arr. It does not require any additional memory, as it only performs an operation on the existing data in the array 
   and the loop counters.
   
 The space complexity of the create2DArray function is O(n^2), 

## Example

Here's a comparison of Bubble Sort and Insertion Sort in terms of their space complexity, along with their implementations 

1. Bubble Sort.

> The input parameter arr has a space complexity of O(n), but it is not included in the calculation for the function but this array is passed as a parameter to the function, so it is not included in the 
 space complexity calculation of the function. 
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
|:-----------:|:-------------|
|Space complexity project|[Space complexity](https://github.com/SAFCSP-Team/space-compexity/tree/main)| 


