# Introduction to Arrays
Imagine a scenario where we have two libraries: one is organized, and the other is scattered. In an organized library, the books are systematically arranged and categorized by genre, with each genre having its designated section. On the other hand, in a scattered library, the books are randomly placed without any organization or system. You might find books of different genres haphazardly mixed together on the shelves.

It is important to note that an organized library significantly improves the ease of dealing with books by providing a structured system for book organization. In contrast, a scattered library lacking such organization creates difficulties and hinders efficient dealing with library resources.

## Concept
In computer programming, in most cases, there is a need to **store a large number of similar data**. for example, books or weekdays. So, instead of using different variable names to represent each value, it is **better to define an array and store all the elements in it** to significantly improve the ease of dealing with data.

`Array`: is a collection of similar data items grouped together.

- Arrays can store **primitive** data types or **non-primitive** data type.
- The `length` of an array refers to the **number of elements** contained within the array.
- An array is **simple data structure** where each data element can be randomly **accessed** using its **index number**.
- The `index` of an array refers to the **position or location of an element** within the array. It represents the **unique numeric** identifier assigned to each element in the array.
- If the size of an array is **n**, the maximum index number is **n-1**.
 >  Note: In most programming languages, array indices typically start from 0 and increment by 1 for each subsequent element.

<img width="910" alt="Introduction to Arrays-01" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/images/Introduction%20to%20Arrays-01.png">

## Implementation 
1. Declaration: To create an array, you first need to declare it. You specify the type of elements it will hold and give it a name. 

For example, you can declare an array of integers called "numbers"

```java
int[] numbers;
```
For example, you can declare an array of Person objects  called "peopleArray" 

```java
Person[] peopleArray;
```
2. Initialization: After declaring an array, you need to allocate memory for it and specify its size. The size determines the number of elements the array can hold.

For example, to create an array of one integer.

```java
numbers = new int[1];
```
3. Assignment: Once the array is initialized, you can assign values to its elements individually. Each element in the array has an index, starting from 0 for the first element.

For example, to assign value to the element of the "numbers" array:

```java
numbers[0] = 10;
```
4. Accessing Elements: You can access the elements of an array using their index.

For example, to retrieve the value of the first element from the "numbers" array:

```java
int firstElement  = numbers[0]; //10 
```

- To create an array consisting of several elements, all you have to do is change the size.

For example, creating an array of 10 elements: 
```java
int[] numbers = new int[10];

// Assigning values to the array elements
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;
numbers[5] = 60;
numbers[6] = 70;
numbers[7] = 80;
numbers[8] = 90;
numbers[9] = 100;
```
## Types
Types of arrays based on their dimensions :

- `One-Dimensional Arrays`: These are the simplest and most common type of arrays. Elements are arranged in a **single row**.
- `Multi-Dimensional Array`: Has **more than one dimension**. It can have two or more dimensions in rows and columns, similar to a 3D object. The most common type of multi-dimensional array is a two-dimensional array.

<img width="910" alt="Introduction to Arrays-01" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/images/Introduction%20to%20Arrays-02.png">

## Projects

|Project Title | Deadline |
|:-----------:|:-------------|
|[Array with primitive data types](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/projects/introduction-to-arrays/array-with-primitive-data-type/README.md) | - | 
|[Array with non-primitive data types ](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/projects/introduction-to-arrays/array-with-non-primitive-data-type/README.md) | - | 

