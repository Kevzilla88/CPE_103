/**
 * Lab 04 - AStackClient
 * @author geoffwacker, kevinliu
 * 10.04.15
 */

import java.io.File;
import java.util.*;

public class AStackClient 
{
	public static void main(String [ ] args)
	{
		try 
		{
			//Create three stacks.
			AStack<String> stringStack = new AStack<String>(5);
			AStack<Float> floatStack = new AStack<Float>(5);
			AStack<Integer> intStack = new AStack<Integer>(5);
			
			//Create the scanner.
            Scanner input = new Scanner(System.in);
            
            //Get the file name.
            System.out.println("Enter the full file name: ");
            File file = new File(input.nextLine());

            //Feed the file to the scanner.
            input = new Scanner(file);

            //Keep going through the file to the end.
            while (input.hasNext()) 
            {
            	//Check if next element is an integer.
            	if (input.hasNextInt())
                {
                	intStack.push(input.nextInt());
                	
                }
            	
            	//Check if next element is a float.
            	else if (input.hasNextFloat())
            	{
            		floatStack.push(input.nextFloat());
            	}
            		
            	//Next element must be a string.
            	else if (input.hasNext())
            	{
            		stringStack.push(input.next());
            	}
            }
            
            //Close the scanner since we're done.
            input.close();
            
            //Print out the strings.
            System.out.print("\nStrings: ");
            while (!stringStack.isEmpty())
            {
            	System.out.print(stringStack.pop() + " ");;
            }
            
            //Print out the floats.
            System.out.print("\nFloats: ");
            while (!floatStack.isEmpty())
            {
            	System.out.print(floatStack.pop() + " ");;
            }
            
          //Print out the integers.
            System.out.print("\nIntegers: ");
            while (!intStack.isEmpty())
            {
            	System.out.print(intStack.pop() + " ");;
            }
        } 
		
		//Catch any exceptions.
		catch (Exception e) 
		{
            e.printStackTrace();
        }
	}
}