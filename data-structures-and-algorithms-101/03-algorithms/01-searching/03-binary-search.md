# Binary Search
 let`s play the [Guess Number Game](https://mdn.github.io/learning-area/javascript/introduction-to-js-1/first-splash/number-guessing-game.html).

> is a simple game where the player tries to guess that number within a limited number of attempts (in this case, 10). and the program provides feedback on whether the guess is too high or too low.

What did you do when the Last guess was too low! Did you continue to guess numbers smaller than the last number, or did you ignore them and start trying larger numbers?

## Concept
The "guess number game" is a popular example that demonstrates the application of the Binary Search algorithm. The Binary Search algorithm is used to efficiently narrow down the search space and find the correct number with fewer attempts.

The key idea behind Binary Search is to divide the search space in half at each step. By comparing the middle element with the target, we can determine whether the target is in the first half or the second half of the list. This approach allows us to eliminate half of the remaining elements with each comparison, making the search process very efficient.

#### Here's how the Binary Search algorithm works  in a step-by-step manner:

1. Imagine you have a sorted array of numbers. Let's say the array is [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] and the target is 70.

2. Set two pointers, “low” and “high,” to the first and last indices of the list, respectively.

3. Calculate the middle index as the average of the low and high indices: `mid = (low + high) // 2`.
<img width="910" alt="Binary Search" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/03-algorithms/01-searching/resources/binary-search-01.png" />
4. Compare the middle element with the target element that you are searching for.
<img width="910" alt="Binary Search" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/03-algorithms/01-searching/resources/binary-search-02.png" />

- If the middle element is equal to the target element, the search is successful, and the element is found.
 
- If the middle element is greater than the target element, the target element must be in the lower half of the list. Update the high pointer to `mid - 1` and repeat from step 3.
 
- If the middle element is less than the target element, the target element must be in the upper half of the list. Update the low pointer to `mid + 1` and repeat from step 3.

5. Repeat steps 3 and 4 until the target element is found or If the low pointer exceeds the high pointer, the target element is not present in the list.

A pseudocode representation of the binary search algorithm:
```
function BinarySearch(list, target):
    low = 0
    high = length(list) - 1
    
    while low <= high:
        mid = (low + high) / 2
        
        if list[mid] == target:
            return mid  // Found the target element at index mid
        else if list[mid] < target:
            low = mid + 1  // Target is in the upper half of the array
        else:
            high = mid - 1  // Target is in the lower half of the array
    
    return -1  // Target element not found in the array
```
In this pseudocode, the list represents the list in which we are performing the search, and the target is the element we are searching for.

> You can translate this pseudocode into your preferred programming language to implement the Sequential Search algorithm.

## Example 


## Projects

|Project Title | Deadline |
|:-----------:|:-------------|
|[text](-) | - | 



