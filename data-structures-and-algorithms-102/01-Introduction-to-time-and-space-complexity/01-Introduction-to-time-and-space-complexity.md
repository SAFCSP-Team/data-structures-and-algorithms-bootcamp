# Introduction to Time and Space Complexity

<!--- Why is there more than one way to write/perform an algorithm --->
We know that in order to solve a problem, we need to write an algorithm. But, what if we have more than one algorithm to solve the problem, e.g. sorting an array, we can use **bubble sort, or merge sort**, and so on.

So, we have more than an algorithm that solves a problem, we need to know how to measure the performance of an algorithm and compare them to determine which one is the best for a given problem.

It's the **algorithm's efficiency**, and when we say efficiency, we mean **time complexity and space complexity.**


## Contact 
<!--- What is time and space complexity --->
`Time complexity` it's the **time** that an algorithm takes to complete a task. 

`Space complexity` it's the **space in memory** that an algorithm takes to complete a task.


So, `time complexity` and `space complexity` are the **two main factors that affect the performance** of our algorithm, and **choosing the best algorithm for a given problem is based on it**.

<!--- What is the purpose of time and space complexity --->

Each computer runs the algorithm faster than the other, that's because they have different hardware capabilities, and that's why we need to have a way to measure the time and space complexity regardless of the hardware capabilities. 


<!--- Note CPU, Memory --->
> * Time complexity depends on the CPU speed and the number of instructions that the CPU can execute in a given time.
> * Space complexity depends on the memory size and the number of variables that the algorithm uses.


<!--- Link the big O --->

We can measure the time and space complexity for each algorithm regardless of the hardware capabilities by using the `big O notation`.


### Big O notation

`Big O notation` is a mathematical notation used to describe the performance of an algorithm and express how its running time or space requirements grow with the input size. 

By utilizing Big O notation, we can compare the efficiency of different algorithms and make informed decisions about algorithm optimization.

Big O notation is represented as O(f(n)), where 'f(n)' represents the growth rate of the algorithm and 'n' represents the input size. The 'O' symbolizes the upper bound of the growth rate.

It's important to understand that Big O notation gives an upper bound on the growth rate of an algorithm. It focuses on the worst-case scenario, assuming that the algorithm takes the maximum time or space for any input.

The key time and space complexities:

1. **O(1)** `Constant time`: The algorithm's running time remains constant, regardless of the input size. An example is accessing an element in an array by its index. Regardless of the size of the array, the time taken to access the element remains constant.


2. **O(log n)** `Logarithmic time`: The running time grows logarithmically with the input size. As the input size increases, the running time increases, but at a progressively slower rate. An example is Binary search on a sorted array Recursive calls split the problem in half, reducing the time required decreases.

3. **O(n)** `Linear time`: The running time grows linearly with the input size. If the input size doubles, the running time will also roughly double. Examples include iterating through an array or performing a linear search.

4. **O(N log N)** `Linearithmic Time`: The running time grows in proportion to the number of elements multiplied by the logarithm of the number of elements. This complexity often arises in efficient sorting algorithms like merge sort or quicksort.


5. **O(n^2)** `Quadratic time`: The running time grows quadratically with the input size. If the input size doubles, the running time will roughly increase by a factor of four. Examples include nested loops.


6. **O(2^n)** `Exponential time`: The running time grows exponentially with the input size. This represents algorithms with very slow performance as the input size increases. for example, the `Fibonacci` function due to it makes two recursive calls for each level of recursion. This means that the number of recursive calls doubles with each increase in the input size.

- For instance, if you call Fibonacci(5), the function will make 15 recursive calls. However, if you call Fibonacci(10), it will make 1,023 recursive calls.

>  `Fibonacci`  function calculates the n-th number in the Fibonacci sequence recursively. The Fibonacci sequence is defined as follows: each number is the sum of the two preceding ones, starting from 0 and 1.


## Example 

## project
