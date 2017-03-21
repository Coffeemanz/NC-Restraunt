package by.training.nc.dev3.beans;

import java.util.Objects;

import by.training.nc.dev3.enums.*;
import by.training.nc.dev3.exeptions.WrongValueException;
import by.training.nc.dev3.interfaces.WaiterActions;

public class Waiter extends Staff implements WaiterActions {
	
	protected Statuses status;
	protected boolean ordered = false;
	
	public Waiter()
	{
		super();
		staffCounter++;
	}
	
	public Waiter(Statuses status)
	{
		super();
		this.status = status;
		staffCounter++;
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
		Waiter other = (Waiter) otherObject;
		return Objects.equals(status, other.status)  &&
				ordered == other.ordered && name == other.name &&
				id == other.id;
	}

	
	@Override
	public int hashCode()
	{
		return Objects.hash(status, ordered, name, id);
	}

	@Override 
	public String toString()
	{
		return "Waiter " + name + " with id = " + id + " is " + status;
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
	
	public boolean acceptOrder(Order order) throws WrongValueException
	{
		if (order == null)
		{
			throw new WrongValueException();
		}
		
		System.out.println("Let me check your order:");
		for (String item: order.getResultOrder())
		{
			System.out.println(item);
		}
		System.out.println("And the total cost is: " + order.getResultValue() + "$");
		ordered = true;
		return ordered;
	}
	
	public void giveBill(Bill bill) throws WrongValueException
	{
		//TODO add date to giveBill
		if (bill == null)
		{
			throw new WrongValueException();
		}
		
		System.out.println("Here's your bill");
		System.out.println("You ordered:");
		for (String item: bill.order.resultOrder)
		{
			System.out.println(item);
		}
		System.out.println("And the total cost is: " + bill.order.getResultValue());
		//System.out.println("Today is " + bill.getDate());
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
