/**
 * Lab 04 - AStackDriver
 * @author geoffwacker, kevinliu
 * 10.04.15
 */

import java.util.*;

public class AStackDriver 
{
	public static void main(String [ ] args)
	{
		//Variable declaration.
		char input = 'a';
			
		//Create an 5 unit integer stack.
		AStack<Integer> intStack = new AStack<Integer>(5);
			
		//Create a scanner.
		Scanner in = new Scanner(System.in);
			
		//Loop to ask for input.
		while (input != 'q')
		{
			System.out.println("Choose one of the following operations: ");
			System.out.println("- add/push (enter the letter a) ");
			System.out.println("- delete/pop (Enter the letter d) ");
			System.out.println("- peek (Enter the letter p) ");
			System.out.println("- isEmpty (enter the letter e) ");
			System.out.println("- quit (enter the letter q) ");
			input = in.nextLine().charAt(0);
			
			//Switch statement to handle input.
			switch (input)
			{
				//User wants to add.
				case 'a':
				{
					System.out.println("What would you like to add?");
					try
					{
						int pushInput = in.nextInt();
						intStack.push(pushInput);
						System.out.println(pushInput + " added");
						in.nextLine();
						break;
					}
					catch (InputMismatchException i)
					{
						System.out.println("Invalid push input!");
						in.nextLine();
						break;
					}
				}
				
				//User wants to delete.
				case 'd':
				{
					Integer intPopOutput = intStack.pop();
					
					if (intPopOutput == null)
					{
						break;
					}
					else
					{
						System.out.println(intPopOutput + " deleted");
						break;
					}	

				}
				
				//User wants to peek.
				case 'p':
				{
					
					if (intStack.peek() == null)
					{
						break;
					}
					else
					{
						System.out.println(intStack.peek());
						break;
					}
				}
				
				//User wants to see if stack is empty.
				case 'e':
				{
					System.out.println(intStack.isEmpty());
					break;
				}
				
				//User wants to quit.
				case 'q':
				{
					in.close();
					//Empty the queue, one value at a time, separated by spaces.
					while (!intStack.isEmpty())
					{
						System.out.print(intStack.pop() + " ");
					}
					break;
				}
				
				//User entered invalid input.
				default:
				{
					System.out.println("Invalid menu input!");
					break;
				}	
			}	
		}
	}		
}