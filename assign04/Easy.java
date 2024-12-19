package easy;

import java.util.Scanner;
 
public class Easy {

	public static void main(String[] args) {
		int arr[] = {0,1,2,3,4};									//Q1 : initialize a single-dimensional array with five integers.

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("length of the array is "+arr.length);	//Q2 : find the length of an array in Java

		for (int i = 0 ; i < arr.length; i++) {						// Q3: print its elements.
		    System.out.print(arr[i]+"\t");
		}

		System.out.println();
		
		for (int i = 0 ; i < arr.length; i++) {               		//Q4 : assign values to an array
			System.out.print("Enter number : ");
			arr[i] = scanner.nextInt();
			System.out.println("");
		}
		System.out.println();

		
		System.out.println("Fisrt element = "+arr[0]);				//Q5 :print the first and last elements of an array.
		System.out.println("Last element = "+arr[arr.length-1]);

		System.out.println();

//		int [] arr2; 												//Q6 : default value of elements in an uninitialized int array
//		System.out.println(arr2[0]);								// Unresolved compilation problem: The local variable arr2 may not have been initialized
		
		
		int sum = 0;												// Q7: Sum of elements 
		for (int i = 0 ; i < arr.length; i++) {
		    sum+=arr[i];
		}
		
		System.out.println("Sum of all elemnets = "+sum);
		
		System.out.println();
 
		int arr3[][]= {												// Q8:2D array with a 3x3 matrix. Print all its elements.
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		for (int i = 0; i < arr3.length;i++) {
			for (int j = 0; j < arr3[i].length;j++) {
				System.out.print("["+arr3[i][j]+"]");
			}
			System.out.println();
		}
		System.out.println();

		
		int max = 0;												// Q9 : find the maximum element 
		for (int i = 0 ; i < arr.length; i++) {
		    if (arr[i] > max) {
		    	max = arr[i];
		    }
		} 
		System.out.println("Max number = "+max);
		
		System.out.println();

		int[] ArrRev = new int[arr.length];     					//Q10 : reverse the elements of an array
		for (int i = 0 , j = arr.length-1 ; i!=arr.length ; i++,j--) {
			ArrRev[i] = arr[j];
		}
		for (int i = 0 ; i < arr.length; i++) {
		    System.out.print(ArrRev[i]+"\t");
		}
		
		
		scanner.close();
	}

}
