package by.training.nc.dev3.beans;


import java.util.*;

import by.training.nc.dev3.exeptions.WrongValueException;

public class Menu {

	protected Map<Food, Integer> listOfFood;
	protected static Integer menuCounter = 0;
	
	public Menu()
	{
		super();
		listOfFood = new HashMap<Food, Integer>();
		menuCounter++;
		
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
		Menu other = (Menu) otherObject;
		return Objects.equals(listOfFood, other.listOfFood);
	}

	
	@Override
	public int hashCode()
	{
		return Objects.hash(listOfFood);
	}

	@Override 
	public String toString()
	{
		Iterator it = listOfFood.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
			
			Food f = (Food)pair.getKey();
			System.out.println(f.getName() + " = " +  f.getValue() + "$" + ". Quantity: " + pair.getValue());
			it.remove();
		}
		return " ";
	}


	public void setListOfFood(Map<Food, Integer> listOfFood)
	{
		this.listOfFood = listOfFood;
	}
	
	public Map<Food, Integer> getListOfFood()
	{
		return listOfFood;
	}
	
	public void addFood(Food food, Integer count) throws WrongValueException
	{
		if (food == null)
		{
			throw new WrongValueException();
		}
		listOfFood.put(food, count);
	}
	
	public void removeFood(Food food) throws WrongValueException
	{
		if (food == null)
		{
			throw new WrongValueException();
		}
		listOfFood.remove(food);
	}
	
	public Integer getMenuCounter()
	{
		return menuCounter;
	}
	
	public static void main(String[] args)
	{
		Food f1 = new Food("Banana", 10f);
		Food f2 = new Food("Apple", 5f);
		Food f3 = new Food("Coconut", 8f);
		
		Menu m1 = new Menu();
		m1.addFood(f1, 2);
		m1.addFood(f2, 1);
		m1.addFood(f3, 10);
		
		Map mp = m1.getListOfFood();
		
		System.out.println(m1);
		
//		Iterator it = mp.entrySet().iterator();
//		while (it.hasNext())
//		{
//			Map.Entry pair = (Map.Entry)it.next();
//			
//			Food f = (Food)pair.getKey();
//			System.out.println(f.getName() + " = " + pair.getValue());
//			it.remove();
//		}
		
		
	}
	
		
}
