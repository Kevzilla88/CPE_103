/**
 * Lab 02 - Separator
 * @author geoffwacker, kevinliu
 * 09.28.15
 */

import java.util.*;

public class Separator 
{
	public static void main(String [ ] args)
	{		
		//Variable declaration.
		int intCount = 0;
		int floatCount = 0;
		
		//Create the scanner.
		Scanner in = new Scanner(System.in);
		
		//Figure out how big n should be.
		System.out.println("How many integers or non-integers would you like to enter?");
		int n = in.nextInt();
		
		//Prompt for number input.
		System.out.println("Please enter " + n + " values (integers & non-integers), or type 'q' to quit: ");
		
		//Create a n-long integer array.
		int[] intArray = new int[n];
		
		//Create a n-long float array.
		float[] floatArray = new float[n];
		
		//Use hasNextInt and hasNextFloat to input numbers to arrays until "aa" or 'q' is entered.
		for (int i = 0; ((intCount != n) || (floatCount != n)); i++)
		{
			//Check if the next value is an int.
			if (in.hasNextInt())
			{
				//Make sure we're not at the limit. If we are, increment intCount so that we'll exit the loop when we find another int.
				if (intCount == n)
				{
					intCount++;
					in.next();
				}
				
				//We're past the limit, so don't read anymore.
				if (intCount > n)
				{
					intCount = n;
					floatCount = n;
				}
				
				//Valid int.
				else
				{
					intArray[intCount] = in.nextInt();
					intCount++;
					
					//Testing code.
					System.out.println("int count");
				}
				
			}
			
			//Process floats.
			else if(in.hasNextFloat())
			{
				//Make sure we're not at the limit. If we are, increment floatCount so that we'll exit the loop when we find another float.
				if (floatCount == n)
				{
					floatCount++;
					in.next();
				}
				
				//We're past the limit, so don't read anymore.
				if (floatCount > n)
				{
					intCount = n;
					floatCount = n;
				}
				
				//Valid float.
				else
				{
					floatArray[floatCount] = in.nextFloat();
					floatCount++;
					
					//Testing code.
					System.out.println("float count");
				}
			}
			
			//It's not an integer or a float.
			else
			{
				//Check if aa.
				if (in.next().equals("aa"))
				{
					floatCount = n;
					intCount = n;
				}
				
				//Check if q.
				
				
				//Must be invalid.
				else
				{
					floatCount = n;
					intCount = n;
				}
			}
			
			
			
				
		}
		
		//Close the scanner.
		in.close();
		
		//Convert the integer array to a string.
		String intString = Arrays.toString(intArray);
		String floatString = Arrays.toString(floatArray);
		
		//Remove the commas.
		intString = intString.replace(",", "");
		floatString = floatString.replace(",", "");
		
		//Remove the left bracket.
	    intString = intString.replace("[", "");
	    floatString = floatString.replace("[", "");
	    
	    //Remove the right bracket.
	    intString = intString.replace("]", "");
	    floatString = floatString.replace("]", "");
	    
	    //Remove any zeros left from unoccupied array entries.
	    intString = intString.replace("0", "");
	    floatString = floatString.replace("0.0", "");
	    
	    //Trim remaining spaces.
	    intString = intString.trim(); 
	    floatString = floatString.trim();
	    
	    //Print out the integers.
		System.out.println("Integers: " + intString);
		
		//Print out the floats.
		System.out.println("Floats: " + floatString);
	}
}