
# Brute Force Algorithm

Imagine a typical combination lock with three rotating dials containing 0-9. The lock requires the correct sequence of numbers to be entered to unlock it. If you forget the combination, one approach to unlocking the lock is to use a `brute force algorithm`.

so you would start by trying the first possible combination (e.g., 000) and then proceed to the next combination (001), and continue **incrementing** the digits until you reach the last possible combination (999). This algorithm exhaustively tries every possible combination until the correct one is found.


## Concept

The brute Force Algorithm involves guessing all possible combinations until the correct one is found or systematically going through each option one by one.



## Implementation

In this implementation, we generate all possible combinations of characters of a given length.

```java
public class BruteForce {

    public static void bruteForce(String characters, int length) { 
        char[] combination = new char[length]; // array will be used to store the generated combinations.
        generateCombinations(characters, combination, length, 0);
    }

    public static void generateCombinations(String characters, char[] combination, int length, int position) {
        if (position == length) {
            System.out.println(combination);
        } else {
            for (int i = 0; i < characters.length(); i++) {
                combination[position] = characters.charAt(i);
                generateCombinations(characters, combination, length, position + 1);
            }
        }
    }

    public static void main(String[] args) {
        String characters = "abc";
        int length = 3;
        bruteForce(characters, length);
    }
}
```
the output
```
aaa
aab
aac
aba
abb
abc
aca
acb
acc
baa
bab
bac
bba
bbb
bbc
bca
bcb
bcc
caa
cab
cac
cba
cbb
cbc
cca
ccb
ccc
```

## Projects

| Project Title | Deadline |
:-----------:|:-------------|
|[Brute Force](https://github.com/SAFCSP-Team/brute-force-project/blob/main/README.md)|

