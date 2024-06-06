# Backtracking Algorithms

### Concept 
**Backtracking** is a general algorithmic technique to solve problems by **recursively exploring all possible solutions**.

**How does Backtracking work?**

1. Choose: Choose the initial step towards a solution.
2. Explore: Explore all possible options from the current choice.
3. Evaluate: Determine whether the current choice leads to a solution.
4. Backtrack: If the choice doesn’t lead to a solution, undo (backtrack) the choice to the previous choice and try another option.

Types of problems solved by backtracking algorithms:

- Decision Problem: search for a feasible solution.
- Optimization Problem: search for the best possible solution.
- Enumeration Problem: try to find all feasible solutions.

### Implementation
Suppose you have two bikes 'B1' & 'B2'. And 1 car 'C'. Find all possible ways to arrange them. 

**Constraint:** Car should not be between bikes.
<img src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148013077/bf6cc992-fdd8-41e4-bf3f-6f23ddb14af2" width="1000" height="400" />
```java
public class backtracking {
    public static void main(String[] args) {
        String[] vehicles = {"B1", "B2", "C"};
        int count = 0;

        count = arrangeVehicles(vehicles, 0,count);
        System.out.println("We have " + count + " possible ways");

    }

    public static int arrangeVehicles(String[] vehicles, int currentIndex,int count) {
        if (currentIndex == vehicles.length - 1) {
            if(vehicles[1]!="C"){
                ++count;
            for (String vehicle : vehicles) {
                System.out.print(vehicle + " ");
            }
            System.out.println();
            return count ;
        }
    }
        for (int i = currentIndex; i < vehicles.length; i++) {
            swap(vehicles, currentIndex, i);
            count= arrangeVehicles(vehicles, currentIndex + 1,count);
            swap(vehicles, currentIndex, i);
        }
        return count;
    }

    public static void swap(String[] vehicles, int i, int j) {
        String temp = vehicles[i];
        vehicles[i] = vehicles[j];
        vehicles[j] = temp;
    }


}
```
Output:
```
B1 B2 C 
B2 B1 C 
C B2 B1 
C B1 B2 
We have 4 possible ways

```

### Projects

|Project Title | Deadline |
|:-----------:|:-------------:|
|[Backtracking algorithms project](https://github.com/SAFCSP-Team/backtracking-algorithms-project) | - | 

