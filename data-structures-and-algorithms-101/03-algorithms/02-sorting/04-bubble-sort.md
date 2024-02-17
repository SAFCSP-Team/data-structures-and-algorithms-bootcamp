# Bubble Sort Algorithm

Imagine you have a group of friends lined up based on their heights, and you want to sort them from shortest to tallest using the `bubble sort algorithm`.

Step 1: Compare adjacent **heights** and swap if necessary.

You start at the beginning of the line and compare the heights of the first two friends. If the first friend is taller than the second friend, you swap their positions.

Step 2: Move to the next pair and repeat.
Now, you compare the heights of the second and third friends. Again, if the second friend is taller than the third friend, you swap their positions.

Step 3: Repeat the process until the end of the line.
You continue this process, comparing adjacent heights and swapping if necessary, until you reach the end of the line.
Repeat Steps 1 to 3 until the line is sorted.

After reaching the end of the line, you repeat the entire process from the beginning until no more swaps are needed. This ensures that the tallest friend **"bubbles"** up to the end of the line in each iteration.


## Concept

The `Bubble sort` algorithm is comparison-based. Each pair of adjacent elements are compared with each other and the elements are swapped if they are not in order. This is repeated until the list is sorted.


![S4GIF-ezgif com-video-to-gif-converter](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/09c84453-6e78-4086-8676-d5152f73fcce)

Let's see how this would play out with a group of friends and their heights:

`Unsorted line: [Lama (160cm), Sara (175cm), Noura (155cm), Manar (168cm)]`

In the first iteration:

You compare Lama (160cm) and Sara (175cm). Since Lama is shorter, no swap is needed.
You compare Sara (175cm) and Noura (155cm). Since Sara is taller, you swap their positions.
You compare Sara (175cm) and Manar (168cm). Since Sara is taller, you swap their positions.

`Updated line: [Lama (160cm), Noura (155cm), Manar (168cm), Sara (175cm)]`

In the second iteration:

You compare Lama (160cm) and Noura (155cm). Since Lama is taller, you swap their positions.
You compare Lama (160cm) and Manar (168cm). Since Lama is shorter, no swap is needed.
You compare Manar (168cm) and Sara (175cm). Since Manar is shorter, no swap is needed.


`Updated line: [Noura (155cm), Lama (160cm), Manar (168cm), Sara (175cm)]`

In the third iteration:

You compare Noura (155cm) and Lama (160cm). Since Noura is shorter, no swap is needed.
You compare Lama (160cm) and Manar (168cm). Since Lama is shorter, no swap is needed.
You compare Manar (168cm) and Sara (175cm). Since Manar is shorter, no swap is needed.
The line is now sorted:

`Sorted line: [Noura (155cm), Lama (160cm), Manar (168cm), Sara (175cm)]`

So, `bubble sort` algorithm is used to sort a line of friends based on their heights. The algorithm compares adjacent friends' heights and swaps their positions if necessary until the entire line is sorted.

## Examples

* The `bubbleSort` method takes an integer array (arr) as a parameter and sorts it using the `bubble sort` algorithm. 
```java

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        /* Traverse through all array elements */
        for (int i = 0; i < n - 1; i++) {
            /* Last i element are already in place */
            for (int j = 0; j < n - i - 1; j++) {
                /* Compare adjacent elements */
                if (arr[j] > arr[j + 1]) {
                    /* Swap if the current element is greater than the next element */
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
```

* The main method initializes an array of numbers, calls the `bubbleSort` method to sort the array, and then prints the sorted array.

```java
    public static void main(String[] args) {
        int[] numbers = {9, 2, 5, 1, 7, 4};
        
        System.out.println("Unsorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        
        /* Call the bubbleSort method */
        bubbleSort(numbers);
        
        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
```

The output is :
```
Unsorted numbers:
9 2 5 1 7 4 
Sorted numbers:
1 2 4 5 7 9 
```

## Projects
| Project Title | Deadline |
|:-----------:|:-------------|
| [Bubble sort](https://github.com/SAFCSP-Team/bubble-sort/tree/main) | - | 


