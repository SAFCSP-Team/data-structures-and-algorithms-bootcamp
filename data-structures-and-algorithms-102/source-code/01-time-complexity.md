## finds the maximum value in an array of integers
```java
    public static int findMax(int[] arr) {
        int max = 0;                                                                    
        for (int i = 0; i < arr.length; i++) {                                         
            if (arr[i] > max) {                                                         
                max = arr[i];                                                           
            }
        }
        return max;                                                                      
    }

```
