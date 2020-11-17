import java.security.SecureRandom;
import java.util.Arrays;
import java.lang.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * UniqueRandom.java
 * 
 * This program will produce a list of n random, unique integers. The deliverable 
 * will show code and output for 25 randomly distributed unique integers.
 * 
 * @author Jaylon Kiper
 * @version 3.0
 * Algorithms Programming Project
 * FALL2020
 */
public class UniqueRandom {

	public static int[] uniqueRandomNumbers(int x, int y, int arraySize) {
		
		//First while loop integer
		int i = 0;
		//Second while loop integer
		int j = 0;
		//Random integer
		int r = 0;
		//The size of the array.
		int n = arraySize;
		
		//This array will hold the random numbers.
		int[] A = new int[n];
		
		SecureRandom rd = new SecureRandom();
		
		while(i < n) {
			
			r = rd.nextInt((y - x) + 1) + x; 
			j =0;
			
			while(j < i) {
				
				if(A[j] == r) {
					j=0;
					r = rd.nextInt((y - x) + 1) + x;
				}//end if statement
				else {
					j++;
				}//end else statement
				
			}//end while loop
			
			A[i] = r;
			i++;
			
		}//end while loop
	
		//Returns array
		return A;
		
	}//end uniqueRandomNumbers method
	
	//This will sort the pseudo random numbers in order from least to greatest.
	public static int selectionSort(int[] array) {

		for(int i = 0; i < array.length; i++) {
			
			int min = array[i];
			
			int minId = i;
			
			for(int j = i+1; j < array.length; j++) {
				
				if(array[j] < min) {
					
					min = array[j];
					
					minId = j;
				}//end if statement
				
			}//end inner for loop
			
			//Swapping integers with a temporary array.
			int temp = array[i];
			
			array[i] = min;
			
			array[minId] = temp;
			
		}//end outer for loop
		return 0;
		
	}//end selectionSort method
	
	public static void main (String[] args) {
		
		//Results file for 1000 unique integers.
		String fileName1 = "algorithms1000Results.txt";
		
		try {
			PrintWriter outputStream = new PrintWriter(fileName1);
			
			for(int i = 0; i < 10; i++) {
				int[] A = uniqueRandomNumbers(0,1000,25);
		
				@SuppressWarnings("unused")
				int min = selectionSort(A);
		
				outputStream.println(Arrays.toString(A));

				//Returns the current time in milliseconds.
				outputStream.println("Current Time in Milliseconds = " + System.currentTimeMillis());
				
				outputStream.println();
			}//end for loop
			
			//Flushes the data to the file.
			outputStream.close();
			
		}catch (FileNotFoundException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Results file for 100000 unique integers.
		String fileName2 = "algorithms100000Results.txt";
		
		try {
			PrintWriter outputStream = new PrintWriter(fileName2);
			
			for(int i = 0; i < 10; i++) {
				int[] A = uniqueRandomNumbers(0,100000,25);
		
				@SuppressWarnings("unused")
				int min = selectionSort(A);
		
				outputStream.println(Arrays.toString(A));

				//Returns the current time in milliseconds.
				outputStream.println("Current Time in Milliseconds = " + System.currentTimeMillis());
				
				outputStream.println();
			}//end for loop
			
			//Flushes the data to the file.
			outputStream.close();
			
		}catch (FileNotFoundException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Results file for 1000000 unique integers.
		String fileName3 = "algorithms1000000Results.txt";
		
		try {
			PrintWriter outputStream = new PrintWriter(fileName3);
			
			for(int i = 0; i < 10; i++) {
				int[] A = uniqueRandomNumbers(0,1000000,25);
		
				@SuppressWarnings("unused")
				int min = selectionSort(A);
		
				outputStream.println(Arrays.toString(A));

				//Returns the current time in milliseconds.
				outputStream.println("Current Time in Milliseconds = " + System.currentTimeMillis());
				
				outputStream.println();
			}//end for loop
			
			//Flushes the data to the file.
			outputStream.close();
			
		}catch (FileNotFoundException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//end main
	
}//end class
