# Set







## Concept

The first thing to remember about Sets is that every element is `unique`. It’s like having a basket of fruits, and no two fruits in it are the same, this uniqueness is the superpower of Sets!

so set data structure revolves around storing a collection of unique elements. In other words, a set does not allow duplicate elements, and the order of elements is typically not significant.

we can be implemented using various data structures, such as `arrays`, `linked-lists`, or `hash tables`, depending on the specific requirements and constraints of the use case.

![SET@4x](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/7367037b-58de-4bf1-bd6d-3ece6c2997ec)


## Implementation

We implementing a Set data structure using the `HashSet` class to allow to store of multiple values in a collection using a hash table. The hash table stores the values in an unordered method with the help of a hashing mechanism. 


```java

import java.util.HashSet;

class Hashset {
    public static void main(String[] args) {
        
        HashSet<Integer> hashadd = new HashSet<Integer>();
        hashadd.add(13);
        hashadd.add(24);
        hashadd.add(5);
        
         System.out.println(hashadd);
         System.out.println(hashadd.isEmpty());
         System.out.println(hashadd.contains(24));
         hashadd.clear();
         System.out.println(hashadd);
    }
}



```

## Projects

| Project Title | Deadline |
|:-----------:|:-------------|
|[Set Project](https://github.com/SAFCSP-Team/set-project)||




