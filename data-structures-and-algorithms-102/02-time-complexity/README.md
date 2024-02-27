# Time complexity

We will learn how to **calculate** the time complexity of a piece of code using big O notation.

## Concept     
Time complexity in Big O notation measures how an algorithm’s running time increases with the size of its input.   
<br/>
### Statements run time 
Each line of your code takes a certain time to run, and we can calculate the time for each statement by defining the type of the statement first.   
<br/>
1. Assignment, operations (+,-,*,etc...)   
It takes (1) time complexity   
     
```java
int x = 1;  // 1
x = 1 + 2;  // 1 assignment + 1 addition(+)
x = y;      // 1
```   
The time complexity for the above code is **O(1)**   
<br/>
   
2. Comparison   
It takes (1) time complexity
   
```java
if (condition){}  // 1 comparison
```
The time complexity for the above code is **O(1)**   
<br/>
    
3. Return   
It takes (1) time complexity  
```java   
return result;    // 1 
```
The time complexity for the above code is **O(1)**  
<br/>

4. Loop   
Its time depends on how many iterations the loop will do.   
The following code will take (n) time complexity.    
      
```java   
for (i = 1; i <= n; i++){} // 1 assignment, (1 comparison + 1 increment) done n times
```

- The loop will iterate till the `i` value reaches the `n` value, as the comparison is (i <= n).
- (i = 1) 1 assignment.
- ( i<=n ) 1 comparison, done `n` times as the comparison will be performed in each iteration.
- ( i++ )  1 increment, done `n` times as the incrementation will be performed in each iteration.
- The time complexity for the above code is   
-> T(1 + (1 + 1) * n )   
-> T(1 + 2n)   
-> T(n)   
-> **O(n)**   
<br/>
<br/>

### Big O rules and examples   
Big O follows the rules listed below in time calculations


1. Ignore constant

```java
int x = 0;                     // 1 assignment
for ( i = 1; i<=n; i++){       // 1 assignment, (1 comparison + 1 increment) done n times {( 1+(1+1)*n )}
x = i + 1;                     // ( 1 assignment + 1 addition(+) ) done n times           {( (1+1)*n )}
}
```
- Time calculation  
-> T(1 + (1 + 1)*n + (1 + 1)*n)   
-> T(1 + 2n + 2n)   
-> T(1 + 4n)   
-> Ignore constant (1, 4)      
-> T(n)     
-> **O(n)**
<br/>
   
2. Drop lower values   
   
```java
for (i = 1; i <= n; i++){       // 1 assignment, (1 comparison + 1 increment) done n times                          //{( 1+(1+1)*n )}
    for (j = 1; j <= n; j++){   // 1 assignment done n times, (1 comparison + 1 increment) done n * n times         //{( 1*n + (1+1)n*n )}
        x = y + z;              // (1 assignment + 1 addition(+))  done n * n times                                 //{( (1+1)n*n )} 
      }
}
```


- Time calculation  
-> T(1 + 2n + n + 2n^2 + 2n^2)   
-> T(1 + 3n + 4n^2)   
-> Drop lower values (3n), Ignore constant (1, 4)   
-> T(n)   
-> **O(n^2)**
<br/>
   
3. Variables are combined only if they refer to the same input   
   
```java
int a = 0;
int b = 0;

for (i = 1; i <= n; i++){       // 1 assignment, (1 comparison + 1 increment) done n times                          //{( 1+(1+1)*n )}
        a = a + 1;              // (1 assignment + 1 addition(+))  done n times                                     //{( {( 2n )} 
}

for (i = 1; i <= m; i++){       // 1 assignment, (1 comparison + 1 increment) done m times                          //{( 1+(1+1)*m )}
        b = b + 1;              // (1 assignment + 1 addition(+))  done m times                                     //{( {( 2m )} 
}
```
   
- T(1 + 2n + 2n + 1 + 2m + 2m)   
-> Variables are combined only if they refer to the same input (2n, 2n), (2m, 2m)       
-> T(2 + 4n + 4m)   
-> Ignore constant (2, 4, 4)   
-> T(n + m)    
-> **O(n + m)**
<br/>
   
4. Always take the worst-case time complexity      

Consider the below pseudocode      
```java  
if (condition){
for (i = 1; i <= n; i++){       // 1 assignment, (1 comparison + 1 increment) done n times    {( 1+(1+1)*n )} -> O(n)
}
} else {
x = 8;                          // 1 assignment                                                   {(1)}       -> O(1)
}
```

The time complexity for the above code is **O(n)** as it is the worst-case.   
O(n) > O(1).  
<br/>
<br/>



## Example   
In this section, we will take a piece of code and enhance its time complexity to be faster.   
<br/>


The below example finds the maximum value in an array of integers   
   
```java
    public static int findMax(int[] arr) {
        int max = 0;                                                                    // {( 1 )}
        for (int i = 0; i < arr.length; i++) {                                          // {( n )}
            if (arr[i] > max) {                                                         // {( n )}
                max = arr[i];                                                           // {( n )}
            }
        }
        return max;                                                                     // {( 1 )} 
    }

```

- Time calculation   
-> T(1 + 3n + 1)   
-> T(2 + 3n)   
-> T(n)   
-> **O(n)**     
<br/>

We can use a divide-and-conquer approach to enhance the time complexity to find the maximum element. This approach splits the array into smaller subarrays, recursively finds the maximum in each subarray, and then compares the maximum values obtained. This approach has a time complexity of O(log n):   
   
```java
    public static int findMax(int[] arr, int low, int high) {
        if (low == high) {                                                               // {( 1 )}
            return arr[low];                                                             // {( 1 )}
        }

        int mid = low + (high - low) / 2;                                                //  {( 1 )}
        int leftMax = findMax(arr, low, mid);                                            // {( Log n )}
        int rightMax = findMax(arr, mid + 1, high);                                      // {( Log n )}

        return Math.max(leftMax, rightMax);                                              //  {( 1 )}
    }
```

- Time calculation   
-> T(1 + 1 + 1 + log n + log n + 1)   
-> T(4 + 2 log n)   
-> T(log n)     
-> **O(log n)**

  
In this enhanced version, the findMax method takes the array, the low index, and the high index as parameters. It checks if the low index is equal to the high index, which indicates a single element, and returns that element as the maximum.

If the low index is not equal to the high index, the method calculates the midpoint and recursively finds the maximum in the left and right subarrays. Finally, it compares the maximum values obtained from the subarrays using the Math.max function and returns the overall maximum.

By implementing this enhancement, we reduce the time complexity from O(n) to O(log n) and achieve a more efficient algorithm for finding the maximum element in an array.


<br/>

## Projects

Project Title | Deadline |
|:-----------:|:-|
|[Time calculation project](https://github.com/SAFCSP-Team/time-complexity-project) || 




