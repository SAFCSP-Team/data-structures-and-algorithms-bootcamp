# One Dimensional Arrays
One-dimensional array, also known as a 1D array or a single-dimensional array, is a linear collection of elements.
## Concept
`One-Dimensional Arrays`: These are the simplest and most common type of arrays. Elements are arranged in a single row. 

For example storing a list of student names, we can have 1D-Array called names and store each student name in the array:
<img width="910" alt="One Dimensional Arrays" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/images/One%20Dimensional%20Arrays.jpg">

- The length of an array called **names** can be accessed using the syntax ***names.length*** in java or ***len(numbers)*** in python.
- To access an element in a one-dimensional array, you use square brackets **`[ ]`** and an index, ***names[0]*** gives the first element in an array called **names**


## Example 

### Primitive 
- One Dimensional Array of numbers called `numbers` in java:

**Code**
```java
public static void main(String[] args) {
    int[] numbers = {1, 7, 9, 1, 5};
    int count= numbers.length; // Assigns the length of the array to count
    int secondElement = numbers[1]; // Assigns the value at index 1
    System.out.println("The count = " + count);
    System.out.println("The secondElement = " +secondElement);
}
```
**Output**
```
The count = 5
The secondElement = 7
```

- One Dimensional Array of numbers called `numbers` in C++: 
**Code** 
``` c++
int main() {
    int numbers[] = {1, 7, 9, 1, 5};
    int count = sizeof(numbers) / sizeof(numbers[0]);
    int secondElement = numbers[1];

    std::cout << "The count = " << count << std::endl;
    std::cout << "The secondElement = " << secondElement << std::endl;
    return 0;
}
```
**Output**
```
The count = 5
The secondElement = 7
```
> Note: we use the sizeof operator to get the total size of the array (sizeof(numbers)) depending on the data type, and divide it by the size of a single element (sizeof(numbers[0])). This gives us the number of elements in the array.


### Non-primitive
1. Array of [Person](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/code/Person.java) in java:
 - Code: 
 ``` java
public static void main(String[] args) {
    Person[] peopleArray = new Person[3];
    peopleArray[0] = new Person("Alice", 25);
    peopleArray[1] = new Person("Bob", 30);
    peopleArray[2] = new Person("Charlie", 35);
    int count = peopleArray.length; // Assigns the length of the array to count (3 in this case)
    Person secondElement = peopleArray[1]; // Assigns the value at index 2 to secondElement(the second object )
    System.out.println("The count = " + count);
    System.out.println("The secondElement = " + secondElement);
}
```
- Output
```
The count = 3
The secondElement = Name: Bob Age: 30
```

2. Array of [Person](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/code/person.cpp) objects in C++:
- Code: 
```C++
int main() {
    Person peopleArray[] = { Person("Alice", 25),Person("Bob", 30),
    Person("Charlie", 35) };
    int count = sizeof(peopleArray)/sizeof(peopleArray[0]);
    Person secondElement = peopleArray[1];
    std::cout << "The count = " << count << std::endl;
    std::cout << "The secondElement = ";
    secondElement.printInfo();
    return 0;
}
```
- Output
```
The count = 3
The secondElement = Name: Bob Age: 30
```

## Projects
|Project Title | Deadline |
|:-----------:|:-------------|
|[One Dimensional Array](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/01-arrays/projects/one-dimensional-arrays/README.md) | - | 




