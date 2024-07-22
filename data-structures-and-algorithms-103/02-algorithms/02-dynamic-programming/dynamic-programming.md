# Dynamic Programming
A dynamic programming is a algorithm technique that is used to solve problems. by breaking the problem into a smaller subproblems then solve each subproblem once and store the solution to avoid redundancies, so we can have an `optimal solution`.

> * Why we use dynamic programming? To optimize the time complexity of an algorithm from `O(2^n)` to `O(n)` or `O(n^2)`. 
> * By using dynamic programming we can find the number of ways to do something, and find an optimal solution to a problem. 


## Steps to Solve Dynamic Programming Problems
1. **Identify the subproblems**: Break down the problem into smaller subproblems.
2. **Solve each subproblem once and store the solution**: Use the `memoization` technique to store the solution of the subproblems to avoid redundancies.
3. **Solve the main problem**: Solve the main problem by using the solutions of the subproblems.


## Example
Let's take an example of Airline Ticket Price problem. airline companies often use dynmaic pricing to adjust the price of tickets based on the demand and the time left before the flight. 

**First**: break down the problem into smaller subproblems: 

1. We have a list of flights with their prices.
2. We have a list of days left before the flight.
3. We have a list of the maximum number of tickets we can buy. 

**Second**: solve each subproblem once and store the solution to avoid redundancies, this process is called `memoization`.

**Third**: solve the main problem by using the solutions of the subproblems.


## Implementation 

### Problem 1:
Solving Fibonacci sequence using Dynamic Programming.

> * Fibonacci sequence is a series of numbers that the next number is sum of the two prvious numbers subtracting the first number by -1 and the second number by -2, F n-1 + F n-2.
> * Fibonacci sequence are 1, 1, 2, 3, 5, 8, 13, 21, 34,... .
> * Example: The fibonacci sequence of 6 = 3 + 5 = 8.


First, let's solve the fibonacci sequence using recursion.
```java
class Main {
  public static void main(String[] args) {
     
    System.out.println(fib(6));
  }
  
  public static int fibonacci(int number) {
      if(number <= 2) {
        return 1;
      } else {
        // Fibonacci formula  fib(n) = fib(n-1) + fib(n-2)
        return fibonacci(number - 1) + fibonacci(number - 2);
      }
    }
}
```
Output: `8`

Although the output is correct, but the time complexity of the algorithm is `O(2^n)` which is not optimal, if we want to calculate the fibonacci sequence of 50, it will take a long time to get the result.

Notice that we have redundancies in the solution, for example, the fibonacci sequence of 3 is calculated twice, and the fibonacci sequence of 2 is calculated three times.

Remember step two of dynamic programming which is the `memoization` technique to store the solution of the subproblems to avoid redundancies. Let's implement the memoization technique to the solution.


```java
import java.util.HashMap;
import java.util.Map;

class Main {

  private static Map<Integer, Integer> memo = new HashMap<>();


    public static void main(String[] args) {
        System.out.println(fibonacci(50)); // Example usage
    }

    public static int fibonacci(int number) {
      // Check if the number is already solved
        if (memo.containsKey(number)) {
            return memo.get(number);
        }

        int result;
        if (number <= 2) {
            result = 1;
        } else {
            result = fibonacci(number - 1) + fibonacci(number - 2);
        }

        // Save the result in the memo
        memo.put(number, result);
        return result;
    }

}
```

> * Remember to use the `memoization` technique to store the solution of the subproblems to avoid redundancies.
> * `memoization` is a latin word that means "remembering".

## Projects
| Project Title | Deadline |
:-----------:|:-------------|
|[Dynamic Programming](https://github.com/SAFCSP-Team/)|