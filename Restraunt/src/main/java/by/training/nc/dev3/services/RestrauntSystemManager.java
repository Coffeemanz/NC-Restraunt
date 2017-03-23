package by.training.nc.dev3.services;

import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import by.training.nc.dev3.beans.*;
import by.training.nc.dev3.exceptions.WrongValueException;
import by.training.nc.dev3.serialization.BillSerializer;
import by.training.nc.dev3.serialization.ClientSerializer;
import by.training.nc.dev3.serialization.MenuSerializer;
import by.training.nc.dev3.serialization.OrderSerializer;
import by.training.nc.dev3.serialization.WaiterSerializer;
import by.training.nc.dev3.services.*;

public class RestrauntSystemManager {

	public static void clientWorking(Client client, Waiter waiter)
	{
		System.out.println("Welcome to out restraunt!");
		System.out.println("What would you like to do?");
		while(true)
		{
			System.out.println("---------------------");
			System.out.println("1. View menu.");
			System.out.println("0. Exit");
			System.out.println("---------------------");

			switch (ClientUtils.getNumber())
			{
			case 1:
				System.out.println("Today we have in menu:");
				System.out.println(client.getMenu());
				while(true)
				{
					System.out.println("1. What would you like to add to order?");
					System.out.println("2. What would you like to remove from order?");
					System.out.println("3. View the order.");
					System.out.println("4. Clear the order.");
					System.out.println("5. Accept the order.");
					System.out.println("0. Exit.");
					
					switch(ClientUtils.getNumber())
					{
					case 1:
						String inputFoodAdd= ClientUtils.getString();
						for (Food food : client.getMenu().getListOfFood())
						{
							if (inputFoodAdd.equals(food.getName()))
							{
								try {
									client.addToOrder(food);
								} catch (WrongValueException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
						break;
					case 2:
						String inputFoodRemove = ClientUtils.getString();
						for (Food food : client.getMenu().getListOfFood())
						{
							if (inputFoodRemove.equals(food.getName()))
							{
								try {
									client.removeFromOrder(food);
								} catch (WrongValueException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
						break;
					case 3:
						System.out.println(client.getOrder());
						break;
					case 4:
						client.clearOrder();
						break;
					case 5:
						try {
							waiter.acceptOrder(client.getOrder());
						} catch (WrongValueException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("What would you like to do next?");
						while(true)
						{
							System.out.println("1. View bill");
							System.out.println("2. Pay");
							System.out.println("3. Give tip");
							switch(ClientUtils.getNumber())
							{
							case 1:
								try {
									waiter.giveBill(client.getBill());
								} catch (WrongValueException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								break;
							case 2:
								client.pay();
								break;
							case 3:
								client.tip();
								break;
							}
						}
						
						
					case 0:
						System.out.println("Good bye!");
						System.exit(0);
						break;
					default:
						System.out.println("You should choose something.");
						break;
						
					}
				}

			case 0:
				System.out.println("Good bye!");
				System.exit(0);
				break;
			default:
				System.out.println("You should choose something.");
				break;
			}
			
		}
		
	}
	
	public static void startMenu()
	{
		Initialization.initialize();
		
//		Menu menu = null;
//		try {
//			menu = MenuSerializer.deserialization();
//		} catch (InvalidObjectException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Order order = null;
//		try {
//			order = OrderSerializer.deserialization();
//		} catch (InvalidObjectException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Bill bill = null;
//		try {
//			bill = BillSerializer.deserialization();
//		} catch (InvalidObjectException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Waiter waiter = null;
		try {
			waiter = WaiterSerializer.deserialization();
		} catch (InvalidObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Client client = null;
		try {
			client = ClientSerializer.deserialization();
		} catch (InvalidObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		clientWorking(client, waiter);
	}
}

//Iterator it = client.getMenu().getListOfFood().entrySet().iterator();
//while (it.hasNext())
//{
//	Map.Entry pair = (Map.Entry)it.next();
//	
//	Food f = (Food)pair.getKey();
//	//System.out.println(f.getName() + " = " +  f.getValue() + "$" + ". Quantity: " + pair.getValue());
//	if (inputFood == f.getName())
//	{
//		try {
//			client.addToOrder(f);
//		} catch (WrongValueException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	it.remove();
//
