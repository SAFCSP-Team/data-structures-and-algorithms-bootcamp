# Trie
  
Trie is a special type of tree, it was developed to solve multiple string-related problems. Storing strings in the Trie allows us to quickly search and retrieve worlds.   
<br/>
<br/>
   
     
## Concept     
Trie only stores and manipulates strings, by splitting the words into it's letters and storing each letter in a separate node.    
> Trie only contains lowercase letters.   
> Trie is non-binary, the Node can have multiple children.
<br/>

### Node structure
Each Node holds the following information:  
- `Array` of Node type.
  
The Node stores only one of the word letters in an array, The index of every letter position is calculated using the ASCII code.
The array size is 26 (the number of the English alphabet).   
   
Assuming we want to insert the word **hi** in the Trie. the letter **h** `ASCII code` is 104. To calculate the index for the letter **h** we subtract the letter **a** from it.   
    
letter **h** index is:   
`'h' - 'a' =
104 - 97 =
  7`
     
letter **i** index is:   
`'i' - 'a' =
105 - 97 =
  8`
  

Now the first Node in our Trie (root) will be storing the letter **h** in its array in **index 7**, and the next Node will store the letter **i** in its array in **index 8**.   

<br/>

- `isEndOfWord` boolean variable.   
This variable is used to detect if the node is storing a letter that is considered to be the end of a word in our Trie or not.
<br/>

Figure 1 shows the node structure on the left, and on the right shows the root node after adding the letter **h** to its `array`, and assigning a `false` value to the `isEndOfWord` variable.   

Figure 1    
<img width="910" alt="Introduction to Trie" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-103/01-data-structures/05-Trie/Images/array1.gif">
<br/>
<br/>


**The ASCII codes for the lowercase letters:**    
```java
a: 97 - b: 98 - c: 99 - d: 100 - e: 101 - f: 102 - g: 103 - h: 104 - i: 105 -
j: 106 - k: 107 - l: 108 - m: 109 - n: 110 - o: 111 - p: 112 - q: 113 -
r: 114 - s: 115 - t: 116 - u: 117 - v: 118 - w: 119 - x: 120 - y: 121، z: 122.
```
### Trie structure
Consider we have to store the below words in a Trie:   
See, 
Seat.

The Trie will be as the below figure 2 shows:
   
Figure 2   

<img width="910" alt="Introduction to Trie" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-103/01-data-structures/05-Trie/Images/t3%404x.png">

Trie provides a way to reduce redundancy by storing common prefixes of strings just once. In our case "**Se**" is the common prefix between **Se**e and **Se**at.   


Now let's add the below words to the Trie:   
Seen,
Be, 
Been.   
   
After adding the new words, the Trie will be as the below Figure 3 shows:   
   
Figure 3   

<img width="910" alt="Introduction to Trie" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-103/01-data-structures/05-Trie/Images/t1%404x.png">

<br/>

**Code lines important to know before diving into the Trie code example:**   
   
The below line of code will add the ASCII code of the letter `a = 97` to the number `5` and then convert the result `102`of that equation to its ASCII code character `f`.   

```java
(char) ('a' + 5)
```
   
``` java 
-> (char) (97 + 5)
-> (char) (102)
= f
```
<br/>
    
The below line of code will subtract the ASCII code of the letters `f = 102` from `a = 97` together and the result will be the number of that equation `5`.   

> `5` represents the index of the letter `f` in any node's children array.
   
```java
int index = 'f' - 'a'
```

```java
int index = 'f' - 'a'
int index = 5
```
<br/>

## Example  
In this example, we will Implement the below Trie as Figure 4 represents:

Figure 4
feel,
fees,
fresh,
calm,
care,
cast,
cave.   
   
<img width="910" alt="Introduction to Trie" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-103/01-data-structures/05-Trie/Images/t2%404x.png">

   
Node class

```java

public class Node {

    public Node children[] = new Node[25];
    public boolean isEndOfWord;
    
    Node(){
        this.isEndOfWord = false;
        for (int i = 0; i < 25; i++)
            children[i] = null;
    }
}
```

Trie class 
```java

import java.util.ArrayList;
import java.util.List;

public class Trie {

    private Node root;

    Trie() {
        this.root = new Node();
    }

    // Insert a word into the trie
    public void insert(String key) {
        Node currentNode = this.root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';
            if (currentNode.children[index] == null)
                currentNode.children[index] = new Node();
            currentNode = currentNode.children[index];
        }
        currentNode.isEndOfWord = true;
    }

    // Search for a word in the trie
    public boolean search(String key) {
        Node currentNode = this.root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';
            if (currentNode.children[index] == null)
                return false;
            currentNode = currentNode.children[index];
        }
        return (currentNode != null && currentNode.isEndOfWord);
    }

    // Delete a whole word in the Trie
    public void delete(String key) {
        delete(this.root, key, 0);
    }

    private boolean delete(Node node, String key, int level) {
        if (node == null) {
            return false;
        }
        if (level == key.length()) {
            if (!node.isEndOfWord) {
                return false;
            }
            node.isEndOfWord = false;
            return countChildren(node) == 0;
        }
        int index = key.charAt(level) - 'a';
        if (delete(node.children[index], key, level + 1)) {
            if (countChildren(node) == 0)
                node.children[index] = null;
            return countChildren(node) == 0;
        }
        return false;
    }

    // Count the node children
    private int countChildren(Node node) {
        int count = 0;
        for (Node child : node.children) {
            if (child != null) {
                count++;
            }
        }
        return count;
    }

    // Suggest words based on a given prefix
    public List<String> suggest(String prefix) {
        Node currentNode = root;
        for (int level = 0; level < prefix.length(); level++) {
            int index = prefix.charAt(level) - 'a';
            if (currentNode.children[index] == null) {
                return new ArrayList<>();
            }
            currentNode = currentNode.children[index];
        }
        return getWords(currentNode, prefix);
    }

    private List<String> getWords(Node node, String prefix) {
        List<String> words = new ArrayList<>();
        if (node.isEndOfWord) {
            words.add(prefix);
        }
        for (int i = 0; i < node.children.length; i++) {
            if (node.children[i] != null) {
                words.addAll(getWords(node.children[i], prefix + (char) ('a' + i)));
            }
        }
        return words;
    }
```   
Main method  
```java
    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("feel");
        trie.insert("fees");
        trie.insert("fresh");
        trie.insert("calm");
        trie.insert("care");
        trie.insert("cast");
        trie.insert("cave");

        trie.delete("feel");

        System.out.println(trie.search("feel"));
        System.out.println(trie.search("fees"));

        // Suggest words that start with the prefix (f)
        System.out.println(trie.suggest("f"));

    }

}

```

Output 
```
false
true
[fees, fresh]
```

<br/>
<br/>


## Projects

Project Title | 
|:-----------:|
|[Trie](https://github.com/SAFCSP-Team/trie-project/tree/main) |

