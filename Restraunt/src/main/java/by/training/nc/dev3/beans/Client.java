package by.training.nc.dev3.beans;

import by.training.nc.dev3.interfaces.ClientActions;

public class Client implements ClientActions {
	
	protected Float cash;
	protected Boolean paid = false;
	Menu menu;
	Order order;
	Bill bill;
	
	public Client()
	{
		super();
	}
	
	public Client(Float cash, Menu menu, Order order, Bill bill )
	{
		super();
		this.cash = cash;
		this.menu = menu;
		this.order = order;
		this.bill = bill;
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
	
	public void addToOrder(Food food)
	{
		order.getResultOrder().add(food.getName());
		order.sumValue(food.getValue());
	}
	
	public void removeFromOrder(Food food)
	{
		order.removePosition(food.getName());
	}
	
	public void viewOrder()
	{
		System.out.println("I've ordered:");
		for (String item: order.getResultOrder())
		{
			System.out.println(item);
		}
		System.out.println("And the total cost wiil be: " + order.getResultValue());
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
			System.out.println("I'm paynig...");
			paid = true;
		}
		else if (cash < order.resultValue)
		{
			System.out.println("i don't have enough money...");
			paid = false;
		} 
		return paid;
	}
	
	public void tip()
	{
		if (paid = true)
		{
			System.out.println("I'm giving you some tips...");
		}
	}
	
	
}
