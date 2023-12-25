# Introduction to Searching Algorithm
Searching for items is a task that we do every day. If a deck of cards has less than 52 cards, how do you determine which card is missing? 

Imagine you have a list of names written on a piece of paper. To find a particular name, you start from the beginning and read each name one by one until you find the one you're looking for It's simple but may take longer if the name you're searching for is near the end of the list. If the names are arranged in alphabetical order, If the name you're searching for comes after the middle name in alphabetical order, you ignore the first half of the list and focus on the second half. By dividing the list in half each time, you can quickly narrow down the search space until you find the name you're looking for.

## Concept

Searching algorithms are like **plans that help us find what we're looking** for efficiently. They can be used in various real-life situations, from finding information on the internet to solving puzzles. By understanding different search algorithms, you can become better at finding things and solving problems effectively.


 There are lots of different search algorithms but we can divide them into two basic types, algorithms that **don’t make any assumptions about the order** of the list`liner search`, and algorithms that **assume the list is already in order** `binary search`.
 
- `Liner search`: typically involves sequentially scanning the list **from the beginning until the desired element is found or the end** of the list is reached.

- `Binary search`: this algorithm assumes that the list is already in ascending or descending order, and we **leverage the order** of the list to perform more efficient searches **by reducing the search space**. 

<img width="910" alt="binary and linear search" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/03-algorithms/01-searching/rec/binary-and-linear-search-animations.gif" />


## Projects
 Using [Searching Sorted List](https://www.cs.usfca.edu/~galles/visualization/Search.html) to find the value at index 17 using both linear and binary search approaches.
