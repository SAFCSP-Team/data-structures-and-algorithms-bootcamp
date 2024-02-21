
# Space Complexity


## Concept

`Space complexity` refers to the amount of memory or storage space required by an algorithm to solve a problem. It is a measure of the extra space used by the algorithm, beyond the input data, to perform its computations.

## Calculation
 let’s understand how to calculate the space complexity of an algorithm.
 
```
Space Complexity = Auxiliary Space + Space used for input values
```

There is a sort of confusion among people between the space complexity and the auxiliary space. So let’s be clear about that, so auxiliary space is nothing but the space required by an algorithm during the execution of that algorithm and it's not equal to the space complexity because space complexity includes space for input values along with it also.

So we can say that space complexity is the combination or sum up of the auxiliary space and the space used by input values.

let’s determine the space complexity of a program that sums all integer elements in an array:

```java

public int sumArray(int[] array) {
    int size = array.length;
    int sum = 0;

    for (int iterator = 0; iterator < size; iterator++) {
        sum += array[iterator];
    }

    return sum;
}

```

* array – the function’s only argument – the space taken by the array is equal 4n bytes where n is the length of the array
* size – a 4-byte integer
* sum – a 4-byte integer
* iterator – a 4-byte integer
The total space needed for this algorithm to complete is 4n + 4 + 4 + 4 (bytes). The highest order of n in this equation is just n. Thus, the space complexity of that operation is O(n).




Let's take another example:

```java
        //Sum Of N Natural Number
        int sum(int n)
        {
         int i,sum=0;
         for(i=n;i>=1;i--)
         sum=sum+i
         return sum;
        }

```

So in the above example, the input value is 'n' which is constant and will take the space of O(1). Now what about auxiliary space, so it is also O(1) because 'i' and 'sum' are also constants.
Hence total space complexity is O(1).


Space complexity can be expressed in different ways:


1. Constant Space O(1): An algorithm has constant space complexity, denoted as O(1), if it uses a fixed amount of memory that does not depend on the input size. Regardless of the input size, the amount of space used remains constant. For example, algorithms that use a fixed number of variables or a fixed-size array have constant space complexity.


```java

public void printNumbers(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }
}
```

 the `printNumbers` method takes an array of integers as input and prints each element. The space complexity is constant because the memory usage remains fixed, regardless of the size of the input array. The method only requires space for the input array itself and a few variables for iteration.


2. Linear Space O(n): An algorithm has linear space complexity, denoted as O(n), if the amount of memory used is directly proportional to the input size (n). For example, algorithms that create an array or a data structure whose size grows linearly with the input size have linear space complexity.

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

3. Quadratic Space O(n^2): An algorithm has quadratic space complexity, denoted as O(n^2) if the amount of memory used is proportional to the square of the input size. These algorithms often involve nested loops or matrices where the dimensions are determined by the input size.

```java
public void printPairs(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[i] + ", " + numbers[j]);
        }
    }
}
```
The `printPairs` method prints all possible pairs of numbers from the input array. It uses nested loops to iterate over each element of the array twice. As a result, the memory usage grows quadratically with the input size n. For every element in the array, the method requires space to store the pair of numbers being printed.


4. Exponential Space O(2^n): An algorithm has exponential space complexity, denoted as O(2^n), if the amount of memory used grows exponentially with the input size. These algorithms typically involve recursive algorithms with branching paths that create a large number of intermediate solutions.


```java

public int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

## Example

Here's a comparison of Bubble Sort, Insertion Sort, and Merge Sort in terms of their space complexity, along with their implementations 

1. Bubble Sort.

 ```java
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
```

The implementation maintains an input array arr and uses a few variables for comparisons and swaps. The sorting is done directly on the input array without requiring additional memory.

The output

```
space complexity is constant (O(1))
```

2. Insertion Sort:

   
``` java
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
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
||-| 


