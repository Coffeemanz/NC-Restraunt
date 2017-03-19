package by.training.nc.dev3.beans;

import by.training.nc.dev3.enums.*;

public class Waiter extends Staff {
	
	protected Statuses status;
	
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
	
	public static void main(String[] args)
	{
		
		System.out.println("Running");
		System.out.println("Running");
		System.out.println("Running");
		
//		Waiter wt = new Waiter();
//		wt.setId(1);
//		wt.setName("Sergey");
//		wt.setStatus(Statuses.FREE);
//		
//		System.out.println("Waiter " + wt.getName() + " with ID " + wt.getId() + " is " + wt.getStatus());
	}

}
