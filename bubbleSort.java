package sorting;
import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		    
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();

		        int[] arr = new int[n];

		        System.out.println("Enter the elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = scanner.nextInt();
		        }

		        System.out.println("\nArray before sorting:");
		        printArray(arr);

		        bubbleSort(arr);

		        System.out.println("\nArray after sorting:");
		        printArray(arr);

		        scanner.close();
		    }

		    // Function to perform Bubble Sort
		    static void bubbleSort(int[] arr) {
		        int n = arr.length;
		        for (int i = 0; i < n - 1; i++) {
		            // Last i elements are already in place
		            for (int j = 0; j < n - i - 1; j++) {
		                // Traverse the array from 0 to n-i-1
		                // Swap if the element found is greater than the next element
		                if (arr[j] > arr[j + 1]) {
		                    // Swap arr[j] and arr[j+1]
		                    int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }
		    }

		    // Function to print an array
		    static void printArray(int[] arr) {
		        for (int value : arr) {
		            System.out.print(value + " ");
		        }
		        System.out.println();
		    }
		

		
		

	}


