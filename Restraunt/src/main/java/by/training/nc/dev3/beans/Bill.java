package by.training.nc.dev3.beans;

import java.io.Serializable;
import java.util.*;

public class Bill implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3837117297855240736L;
	Order order;
	GregorianCalendar date = new GregorianCalendar();
	protected static Integer billCounter = 0;
	
	public Bill()
	{
		super();
		billCounter++;;
	}
	
	public Bill(Order order, GregorianCalendar date)
	{
		super();
		this.order = order;
		this.date = date;
		billCounter++;
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
		Bill other = (Bill) otherObject;
		return Objects.equals(order, other.order) && Objects.equals(date, other.date);
	}

	
	@Override
	public int hashCode()
	{
		return Objects.hash(order, date);
	}

	@Override 
	public String toString()
	{
		//TODO add date to toString
		return "Bill: " + order + ".";
	}
	
	public void setOrder(Order order)
	{
		this.order = order;
	}
	
	public Order getOrder()
	{
		return order;
	}
	
	public void setDate(GregorianCalendar date)
	{
		this.date = date;
	}
	
	public GregorianCalendar getDate()
	{
		return date;
	}
	
	public Integer getBillCounter()
	{
		return billCounter;
	}

}
