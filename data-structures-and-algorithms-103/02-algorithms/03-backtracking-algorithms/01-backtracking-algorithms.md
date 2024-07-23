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
import java.util.ArrayList;
import java.util.Arrays;

public class backtracking {
    public static void main(String[] args) {
        String[] vehicles = {"C", "B2", "B1"};
        arrangeVehicles(vehicles);
    }

    public static void arrangeVehicles(String[] vehicles) {
        ArrayList<String[]> solution = new ArrayList<>();

        for (int i = 0; i < vehicles.length; i++) {
            for (int j = 0; j < vehicles.length; j++) {
                if (i == j) {
                    continue;
                }

                swap(vehicles, i, j);

                if (vehicles[1]== "C") {
                    swap(vehicles, i, j); // Backtrack from the swap
                    continue;
                } else if (!isRowInList(vehicles, solution)) {
                    solution.add(Arrays.copyOf(vehicles, vehicles.length));
                }
            }
        }

        System.out.println("All the possible ways of arranging 2 bikes and 1 car:");
        for (String[] arrangement : solution) {
            for (String vehicle : arrangement) {
                System.out.print(vehicle + " ");
            }
            System.out.println();
        }
    }

    public static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static boolean isRowInList(String[] arr, ArrayList<String[]> list) {
        for (String[] row : list) {
            if (Arrays.equals(arr, row)) {
                return true;
            }
        }
        return false;
    }
}
```
Output:
```
All the possible ways of arranging 2 bikes and 1 car:
B1 B2 C 
B2 B1 C 
C B1 B2 
C B2 B1 
```

### Projects

|Project Title | Deadline |
|:-----------:|:-------------:|
|[Backtracking algorithms project](https://github.com/SAFCSP-Team/backtracking-algorithms-project) | - | 

