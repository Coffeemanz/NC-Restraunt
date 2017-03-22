package by.training.nc.dev3.services;

import by.training.nc.dev3.beans.*;
import by.training.nc.dev3.exceptions.WrongValueException;
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
		Food f1 = new Food("Banana", 10f);
		Food f2 = new Food ("Apple", 8f);
		Food f3 = new Food("Chicken", 13f);
		
		Menu m1 = new Menu();
		try {
			m1.addFood(f1, 10);
			m1.addFood(f2, 19);
			m1.addFood(f3, 1);
		} catch (WrongValueException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		//System.out.println("Hello! Today we have in menu:");
		//System.out.println(m1);
		
		Client cl1 = new Client();
		cl1.setCash(100F);
		cl1.setMenu(m1);
		
		Order or1 = new Order();
		cl1.setOrder(or1);
		

		try {
			cl1.addToOrder(f1);
			cl1.addToOrder(f2);
		} catch (WrongValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		

		
		Waiter wt1 = new Waiter();
		
		try {
			wt1.acceptOrder(or1);
		} catch (WrongValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		cl1.viewOrder();
		
		Bill bl1 = new Bill();
		
		
		bl1.setOrder(or1);
		//bl1.setDate(new GregorianCalendar());
		try {
			wt1.giveBill(bl1);
		} catch (WrongValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		//cl1.pay();
		//cl1.tip();
		clientWorking(cl1);
	}
}
