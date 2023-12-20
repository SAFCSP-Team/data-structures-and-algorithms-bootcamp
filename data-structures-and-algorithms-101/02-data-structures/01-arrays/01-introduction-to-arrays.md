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
Before implementing the five-element vowel array, let us try to implement part of it. For example, let us create an array that contains only the letter A.

<img width="910" alt="Introduction to Arrays-02" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/images/Introduction%20to%20Arrays-02.png">

To create an array, you first need to declare it. You specify the type of elements it will hold and give it a name. 

In our case, the name of the array is **vowels** and its type is **char**.
```java
char[] vowels;
```
After declaring an array, you must allocate memory for it and specify its size. 

```java
vowels = new char[1];
```
> Or you can combine the previous two steps into one step, declaring the array and specifying its size.
```java
char[] vowels = new char[1];
```

Now you can assign the value of 'A' to the array. Remember Each element in the array has an index, starting from 0 for the first element.

```java
vowels[0] = 'A';
```
We have added a capital letter A in the array. If you want to change the value to be similar to what is in the picture, you can access the elements of the array using its index and change the value.

```java
vowels[0] = 'a';
```
Great, we have created the array and added the element to it, but what would change if we wanted to create the complete array with the five elements?
```java
char[] vowels = new char[5];

// Assigning values to the array elements
vowels[0] = 'a";
vowels[1] = 'e';
vowels[2] = 'i';
vowels[3] = 'o';
vowels[4] = 'u';
```
As you noticed, nothing changed except the size of the array. Instead of 1, it became 5.

There are also different ways to create the array, such as creating it and adding elements to it in one step.
```java
char[] vowels = {'a', 'e', 'i', 'o', 'u'};
```
Or the array contains elements of the Non-primitive Data Type. For example, the array contains objects of the Person class

```java
Person[] peopleArray;
```
To perform any operations on each element of an array, you can use loops. For example, to print all the elements of the "vowels" array:
```java
for (int i = 0; i < vowels.length; i++) {
    System.out.println(vowels[i]);
}
```

## Types
Types of arrays based on their dimensions :

- `One-Dimensional Arrays`: These are the simplest and most common type of arrays. Elements are arranged in a **single row**.
- `Multi-Dimensional Array`: Has **more than one dimension**. It can have two or more dimensions in rows and columns, similar to a 3D object. The most common type of multi-dimensional array is a two-dimensional array.

<img width="910" alt="Introduction to Arrays-03" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/images/Introduction%20to%20Arrays-03.png">

## Projects

|Project Title | Deadline |
|:-----------:|:-------------|
|[Array with primitive data types](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/projects/introduction-to-arrays/array-with-primitive-data-type/README.md) | - | 
|[Array with non-primitive data types ](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/projects/introduction-to-arrays/array-with-non-primitive-data-type/README.md) | - | 

