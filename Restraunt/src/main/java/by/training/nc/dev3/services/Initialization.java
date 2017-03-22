package by.training.nc.dev3.services;

import by.training.nc.dev3.enums.*;
import by.training.nc.dev3.exceptions.WrongValueException;

import java.io.InvalidObjectException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import by.training.nc.dev3.beans.*;
import by.training.nc.dev3.interfaces.*;
import by.training.nc.dev3.serialization.*;


//Initialization With serialization
public class Initialization {

	public static void main(String[] main)
	{
		System.out.println("NOW IN INIT CLASS");
		
		Food f1 = new Food("Banana", 3f);
		Food f2 = new Food ("Apple", 2f);
		Food f3 = new Food("Chicken", 6f);
		Food f4 = new Food("Spaghetti", 5f);
		Food f5 = new Food("Chicken", 6f);
		Food f6 = new Food("Soup", 5f);
		Food f7 = new Food("Pizza", 4f);
		Food f8 = new Food("Beer", 3f);
		Food f9 = new Food("Juice", 1f);
		Food f10 = new Food("Cocktail", 1f);
		
		Menu m = new Menu();
		try {
			m.addFood(f1, 3);
			m.addFood(f2, 2);
			m.addFood(f3, 5);
			m.addFood(f4, 1);
			m.addFood(f5, 1);
			m.addFood(f6, 0);
			m.addFood(f7, 5);
			m.addFood(f8, 0);
			m.addFood(f9, 0);
			m.addFood(f10, 3);
		} catch (WrongValueException e1) {
			e1.printStackTrace();
		}
		MenuSerializer ms = new MenuSerializer();
		ms.serializer(m);
		Menu m_new = null;
		try {
			m_new= ms.deserialization();
		} catch (InvalidObjectException e) {
			e.printStackTrace();
		}
		
		Order o = new Order();
		OrderSerializer os = new OrderSerializer();
		os.serializer(o);
		Order o_new = null;
		try {
			o_new = os.deserialization();
		} catch (InvalidObjectException e) {
			// TODO Auto-generated catch block
		}
		
		Bill b = new Bill();
		b.setOrder(o);
		BillSerializer bs = new BillSerializer();
		bs.serializer(b);
		Bill b_new = null;
		try {
			b_new = bs.deserialization();
		} catch (InvalidObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Client c = new Client(50F, m, o, b);
		ClientSerializer cs = new ClientSerializer();
		cs.serializer(c);
		Client c_new = null;
		try {
			c_new = cs.deserialization();
		} catch (InvalidObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		System.out.println(m_new);
		System.out.println(o_new);
		System.out.println(b_new);
		System.out.println(c_new);
		System.out.println(c_new.getMenu());
		
		
		
//		Food f1 = new Food("Banana", 10f);
//		Food f2 = new Food ("Apple", 8f);
//		Food f3 = new Food("Chicken", 13f);
//		
//		Menu m1 = new Menu();
//		try {
//			m1.addFood(f1, 10);
//			m1.addFood(f2, 19);
//			m1.addFood(f3, 1);
//		} catch (WrongValueException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		
//		System.out.println("Hello! Today we have in menu:");
//		System.out.println(m1);
//		
//		Client cl1 = new Client();
//		cl1.setCash(100F);
//		cl1.setMenu(m1);
//		
//		Order or1 = new Order();
//		cl1.setOrder(or1);
//		
//
//		try {
//			cl1.addToOrder(f1);
//			cl1.addToOrder(f2);
//		} catch (WrongValueException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//		
//
//		
//		Waiter wt1 = new Waiter();
//		
//		try {
//			wt1.acceptOrder(or1);
//		} catch (WrongValueException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//
//		cl1.viewOrder();
//		
//		Bill bl1 = new Bill();
//		
//		
//		bl1.setOrder(or1);
//		bl1.setDate(new GregorianCalendar());
//		try {
//			wt1.giveBill(bl1);
//		} catch (WrongValueException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//
//		
//		cl1.pay();
//		cl1.tip();
//		
//		System.out.println(cl1.getClientCounter() + " " + f1.getFoodCounter() + " " + or1.getOrderCounter() + " " + m1.getMenuCounter() + " " + bl1.getBillCounter() +  " " + wt1.getStaffCounter());
		
		
		
		
		//System.out.println(cl1);
		
		
		
		
		
	}
	
}
