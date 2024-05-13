package sorting;
import java.util.Scanner;

public class selectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		  
		        Scanner scanner = new Scanner(System.in);

		        // Input size of the array
		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();

		        // Input array elements
		        int[] arr = new int[n];
		        System.out.println("Enter the elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = scanner.nextInt();
		        }

		        // Perform selection sort
		        selectionSort(arr);

		        // Display sorted array
		        System.out.println("Sorted array:");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }

		        scanner.close();
		    }

		    // Selection sort algorithm
		    public static void selectionSort(int[] arr) {
		        int n = arr.length;
		        for (int i = 0; i < n - 1; i++) {
		            int minIndex = i;
		            for (int j = i + 1; j < n; j++) {
		                if (arr[j] < arr[minIndex]) {
		                    minIndex = j;
		                }
		            }
		            if (minIndex != i) {
		                // Swap arr[i] and arr[minIndex]
		                int temp = arr[i];
		                arr[i] = arr[minIndex];
		                arr[minIndex] = temp;
		            }
		        }
		    }
		

		
		
		
		
		

	}


