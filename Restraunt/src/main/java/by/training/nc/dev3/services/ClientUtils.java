package by.training.nc.dev3.services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientUtils {
	
	private static Scanner scanner;
	
	public static int getNumber()
	{
		int chosen = -1;
		
		while (chosen < 0)
		{
			try 
			{
				scanner = new Scanner(System.in);
				chosen = scanner.nextInt();
				if (chosen >= 0)
				{
					break;
				}
				else 
				{
					System.out.println("Enter a correct number...");
				}
			}
				catch(InputMismatchException e)
				{
					System.out.println("You should enter a number...");
				}
			}
		
		return chosen;
	}

}
