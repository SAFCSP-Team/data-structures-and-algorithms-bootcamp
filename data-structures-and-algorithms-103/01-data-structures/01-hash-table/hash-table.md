# Hash Table

Imagine you have a list of phone numbers that you need to store and manage efficiently. by implementing a hash table in this scenario, you can associate each person's name with their corresponding phone number, where the person's name is the `key` and the phone number is a `value`. This allows for quick and direct access to phone numbers based on the names of the individuals.

## Concept

 Hash table is a type of data structure in which the index value of the data element is generated from a hash function `hash = k % array_size`.
 


 ```java
    public int hashFunction(int key, int arrSize) {
        return key % arrSize;
    }
```



### Collision Handling

Collision Handling happens when two keys are hashed to the same index in a hash table. `Collisions` are a problem because every slot in a hash table is supposed to store a **single** element, to handle collisions there are various techniques to handle such as `chaining` and `open addressing`.


#### Chaining

 Each bucket in the hash table contains a linked list to store multiple key-value pairs that hash to the same index
 so we can handle a random number of collisions using an array of linked lists, each index has its own linked list.
 
 ![ezgif com-animated-gif-maker (7)](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/280ae568-3431-43e1-a700-1cb70fb75ada)

 
#### Open Address

Stores all key-value pairs directly in the hash table itself, without using separate data structures like linked lists.
when a collision occurs, open addressing involves probing the table to find an alternative index for the colliding element (checking the next available slot).

![open addressing](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/7eccfdfc-e047-45bf-8182-43574b208ecd)

## Implementation


Create a hash table using the linked lists collision chaining technique 

```java
import java.util.LinkedList;

public class Hash {
    // Number of buckets
    private int size;

    private  LinkedList<Integer>[] table;

    public Hash(int size) {
        this.size = size;
        this.table = new LinkedList[size]; //  each position in the table initially points to an empty LinkedList.
        for (int i = 0; i < size; i++) {  // iterates over each index in the table array.
            table[i] = new LinkedList<>(); //to ensure that each bucket in the hash table initially points to an empty linked list, ready to store elements.
          }
        }
```


 The `hashFunction()` method calculates the hash value for a given key and `insertItem()` method inserts a key into the hash table.
 
```java
    public int hashFunction(int key) {
        return (key % size);
    }


    public void insertItem(int key) {
        // get the hash index of key
        int index = hashFunction(key);
        // insert key into hash table at that index
        table[index].add(key);
    }

    public void displayHash() {
        for (int i = 0; i < size; i++) {   //iterates through each bucket in the table array and prints the bucket index followed by the keys stored in the linked list at that index.
            System.out.print(i);
            for (int x : table[i]) {
                System.out.print(" --> " + x);
            }
            System.out.println();
        }
    }


```
In the main method, an array a is created with keys to be inserted into the hash table.

```java
    public static void main(String[] args) {
        // array that contains keys to be mapped
        int[] a = { 15, 11, 27, 8, 12, 3, 6};

        Hash h = new Hash(7);

        // insert the keys into the hash table
        for (int x : a) {
            h.insertItem(x);
        }

        // Display the hash table
        h.displayHash();
    }
}
```
output
```java
0
1 --> 15 --> 8
2
3 --> 3
4 --> 11
5 --> 12
6 --> 27 --> 6
```

## Projects
| Project Title | Deadline |
:-----------:|:-------------|
|[Hash Table](https://github.com/SAFCSP-Team/hash-table-project/tree/main)|


