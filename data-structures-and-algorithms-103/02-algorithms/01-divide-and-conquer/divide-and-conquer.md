# Divide and Conquer Algorithm

Imagine you have a deck of cards that needs to be sorted in ascending order, by applying the divide and conquer approach to sort a deck of cards

* `divide` the deck into smaller subgroups.
* `conquer` each subgroup by sorting them independently.
* `combine` the sorted subgroups by merging them back together, and finally obtain a fully sorted deck.

## Concept

Divide and Conquer is a problem-solving technique that involves breaking a larger problem into subproblems, solving the subproblems independently, and combining the solutions of those subproblems to get the solution of the larger problem.

A divide-and-conquer is a technique of estimating a large problem by:

* Splitting the problem into sub-parts (divide)
* Resolving the related problems (conquer)
* Mixing them together will produce the final output (combine)




https://github.com/user-attachments/assets/5d25309d-18fa-4955-b34e-6b7f82935cd0




there are some algorithms that follow the divide-and-conquer algorithm like `Quick Sort` and `Merge Sort`.

## Implementation

we find the maximum number in an array using the divide-and-conquer algorithm

```java

import java.util.Arrays;

public class DivideConquer {


    public static int findMax(int[] numbers){

        if(numbers.length == 1){ //if the array contains only one element return it
            return numbers[0];
        }
    


    int mid = numbers.length/2; //divide the array into two
    int[]left  = Arrays.copyOfRange(numbers,0,mid);
    int[]right = Arrays.copyOfRange(numbers,mid,numbers.length);

    //conquer the array 
    int maxleft = findMax(left);
    int maxright = findMax(right);


    return Math.max(maxleft, maxright);

    }
    public static void main(String[] args) {
        int[] numbers = {16,3,24,47,21,32}; // create the array 
        int max = findMax(numbers); // create variable
        System.out.println("The maximum numbers is: " + max);
        
    }
}
```
The output
```
The maximum number is: 47
```

## Projects
| Project Title | Deadline |
:-----------:|:-------------|
|[Divide and Conquer](https://github.com/SAFCSP-Team/divide-and-conquer-project)|


