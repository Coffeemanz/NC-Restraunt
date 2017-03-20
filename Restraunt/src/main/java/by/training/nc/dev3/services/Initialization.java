package by.training.nc.dev3.services;

import by.training.nc.dev3.enums.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import by.training.nc.dev3.beans.*;
import by.training.nc.dev3.interfaces.*;

public class Initialization {

	public static void main(String[] main)
	{
		Food f1 = new Food("Banana", 10f);
		Food f2 = new Food ("Apple", 8f);
		Food f3 = new Food("Chicken", 13f);
		
		Menu m1 = new Menu();
		m1.addFood(f1, 10);
		m1.addFood(f2, 19);
		m1.addFood(f3, 1);
		
		System.out.println("Hello! Today we have in menu:");
		System.out.println(m1);
		
		Client cl1 = new Client();
		cl1.setCash(100F);
		cl1.setMenu(m1);
		
		Order or1 = new Order();
		cl1.setOrder(or1);
		
		cl1.addToOrder(f1);
		cl1.addToOrder(f2);
		
		Waiter wt1 = new Waiter();
		wt1.acceptOrder(or1);
		
		cl1.viewOrder();
		
		Bill bl1 = new Bill();
		
		
		bl1.setOrder(or1);
		//bl1.setDate(new GregorianCalendar());
		wt1.giveBill(bl1);
		
		cl1.pay();
		cl1.tip();
		
		System.out.println(cl1.getClientCounter() + " " + f1.getFoodCounter() + " " + or1.getOrderCounter() + " " + m1.getMenuCounter() + " " + bl1.getBillCounter() +  " " + wt1.getStaffCounter());
		
		
		
		
		//System.out.println(cl1);
		
		
		
		
		
	}
	
}
