# Introduction to Arrays
Imagine a scenario where we have two libraries: one is organized, and the other is scattered. In an organized library, the books are systematically arranged and categorized by genre, with each genre having its designated section. On the other hand, in a scattered library, the books are randomly placed without any organization or system. You might find books of different genres haphazardly mixed together on the shelves.

It is important to note that an organized library significantly improves the ease of dealing with books by providing a structured system for book organization. In contrast, a scattered library lacking such organization creates difficulties and hinders efficient dealing with library resources.

## Concept
In computer programming, in most cases, there is a need to **store a large number of data**. Instead of using different variable names, it is **better to define an array and store all the elements in it** to significantly improve the ease of dealing with data.

`Array`: is a **collection of data items** stored in memory locations.
- Arrays can store **primitive** data types or **non-primitive** data type.
- The `length` of an array refers to the **number of elements** contained within the array. It represents the size or capacity of the array to hold elements.
- An array is the **simple data structure** where each data element can be randomly **accessed** using its **index number**.
- The `index` of an array refers to the **position or location of an element** within the array. It represents the **unique numeric** identifier assigned to each element in the array.
- If the size of an array is **n**, the maximum index number is **n-1**.
 >  Note : In most programming languages, array indices typically start from 0 and increment by 1 for each subsequent element.

Types of arrays based on their dimensions :

- `One-Dimensional Arrays`: These are the simplest and most common type of arrays. Elements are arranged in a **single row**.
- `Multi-Dimensional Array`: Has **more than one dimension**. It can have two or more dimensions in rows and columns, similar to a 3D object. The most common type of multi-dimensional array is a two-dimensional array.


## Example 

### Primitive 
- Arrays of primitive data types in Java:

```java
int numbers [] = {1, 2, 3, 4, 5};
double grades [] = {85.5, 90.0, 77.5, 92.5};
char vowels [] = {'a', 'e', 'i', 'o', 'u'};
```

- Arrays of primitive data types in C++ :
```c++
 int numbers[] = {1, 2, 3, 4, 5};
double grades[] = {85.5, 90.0, 77.5, 92.5};
char vowels[] = {'a', 'e', 'i', 'o', 'u'};
  ```
> In C++ and java, you can declare and initialize arrays similarly. 

### non-primitive
Consider a class called "Person" that represents a person's name and age. 

- Array of [Person](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/code/Person.java) objects in Java like this:
 ``` java
Person[] peopleArray = new Person[3];
peopleArray[0] = new Person("Alice", 25);
peopleArray[1] = new Person("Bob", 30);
peopleArray[2] = new Person("Charlie", 35);
```
- Array of [Person](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/code/person.cpp) objects in C++ like this:
   ```C++
Person peopleArray[3];
 peopleArray[0] = Person("Alice", 25);
 peopleArray[1] = Person("Bob", 30);
 peopleArray[2] = Person("Charlie", 35);
  ```

## Projects




