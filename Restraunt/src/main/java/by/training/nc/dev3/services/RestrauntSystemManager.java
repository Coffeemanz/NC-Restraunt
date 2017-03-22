package by.training.nc.dev3.services;

import java.io.InvalidObjectException;

import by.training.nc.dev3.beans.*;
import by.training.nc.dev3.exceptions.WrongValueException;
import by.training.nc.dev3.serialization.ClientSerializer;
import by.training.nc.dev3.serialization.MenuSerializer;
import by.training.nc.dev3.serialization.OrderSerializer;
import by.training.nc.dev3.services.*;

public class RestrauntSystemManager {

	public static void clientWorking(Client client)
	{
		System.out.println("Welcome to out restraunt!");
		System.out.println("What would you like to do?");
		while(true)
		{
			System.out.println("---------------------");
			System.out.println("1. View menu");
			System.out.println("0. Exit");
			System.out.println("---------------------");
			
			switch (ClientUtils.getNumber())
			{
			case 1:
				System.out.println("Today we have in menu:");
				System.out.println(client.getMenu());
			case 0:
				System.out.println("Good bye!");
				System.exit(0);
			}
			
		}
		
	}
	
	public static void startMenu()
	{
		Initialization.initialize();
		
		Client client = null;
		try {
			client = ClientSerializer.deserialization();
		} catch (InvalidObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		clientWorking(client);
	}
}
