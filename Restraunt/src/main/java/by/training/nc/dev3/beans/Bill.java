package by.training.nc.dev3.beans;

import java.util.*;

public class Bill extends Order {
	
	GregorianCalendar date;
	
	public Bill()
	{
		super();
	}
	
	public Bill(GregorianCalendar date)
	{
		super();
		this.date = date;
	}
	
	public void setDate(GregorianCalendar date)
	{
		this.date = date;
	}
	
	public GregorianCalendar getDate()
	{
		return date;
	}

}
