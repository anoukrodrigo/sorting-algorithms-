package sorting;

import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
	
           

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

		        insertionSort(arr);

		        System.out.println("\nArray after sorting:");
		        printArray(arr);

		        System.out.print("\nEnter a new number to insert: ");
		        int newNumber = scanner.nextInt();
                
		        
		        
		       arr =  insertNumber(arr, newNumber); 

		        System.out.println("\nArray after inserting and sorting:");
		        printArray(arr);
		        
		        
		        
		       

		       
		    }

		    // Function to perform Insertion Sort
		    static void insertionSort(int[] arr) {
		        int n = arr.length;
		        for (int i = 1; i < n; i++) {
		            int key = arr[i];
		            int j = i - 1;

		            // Move elements of arr[0..i-1], that are greater than key,
		            // to one position ahead of their current position
		            while (j >= 0 && arr[j] > key) {
		                arr[j + 1] = arr[j];
		                j = j - 1;
		            }
		            arr[j + 1] = key;
		        }
		    }

		    // Function to insert a new number into the sorted array and re-sort it
		    static int[] insertNumber(int[] arr, int newNumber) {
		        int n = arr.length;
		        int[] newArr = java.util.Arrays.copyOf(arr, n + 1);
		        newArr[n] = newNumber;
		        insertionSort(newArr);
		        return newArr;
		    }

		    // Function to print an array
		    static void printArray(int[] arr) {
		        for (int value : arr) {
		            System.out.print(value + " ");
		        }
		        System.out.println();
		    }
		

		
		
		

	}


