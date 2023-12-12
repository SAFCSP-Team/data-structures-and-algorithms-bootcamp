# Multi Dimensional Arrays
Multi-dimensional arrays allow you to **organize and store data** in more complex structures than a simple one-dimensional array.<br> They are useful in various scenarios, such as `two-dimensional arrays` to represent 2D tables, `three-dimensional arrays` to represent 3D graphics, and so on. Each additional dimension **adds another level of organization** to the array.
## Concept
- `Multi-Dimensional Array`: Has **more than one dimension**. It can have two or more dimensions, similar to a 3D object. The most common type of multi-dimensional array is a two-dimensional array.
- `Two-Dimensional Arrays`: Also known as matrices, two-dimensional arrays organize elements in **rows and columns**. They are useful for representing tables.

#### Length
The `length` property works differently depending on the number of dimensions in the array.

- For a `one-dimensional array`, *oneDArray.length* represents the **total number of elements** in the array. 
- For multi-dimensional arrays with more dimensions, you can chain the `length` property to **access the size in each dimension**. 

  Let's consider a `two-dimensional array`: <br>
    - *twoDArray.length* gives the number of rows. 
    - Each row of the array is itself an array so, *twoDArray[0].length* provides the **number of columns in the first row**.

  In a `three-dimensional array` :
    - *threeDArray.length* provides the **number of layers**.
    - *threeDArray[0].length* gives the **number of rows in the first layer**.
    - *threeDArray[0][0].length* provides the **number of columns in the first layer's first row**.

#### Access an Element
 To access an element in a multi-dimensional array, you need to **provide the indices for each dimension**. 
 > The number of indices required **depends on** the number of dimensions of the array.

  In a`two-dimensional array`: <br>
  To access the element at **row 1, column 2** , we use *twoDArray[1][2]*. The first index **`[1]` represents the row index**, and the **second index `[2]` represents the column** index.
  
  In a `three-dimensional array` :
  To access the element at layer 1, row 0, column 2, we use *threeDArray[1][0][2]*.
> The process is similar for arrays with more dimensions. You provide the indices for each dimension in square brackets `[ ]` to access the desired element in the multi-dimensional array.
## Example 

### Primitive 


### non-primitive


## Projects




