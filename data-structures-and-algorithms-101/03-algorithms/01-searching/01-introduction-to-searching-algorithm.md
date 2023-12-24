# Introduction to Searching Algorithm
Searching for items is a task that we do every day. If a deck of cards has less than 52 cards, how do you determine which card is missing? 

Imagine you have a list of names written on a piece of paper. To find a particular name, you start from the beginning and read each name one by one until you find the one you're looking for It's simple but may take longer if the name you're searching for is near the end of the list. If the names are arranged in alphabetical order, If the name you're searching for comes after the middle name in alphabetical order, you ignore the first half of the list and focus on the second half. By dividing the list in half each time, you can quickly narrow down the search space until you find the name you're looking for.

## Concept

Searching algorithms are like plans that help us find what we're looking for efficiently. They can be used in various real-life situations, from finding information on the internet to solving puzzles. By understanding different search algorithms, you can become better at finding things and solving problems effectively.


 Based on the type of search operation, these algorithms are generally classified into two categories:
 - `Sequential Search`: traversed sequentially and every element is checked. For example: Linear Search.
 - `Interval Search`: These algorithms are specifically designed for searching in sorted data structures. These search algorithms are much more efficient than Linear Search as they repeatedly target the center of the search structure and divide the search space in half. For Example: Binary Search.

<img width="910" alt="binary and linear search" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/03-algorithms/01-searching/rec/binary-and-linear-search-animations.gif" />


## Projects
 Using [Searching Sorted List](https://www.cs.usfca.edu/~galles/visualization/Search.html) to find the value at index 17 using both linear and binary search approaches.
