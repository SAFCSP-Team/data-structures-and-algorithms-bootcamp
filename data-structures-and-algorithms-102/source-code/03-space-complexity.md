## Bubble Sort
```java
public class BubbleSort {
   public static void bubbleSort(int[] arr) {
       int n = arr.length; 
       for (int i = 0; i < n - 1; i++) { 
           for (int j = 0; j < n - i - 1; j++) { 
               if (arr[j] > arr[j + 1]) {
                   int temp = arr[j]; 
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
           }
       }
   }
}
```
## Insertion Sort
```java
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length; 
        for (int i = 1; i < n; i++) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
```
