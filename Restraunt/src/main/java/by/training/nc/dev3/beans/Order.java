package by.training.nc.dev3.beans;

import java.util.*;

public class Order {

	protected List<String> resultOrder = new ArrayList<String>();
	protected Float resultValue;
	
	public Order()
	{
		super();
	}
	
	public Order(List<String> resultOrder, Float resultValue)
	{
		super();
		this.resultOrder = resultOrder;
		this.resultValue = resultValue;
	} 
	
	public void setResultOrder(List<String> resultOrder)
	{
		this.resultOrder = resultOrder;
	}
	
	public List<String> getResultOrder()
	{
		return resultOrder;
	}
	
	public void setResultValue(Float resultValue)
	{
		this.resultValue = resultValue;
	}
	
	public Float getResultValue()
	{
		return resultValue;
		
	}	
	public void sumValue(Float val)
	{
		resultValue += val;
	}
	
	public void removePosition(String name)
	{
		resultOrder.remove(name);
		
		//TODO
		// Removing value of the position from the order
		
	}
	
	
}
