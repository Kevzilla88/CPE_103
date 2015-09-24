/**
 * Lab 01 - ListWork
 * @author geoffwacker, kevinliu
 * 09.23.15
 */

import java.util.*;

public class ListWork 
{
	
	public static void main(String [ ] args)
	{
		//Variable declaration.

		//Define the array we'll be storing input in.
		Integer[] arr = new Integer[10];
		
		//Loop to ask for values.
		for (int i = 0; i < 10; i++)
		{
			try
			{
				//Prompt the user for input.
				System.out.println("Please enter some values:");
				
				//Create the scanner.
				Scanner in = new Scanner(System.in);
				
				//Take in entire line as string.
				String inputLine = in.nextLine();
				
				//Remove any non-integer values from the string.
				inputLine = inputLine.replaceAll("\\D+", " ");
				
				System.out.println("input is: " + inputLine);
				
				//Split the string and put it in an string array.
				String[] stringArray = inputLine.trim().split("\\s+");
				
				//Get length of the string array.
				int inputLength = stringArray.length;

				//Copy all integers from string array to integer array.
				for(int j = 0; j < inputLength; j++)
				{
					arr[i] = Integer.parseInt(stringArray[j]);
					System.out.println("Index: " + i);
					System.out.println("Value at index:" + arr[i]);
					i++;
				}
				System.out.println(Arrays.toString(stringArray));
			}
			
			//Catch non-integer inputs.
			catch (NumberFormatException e) 
			{
		        System.out.print("Error: Non-integer. Please enter a valid integer value.\n");	           
		    }
		}
		
		//Print out all of the values, one value per line.
		print(arr);
	}
	
	/**
	 * Given an array of objects and a target object of some class, return
	 * true if the target is in the array and false otherwise.
	 * @param args
	 */
	public static <T> boolean search (T [] arr, T target)
	{
		return false;
	}
	
	/**
	 * Given an array of objects of some class, output all
	 * elements of the array on the screen, one element per line.
	 * @param arr
	 */
	public static <T> void print (T [] arr)
	{
		for(T element: arr)
		{
		       System.out.print(element+"\n");
		}
	}
}
