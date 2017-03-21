package by.training.nc.dev3.beans;

import java.util.Objects;

import by.training.nc.dev3.exceptions.WrongValueException;
import by.training.nc.dev3.interfaces.ClientActions;

public class Client implements ClientActions {
	
	protected Float cash;
	protected Boolean paid = false;
	Menu menu;
	Order order;
	Bill bill;
	protected static Integer clientCounter = 0;
	
	public Client()
	{
		super();
		clientCounter++;
	}
	
	

	public Client(Float cash, Menu menu, Order order, Bill bill )
	{
		super();
		this.cash = cash;
		this.menu = menu;
		this.order = order;
		this.bill = bill;
		clientCounter++;
	}
	
	@Override
	public boolean equals(Object otherObject)
	{
		if (this == otherObject) 
			return true;
		if (otherObject == null) 
			return false;
		if (getClass() != otherObject.getClass())
			return false;
		Client other = (Client) otherObject;
		return Objects.equals(menu, other.menu)  &&
				Objects.equals(order, other.order) &&
				Objects.equals(bill, other.bill) &&
				cash == other.cash && paid == other.paid;
	}

	
	@Override
	public int hashCode()
	{
		return Objects.hash(cash, paid, menu, order, bill);
	}

	@Override 
	public String toString()
	{
		return "Client with " + cash + "$, which has paid =  " + paid;
	}
	
	public void setCash (Float cash)
	{
		this.cash = cash;
	}
	
	public Float getCash()
	{
		return cash;
	}
	
	public Boolean getPaid()
	{
		return paid;
	}
	
	public void setMenu(Menu menu)
	{
		this.menu = menu;
	}
	
	public Menu getMenu()
	{
		return menu;
	}
	
	public void setOrder(Order order)
	{
		this.order = order;
	}
	
	public Order getOrder()
	{
		return order;
	}
	
	public void setBill(Bill bill)
	{
		this.bill = bill;
	}
	
	public Bill getBill()
	{
		return bill;
	}
	
	public void addToOrder(Food food) throws WrongValueException
	{
		if (food == null)
		{
			throw new WrongValueException();
		}
		order.getResultOrder().add(food.getName());
		order.sumValue(food.getValue());
	}
	
	public void removeFromOrder(Food food) throws WrongValueException
	{
		if (food == null)
		{
			throw new WrongValueException();
		}
		order.removePosition(food.getName());
	}
	
	public void viewOrder()
	{
		System.out.println("I've ordered:");
		for (String item: order.getResultOrder())
		{
			System.out.println(item);
		}
		System.out.println("And the total cost will be: " + order.getResultValue() + "$");
	}
	
	public void clearOrder()
	{
		order.resultOrder.clear();
		order.resultValue = 0f;
	} 
	
	
	public Boolean pay()
	{
		if (cash > order.resultValue)
		{
			System.out.println("It's okay... I'm paynig...");
			paid = true;
		}
		else if (cash < order.resultValue)
		{
			System.out.println("I don't have enough money...");
			paid = false;
		}
		cash -= order.resultValue;
		return paid;
	}
	
	public void tip()
	{
		if (paid == true)
		{
			System.out.println("I'm giving you some tips...");
		}
		else
		{
			System.out.println("Sorry, don't have money...");
		}
	}
	
	public Integer getClientCounter()
	{
		return clientCounter;
	}
	
	
}
