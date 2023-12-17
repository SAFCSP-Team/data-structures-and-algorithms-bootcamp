# Introduction to Arrays
Imagine a scenario where we have two libraries: one is organized, and the other is scattered. In an organized library, the books are systematically arranged and categorized by genre, with each genre having its designated section. On the other hand, in a scattered library, the books are randomly placed without any organization or system. You might find books of different genres haphazardly mixed together on the shelves.

It is important to note that an organized library significantly improves the ease of dealing with books by providing a structured system for book organization. In contrast, a scattered library lacking such organization creates difficulties and hinders efficient dealing with library resources.

## Concept
In computer programming, in most cases, there is a need to **store a large number of similar data**. for example, books or weekdays. So, instead of using different variable names to represent each value, it is **better to define an array and store all the elements in it** to significantly improve the ease of dealing with data.

for example, books or cups

`Array`: is a collection of similar data items grouped together.
- Arrays can store **primitive** data types or **non-primitive** data type.
- The `length` of an array refers to the **number of elements** contained within the array.
- An array is the **simple data structure** where each data element can be randomly **accessed** using its **index number**.
- The `index` of an array refers to the **position or location of an element** within the array. It represents the **unique numeric** identifier assigned to each element in the array.
- If the size of an array is **n**, the maximum index number is **n-1**.
 >  Note : In most programming languages, array indices typically start from 0 and increment by 1 for each subsequent element.

<img width="910" alt="Introduction to Arrays-01" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/images/Introduction%20to%20Arrays-01.png">

Types of arrays based on their dimensions :

- `One-Dimensional Arrays`: These are the simplest and most common type of arrays. Elements are arranged in a **single row**.
- `Multi-Dimensional Array`: Has **more than one dimension**. It can have two or more dimensions in rows and columns, similar to a 3D object. The most common type of multi-dimensional array is a two-dimensional array.

<img width="910" alt="Introduction to Arrays-01" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/images/Introduction%20to%20Arrays-02.png">

## Example 

### Primitive 
- Arrays of primitive data types in Java:

```java
public static void main(String[] args) {
    int numbers[] = {1, 2, 3, 4, 5};
    double grades[] = {85.5, 90.0, 77.5, 92.5};
    char vowels[] = {'a', 'e', 'i', 'o', 'u'};
}
```

- Arrays of primitive data types in C++ :
```c++
int main() {
   int numbers[] = {1, 2, 3, 4, 5};
   double grades[] = {85.5, 90.0, 77.5, 92.5};
   char vowels[] = {'a', 'e', 'i', 'o', 'u'};
}
```
> In C++ and java, you can declare and initialize arrays similarly. 

### Non-primitive
Consider a class called "Person" that represents a person's name and age. 

- Array of [Person](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/code/Person.java)objects in Java.

``` java
public static void main(String[] args) {
   Person[] peopleArray = new Person[3];
   peopleArray[0] = new Person("Alice", 25);
   peopleArray[1] = new Person("Bob", 30);
   peopleArray[2] = new Person("Charlie", 35);
}
```
- Array of [Person](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/code/person.cpp) objects in C++.
```C++
int main() {
    Person peopleArray[] = {
          Person("John", 25),
          Person("Alice", 30),
          Person("Bob", 35)
    };
}
```
## Projects

Project ID | Project Title | Deadline |
|:-----|:-----------:|:-------------|
|DSAProject01| [Array with primitive data types](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/projects/introduction-to-arrays/array-with-primitive-data-type/README.md) | - | 
|DSAProject02| [Array with non-primitive data types ](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/projects/introduction-to-arrays/array-with-non-primitive-data-type/README.md) | - | 

