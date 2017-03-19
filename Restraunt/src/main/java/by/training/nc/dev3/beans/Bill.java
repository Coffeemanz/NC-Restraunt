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
		return Objects.equals(resultOrder, other.resultOrder)  &&
				resultValue == other.resultValue && Objects.equals(date, other.date);
	}

	
	@Override
	public int hashCode()
	{
		return Objects.hash(resultOrder, resultValue, date);
	}

	@Override 
	public String toString()
	{
		return "Bill: " + resultOrder + " = " + resultValue + "." + date;
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
