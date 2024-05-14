# Hash Table

Imagine you have a list of phone numbers that you need to store and manage efficiently. by implementing a hash table in this scenario, you can associate each person's name with their corresponding phone number, where the person's name as the `key` and the phone number is a value. This allows for quick and direct access to phone numbers based on the names of the individuals.

## Concept

 Type of data structure in which the index value of the data element is generated from a hash function, this enables very fast data access as the index value behaves as a key for the data value.
 
 so the hash table stores key and value pairs but the key is generated through a hashing function `hash = k % array_size`.

 ```java
    public int hashFunction(int key, int arrSize) {
        return key % arrSize;
    }
```



### Collision Handling

When two keys are hashed to the same index in a hash table. `Collisions` are a problem because every slot in a hash table is supposed to store a **single** element, to handle collisions there are various techniques to handle such as `chaining` and `open addressing`.


#### Chaining

 Each bucket in the hash table contains a linked list to store multiple key-value pairs that hash to the same index
 so we can handle a random number of collisions using an array of linked lists, each index has its own linked list.
 
 ![ezgif com-animated-gif-maker (7)](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/280ae568-3431-43e1-a700-1cb70fb75ada)

 
#### Open Address

Stores all key-value pairs directly in the hash table itself, without using separate data structures like linked lists.
when a collision occurs, open addressing involves probing the table to find an alternative index for the colliding element (checking the next available slot).

![open addressing](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/7eccfdfc-e047-45bf-8182-43574b208ecd)


## Implementation

Hash table using chaining technique 

```java

public class HashTableArray {
    Entry[]arrayhash;
    int size;

    public HashTableArray(int size){ //cons
        this.size=size;  
        arrayhash = new Entry[this.size];
        for(int i=0; i<arrayhash.length;i++)
        arrayhash[i]=new Entry ();
    }

    public int GetHash(int key){ 
        return key % size;    // calculates the hash value for a given key
    }

    public void put(int key, int value){ //insert
        int index= GetHash(key);
        Entry ArrayValue= arrayhash[index];// linked list
        Entry newItem = new Entry(key,value);
        newItem.next=ArrayValue;
        ArrayValue.next=newItem;
    }

    public int Get(int key){
        int value = 0;
        int index=GetHash(key);
        Entry ArrayValue= arrayhash[index];
        while (ArrayValue!=null) {
            if(ArrayValue.GetKey() == key){
                value= ArrayValue.value;
                break;
            }
            ArrayValue=ArrayValue.next;
        }
        return value;
     }

    } 
```

The `Entry` class holds a key-value pair.

```java
public class Entry {
    int key;// to determine index
    int value;// string
    Entry next;

public Entry(int key, int value){ //cons
    this.key=key;
    this.value=value;
    this.next=null;
}
public Entry(){
next = null;
}

public int GetKey(){
    return key;
}
public int getValue(){
    return value;
}
}
```
In the main method create an instance of the `HashTableArray` class called hash with a size of 6 and called put method.

```java
public class Main{
        public static void main(String[] args) {

            HashTableArray hash= new HashTableArray(6);
            hash.put(10, 2);
            hash.put(7,5);
            hash.put(4,1);

            System.out.println(hash.Get(10));

        }
    }
```
## Projects
Project ID | Project Title | Deadline |
|:-----|:-----------:|:-------------|
|[Hash Table](https://github.com/SAFCSP-Team/hash-table-project/blob/main/README.md)|Hash Table Project|


