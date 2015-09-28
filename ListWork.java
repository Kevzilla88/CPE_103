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
		//Assume the user wants to search at first, but we'll still ask.
		String searchAnswer = "yes";
		
		//Define the array we'll be storing input in.
		Integer[] arr = new Integer[10];
		
		//Create the scanner.
		Scanner in = new Scanner(System.in);
		
		//Loop to ask for values.
		for (int i = 0; i < 10; i++)
		{
			try
			{
				//Prompt the user for input
				System.out.println("Please enter " + (10-i) + "  more integers:");
				
				//Take in entire line as string.
				String inputLine = in.next();

				//Remove any non-integer values from the string.
				inputLine = inputLine.replaceAll("[^0-9.]+", " ");
				
				//Split the string and put it in a string array.
				String[] stringArray = inputLine.trim().split("\\s+");
				
				//Get length of the string array so we know how many integers we need to process.
				int inputLength = stringArray.length;

				//Copy all integers from string array to integer array.
				for(int j = 0; j < inputLength; j++)
				{
					//Prevent array out of bounds, since we can't have more than 10 elements.
					if (i < 10)
					{
						//Convert the string to an integer and put in array.
						arr[i] = Integer.parseInt(stringArray[j]);
						
						//Increment counter.
						i++;
					}
					
					//Decrement the counter to compensate, this fixes the null issue.
					i--;
				}
			}
			
			//Catch any single non-integer inputs.
			catch (NumberFormatException e) 
			{
		        System.out.println("Error: Non-integer. Please enter a valid integer value.\n");	
		        i--;
		    }
		}
		
		//Loop to search.
		while (searchAnswer.equals("yes"))
		{
			//Ask for input.
			System.out.println("Would you like to search for an integer?(yes/no)");
			searchAnswer = in.useDelimiter("\n").next();
			
			//User didn't enter input correctly.
			while(!searchAnswer.equals("no") && !searchAnswer.equals("yes"))
			{
				//Ask for proper input again, ignoring any new line characters.
				System.out.println("Incorrect input. Please enter 'yes' or 'no'");
				searchAnswer = in.useDelimiter("\n").next();
			}
			
			//User wants to search.
			if (searchAnswer.equals("yes"))
			{
				//Ask for input.
				System.out.println("What integer would you like to search for?");
				try
				{
					//Parse our input string so that we just get an Integer. 
					Integer searchTarget = Integer.parseInt(in.useDelimiter("\n").next());
					
					//Call the search method.
					search(arr, searchTarget);
				}
				
				//If we don't get an integer to parse, catch the error.
				catch (NumberFormatException e)
				{
					System.out.println("Error: Non-integer. Please enter a valid integer target.\n");
				}	
			}
		}
		
		//Close the scanner since we're done.
		in.close();
		
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
		//Try to find the target in the array.
		for(T element: arr)
		{
			//Is the current element equal to the target?
			if (element == target)
			{
				//It is, so return true.
				System.out.println("I found your integer!");
				return true;
			}
		}
		
		//The for loop didn't find target, so return false.
		System.out.println("I didn't find your integer!");
		return false;
	}
	
	/**
	 * Given an array of objects of some class, output all
	 * elements of the array on the screen, one element per line.
	 * @param arr
	 */
	public static <T> void print (T [] arr)
	{
		//Loop through the array and print every element.
		for(T element: arr)
		{
			//Print on a new line every time.
			System.out.println(element);
		}
	}
}