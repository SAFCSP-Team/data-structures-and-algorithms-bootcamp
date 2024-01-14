# Merge sort algorithm 

## Concept
`Merge sort` is a popular sorting algorithm that follows the divide-and-conquer approach to sort a list of things, like numbers, in a particular order. It works by dividing the list into smaller parts, sorting those parts, and then combining them back together to get the final sorted list. 

[image]()

Imagine you have a list of numbers [5, 1, 3, 9, 4, 2, 7, 6].

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
Merging them back together, you obtain the final sorted list: [1, 2, 3, 4, 5, 6, 7, 9].



## Examples


## Projects
