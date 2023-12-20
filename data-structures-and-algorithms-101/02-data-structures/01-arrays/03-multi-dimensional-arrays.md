# Multi Dimensional Arrays
Multi-dimensional arrays allow you to **organize and store data** in more complex structures than a simple one-dimensional array.<br> They are useful in various scenarios, such as `two-dimensional arrays` to represent 2D tables, `three-dimensional arrays` to represent 3D graphics, and so on. Each additional dimension **adds another level of organization** to the array.
## Concept
- `Multi-Dimensional Array`: Has **more than one dimension**. It can have two or more dimensions, similar to a 3D object. The most common type of multi-dimensional array is a two-dimensional array.
- `Two-Dimensional Arrays`: Also known as matrices, two-dimensional arrays organize elements in **rows and columns**. They are useful for representing tables.

#### Length
The `length` property works differently depending on the number of dimensions in the array.

- For a `one-dimensional array`, ***oneDArray.length*** represents the **total number of elements** in the array. 
- For multi-dimensional arrays with more dimensions, you can chain the `length` property to **access the size in each dimension**. 

    - Let's consider a `two-dimensional array`: 
        - ***twoDArray.length*** gives the number of rows. 
        - Each row of the array is itself an array so, ***twoDArray[0].length*** provides the **number of columns in the first row**.

    - In a `three-dimensional array` :
        - ***threeDArray.length*** provides the **number of layers**.
        - ***threeDArray[0].length*** gives the **number of rows in the first layer**.
        - ***threeDArray[0][0].length*** provides the **number of columns in the first layer's first row**.

#### Access an Element
To access an element in a multi-dimensional array, you need to **provide the indices for each dimension**. 
> The number of indices required **depends on** the number of dimensions of the array.

 - In a `two-dimensional array`: 
To access the element at row 0, and column 3, we use ***twoDArray[0][3]***.
 
 - In a `three-dimensional array` :

To access the element at layer 0, row 0, column 2, we use ***threeDArray[0][0][2]***.

> The process is similar for arrays with more dimensions. You provide the indices for each dimension in square brackets `[ ]` to access the desired element in the multi-dimensional array.

<img width="910" alt="Multi Dimensional Arrays" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/images/Multi%20Dimensional%20Arrays.jpg">

## Example 

### Primitive 
- Two-dimensional array in java:

**Code**
```java
public static void main(String[] args) {
    int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
     };
     int rows = twoDArray.length;
     int columns = twoDArray[0].length;
     System.out.println("Number of rows: " + rows);
     System.out.println("Number of columns: " + columns);

     int secondElement = twoDArray[1][2]; // Row 1, Column 2
     System.out.println("Element at (1, 2): " + element);
}
```
**Output**
```
Number of rows: 3
Number of columns: 3
Element at (1, 2): 6
```

- Two-dimensional array in C++:

**Code** 
```C++
#include <iostream>
int main() {
    int twoDArray[][3] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    int rows = sizeof(twoDArray) / sizeof(twoDArray[0]);
    int columns = sizeof(twoDArray[0]) / sizeof(twoDArray[0][0]);

    std::cout << "Number of rows: " << rows << std::endl;
    std::cout << "Number of columns: " << columns << std::endl;

   // Accessing elements
   int secondElement = twoDArray[1][2]; // Row 1, Column 2
   std::cout << "Element at (1, 2): " << secondElement << std::endl;
}
```
**Output**
```
Number of rows: 3
Number of columns: 3
Element at (1, 2): 6
```
> Note: in C++, you need to specify the size of all dimensions except the first when declaring a multidimensional array.

### Non-primitive
- Array of [Person](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/code/Person.java) in java:

**Code** 
``` java
public static void main(String[] args) {
    Person[][] twoDArray = new Person[3][3];
    twoDArray[0][0] = new Person("John", 25);
    twoDArray[0][1] = new Person("Alice", 30);
    twoDArray[0][2] = new Person("Bob", 35);
    twoDArray[1][0] = new Person("Sarah", 28);
    twoDArray[1][1] = new Person("Mike", 32);
    twoDArray[1][2] = new Person("Emily", 27);

    int rows = twoDArray.length;
    int columns = twoDArray[0].length;

    System.out.println("Number of rows: " + rows);
    System.out.println("Number of columns: " + columns);

    // Accessing elements
    Person secondElement = twoDArray[1][2];
    System.out.println(secondElement);
}
```
**Output**

```
Number of rows: 3
Number of columns: 3
Name: Emily Age: 27
```
> Node: in Java, when creating a 2D array, you need to specify the dimensions explicitly or provide the array elements immediately.

- Array of [Person](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/code/person.cpp) objects in C++:
**Code** 
```C++
#include <iostream>
int main() {
    Person twoDArray[][2] = {
        {Person("John", 25), Person("Alice", 30)},
        {Person("Bob", 35), Person("Sarah", 28)}
    };

    int rows = sizeof(twoDArray) / sizeof(twoDArray[0]);
    int columns = sizeof(twoDArray[0]) / sizeof(twoDArray[0][0]);
    std::cout << "Number of rows: " << rows << std::endl;
    std::cout << "Number of columns: " << columns << std::endl;

    // Accessing elements
    Person person = twoDArray[1][1];
    std::cout << "Element at (1, 1): " ;
    person.printInfo();
}
```
**Output**
```
Number of rows: 2
Number of columns: 2
Element at (1, 1): Name: Sarah Age: 28
```
## Projects
| Project Title | Deadline |
|:-----------:|:-------------|
| [Two Dimensional Array](https://github.com/SAFCSP-Team/multi-dimensional-arrays) | - |




