# One Dimensional Arrays
one-dimensional array, also known as a 1D array or a single-dimensional array, is a linear collection of elements stored in contiguous memory locations 

## Concept
`One-Dimensional Arrays`: These are the simplest and most common type of arrays. Elements are arranged in a single row. [picture one](https://miro.com/welcomeonboard/VmlhamFJYzBvNnF1ZDBHYzhZd2t4WHRuT1VvZnhTWkF0eDRtdUhJSEwxUWVYZHRsWlltaWVrQ0VETlRpcTUwaHwzNDU4NzY0NTcyODA5NjYwMjI5fDI=?share_link_id=27226874419)
- The length of an array called **A** can be accessed using the syntax **A.length** in java or **len(A)** in python.
- To access an element in a one-dimensional array, you use square brackets [] and index that represents the position of an element in the array, A[0] gives the first element in an array called **A** 

## Example 

### Primitive 
- Create One Dimensional Array of numbers called `numbers` : 
```java
int[] numbers = {1, 7, 9, 1, 5};
int count= numbers.length; // Assigns the length of the array to count (5 in this case)
int secondElement = numbers[1]; // Assigns the value at index 1 (7 in this case)
```
[](https://miro.com/welcomeonboard/VmlhamFJYzBvNnF1ZDBHYzhZd2t4WHRuT1VvZnhTWkF0eDRtdUhJSEwxUWVYZHRsWlltaWVrQ0VETlRpcTUwaHwzNDU4NzY0NTcyODA5NjYwMjI5fDI=?share_link_id=27226874419)

### non-primitive
Consider a class called "Person" that represents a person's name and age. You can create an array of Person objects in java like this:
 ``` java
Person[] peopleArray = new Person[3];
peopleArray[0] = new Person("Alice", 25);
peopleArray[1] = new Person("Bob", 30);
peopleArray[2] = new Person("Charlie", 35);
int count = peopleArray.length; // Assigns the length of the array to count (3 in this case)
Person secondElement = peopleArray[1]; // Assigns the value at index 2 to secondElement(the second object )
```

## Projects




