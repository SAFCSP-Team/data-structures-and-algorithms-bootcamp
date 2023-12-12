# Introduction to Arrays
Imagine you have a big pile of cards, and it's all mixed up. It would be really hard to find a specific card if you needed it, right?

But if you use a box with several compartments. Each compartment can hold one thing you can organize the cards. Let's say you have a box with 4 compartments, numbered from 0 to 3. Each compartment will hold one card. Now, when you want to find a particular card, you can just remember its position in the box, so you can go directly to that compartment and find it easily.

## Concept
In computer programming, in most cases, there is a need to **store a large number of data of the same type**. To handle such data, we need to define a **large number of variables**. It would be **very difficult** to **remember the names** of all the variables while writing the programs. Instead of using different variable names, it is **better to define an array and store all the elements in it**. <br>

Array :  
> is a **collection of data items** stored in memory locations.
- Arrays can store **primitive** data types  or **non-primitive** data type.
- The length of an array is **fixed** at the time of its creation and remains constant throughout its lifetime in some of programming languages.
- An array is the **simple data structure** where each data element can be randomly **accessed** using its **index number**.
- The `index` **starts with the number 0 or 1 - depend on programming languages-** for the first element and increments by 1 for each subsequent element, so if the size of an array is **n**,the maximum index number is **n-1**.
Types of arrays based on their dimensions :

- `One-Dimensional Arrays`: These are the simplest and most common type of arrays. Elements are arranged in a **single row**.
- `Multi-Dimensional Array`: Has **more than one dimension**. It can have two or more dimensions in rows and columns , similar to a 3D object. The most common type of multi-dimensional array is a two-dimensional array.


## Example 

### Primitive 
- arrays of primitive data types in Java:

```java
int[] numbers = {1, 2, 3, 4, 5};
double[] grades = {85.5, 90.0, 77.5, 92.5};
char[] vowels = {'a', 'e', 'i', 'o', 'u'};
```

- arrays of primitive data types in C++ :
```c++
 int numbers[] = {1, 2, 3, 4, 5};
double grades[] = {85.5, 90.0, 77.5, 92.5};
char vowels[] = {'a', 'e', 'i', 'o', 'u'};
  ```
> In C++ and java, you can declare and initialize arrays in a similar way. 

### non-primitive
- Consider a class called "Person" that represents a person's name and age. You can create an array of Person objects in Java like this:
 ``` java
Person[] peopleArray = new Person[3];
peopleArray[0] = new Person("Alice", 25);
peopleArray[1] = new Person("Bob", 30);
peopleArray[2] = new Person("Charlie", 35);
```
- In c++ programming language :
  ```C++
  Person* peopleArray[3];
    
    peopleArray[0] = new Person("Alice", 25);
    peopleArray[1] = new Person("Bob", 30);
    peopleArray[2] = new Person("Charlie", 35);

  ```

## Projects




