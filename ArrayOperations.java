import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        // Initialize the array
        try (Scanner scanner = new Scanner(System.in)) {
            // Initialize the array
            int[] array = {5, 3, 8, 6, 2, 7, 4, 1};
            
            // Display original array
            System.out.println("Original Array:");
            printArray(array);
            
            // Sort the array using Bubble Sort
            bubbleSort(array);
            
            // Display sorted array
            System.out.println("Sorted Array:");
            printArray(array);
            
            // Perform Linear Search
            System.out.print("Enter a number to search: ");
            int target = scanner.nextInt();
            int index = linearSearch(array, target);
            
            // Display search result
            if (index != -1) {
                System.out.println("Element " + target + " found at index: " + index);
            } else {
                System.out.println("Element " + target + " not found in the array.");
            }
        }
    }

    // Bubble Sort Algorithm
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Linear Search Algorithm
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


