# Hash Table

Imagine you have a list of phone numbers that you need to store and manage efficiently. by implementing a hash table in this scenario, you can associate each person's name with their corresponding phone number, where the person's name as the `key` and the phone number is a value. This allows for quick and direct access to phone numbers based on the names of the individuals.

## Concept

 type of data structure in which the index value of the data element is generated from a hash function, this enables very fast data access as the index value behaves as a key for the data value.
 
 so the hash table stores key and value pairs but the key is generated through a hashing function `hash(key) = k % array_size`.

Collision Handling: Since multiple keys can hash to the same index,  to handle collisions there are various techniques to handle such as chaining and open addressing.




#### Chaining
 each bucket in the hash table contains a linked list to store multiple key-value pairs that hash to the same index
 so we can handle an random number of collisions without requiring additional memory for storing elements.
 
#### Open Address

stores all key-value pairs directly in the hash table itself, without using separate data structures like linked lists.
when a collision occurs, open addressing involves probing the table to find an alternative index for the colliding element (checking the next available slot)

## Projects
Project ID | Project Title | Deadline |
|:-----|:-----------:|:-------------|


