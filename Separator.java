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
		System.out.println("Please enter " + n + " values (integers & non-integers), and type 'q' to quit: ");
		
		//Create a n-long integer array.
		int[] intArray = new int[n];
		
		//Create a n-long float array.
		float[] floatArray = new float[n];
		
		//Use hasNextInt and hasNextFloat to input numbers to arrays until "aa" or 'q' is entered.
		for (int i = 0; i < n; i++)
		{
			//Process integers.
			if (in.hasNextInt())
			{
				intArray[intCount] = in.nextInt();
				intCount++;
				
			}
			//Process floats.
			else if(in.hasNextFloat())
			{
				floatArray[floatCount] = in.nextFloat();
				floatCount++;
			}
			
			//Process anything that isn't an integer or a float.
			else
			{
				//Handle 'aa' case.
				if (in.next().equals("aa"))
				{
					i = n;
				}
				
				//Handle 'q' case.
				if (in.next().equals("q"))
				{
					i = n;
				}
			}
				
		}
		
		//Close the scanner.
		in.close();
		
		//Print out integers.
		System.out.println("Integers: " + Arrays.toString(intArray));
		
		//Print out floats.
		System.out.println("Floats: " + Arrays.toString(floatArray));
		
	}

}