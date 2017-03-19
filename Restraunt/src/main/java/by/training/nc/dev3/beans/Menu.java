package by.training.nc.dev3.beans;


import java.util.*;

public class Menu {

	protected Map<Food, Integer> listOfFood;
	
	public Menu()
	{
		super();
		listOfFood = new HashMap<Food, Integer>();
		
	}

	public void setListOfFood(Map<Food, Integer> listOfFood)
	{
		this.listOfFood = listOfFood;
	}
	
	public Map<Food, Integer> getListOfFood()
	{
		return listOfFood;
	}
	
	public void addFood(Food food, Integer count)
	{
		listOfFood.put(food, count);
	}
	
	public void removeFood(Food food)
	{
		listOfFood.remove(food);
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
		
		Iterator it = mp.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
			
			Food f = (Food)pair.getKey();
			System.out.println(f.getName() + " = " + pair.getValue());
			it.remove();
		}
		
		
	}
	
		
}
