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

/**
 * 
 * Initialization class
 * 
 * 
 * @author Сергей
 *
 */
public class Initialization {

	public static void initialize()
	{
		
		
		Food f1 = new Food("Banana", 3f);
		Food f2 = new Food ("Apple", 2f);
		Food f3 = new Food("Chicken", 6f);
		Food f4 = new Food("Spaghetti", 5f);
		Food f5 = new Food("Salad", 1f);
		Food f6 = new Food("Soup", 5f);
		Food f7 = new Food("Pizza", 4f);
		Food f8 = new Food("Beer", 3f);
		Food f9 = new Food("Juice", 1f);
		Food f10 = new Food("Cocktail", 1f);
		Food f11 = new Food ("Olivie", 3f);
		
		Menu m = new Menu();
		try {
			m.addFood(f1);
			m.addFood(f2);
			m.addFood(f3);
			m.addFood(f4);
			m.addFood(f5);
			m.addFood(f6);
			m.addFood(f7);
			m.addFood(f8);
			m.addFood(f9);
			m.addFood(f10);
			m.addFood(f11);
		} catch (WrongValueException e1) {
			System.out.println("You should enter a correct value.");
		}
		//MenuSerializer.serializer(m);
//		Menu m_new = null;
//		try {
//			m_new = MenuSerializer.deserialization();
//		} catch (InvalidObjectException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		Order o = new Order();
		//OrderSerializer.serializer(o);
//		Order o_new = null;
//		try {
//			o_new = OrderSerializer.deserialization();
//		} catch (InvalidObjectException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		Bill b = new Bill();
		b.setOrder(o);
		//BillSerializer.serializer(b);
//		Bill b_new = null;
//		try {
//			b_new = BillSerializer.deserialization();
//		} catch (InvalidObjectException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		Client c = new Client(25F, m, o, b);
		ClientSerializer.serializer(c);

		
		Waiter w = new Waiter("Petrov Sasha", 23, Statuses.FREE);
		WaiterSerializer.serializer(w);
//		Client c_new = null;
//		try {
//			c_new = ClientSerializer.deserialization();
//		} catch (InvalidObjectException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
}
