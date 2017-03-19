package by.training.nc.dev3.beans;

import by.training.nc.dev3.enums.*;
import by.training.nc.dev3.interfaces.WaiterActions;

public class Waiter extends Staff implements WaiterActions {
	
	protected Statuses status;
	protected boolean ordered = false;
	
	public Waiter()
	{
		super();
	}
	
	public Waiter(Statuses status)
	{
		super();
		this.status = status;
	}
	
	public void setStatus(Statuses status)
	{
		this.status = status;
	}
	
	public Statuses getStatus()
	{
		return status;
	}
	
	public boolean getOrdered()
	{
		return ordered;
	}
	
	public boolean acceptOrder(Order order)
	{
		System.out.println("Let me check your order:");
		for (String item: order.getResultOrder())
		{
			System.out.println(item);
		}
		System.out.println("And the total cost is: " + order.getResultValue());
		ordered = true;
		return ordered;
	}
	
	public void giveBill(Bill bill)
	{
		System.out.println("Here's your bill");
		System.out.println("You ordered:");
		for (String item: bill.getResultOrder())
		{
			System.out.println(item);
		}
		System.out.println("And the total cost is: " + bill.getResultValue());
		System.out.println("Today is " + bill.getDate());
	}
	
	public void callPolice()
	{
		System.out.println("Oh my god! You don't have enough money!");
		System.out.println("I'm calling 911...");
	}
//	public static void main(String[] args)
//	{
//		
//		System.out.println("Running");
//		
//		Waiter wt = new Waiter();
//		wt.setId(1);
//		wt.setName("Sergey");
//		wt.setStatus(Statuses.FREE);
//		
//		System.out.println("Waiter " + wt.getName() + " with ID " + wt.getId() + " is " + wt.getStatus());
//	}

}
