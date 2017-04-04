package by.training.nc.dev3.interfaces;

import by.training.nc.dev3.beans.Bill;
import by.training.nc.dev3.beans.Food;
import by.training.nc.dev3.beans.Menu;
import by.training.nc.dev3.beans.Order;
import by.training.nc.dev3.exceptions.WrongValueException;

public interface ClientActions {

//	protected Float cash;
//	protected Boolean paid = false;
//	Menu menu;
//	Order order;
//	Bill bill;
//	
//	void addToOrder(Food food) throws WrongValueException
//	{
//		if (food == null)
//		{
//			throw new WrongValueException();
//		}
//		order.getResultOrder().add(food.getName());
//		order.sumValue(food.getValue());
//		cash -= food.getValue();
//	}
//	
//	void removeFromOrder(Food food) throws WrongValueException
//	{
//		if (food == null)
//		{
//			throw new WrongValueException();
//		}
//		order.removePosition(food);
//		cash += food.getValue();
//	}
//	void viewOrder()
//	{
//		System.out.println("I've ordered:");
//		for (String item: order.getResultOrder())
//		{
//			System.out.println(item);
//		}
//	}
//	void clearOrder()
//	{
//		cash += order.getResultValue();
//		order.getResultOrder().clear();
//		order.setResultValue(0f);
//	}
//	Boolean pay ()
//	{
//		System.out.println("It's okay... I'm paynig...");
//		paid = true;
//
////		else if (cash < order.resultValue)
////		{
////			System.out.println("I don't have enough money...");
////			paid = false;
////		}
//		//cash -= order.resultValue;
//		return paid;
//	}
//	void tip(int inputNumber)
//	{
//		if (inputNumber <= cash)
//		{
//		System.out.println("I'm giving you some tips...");
//		cash -= inputNumber;
//		}
//		else
//		{
//			System.out.println("Sorry, don't have money...");
//		}
//	}
	
	void addToOrder(Food food) throws WrongValueException;
	void removeFromOrder(Food food) throws WrongValueException;
	void viewOrder();
	void clearOrder();
	Boolean pay ();
	void tip(int inputNumber);
	
}
