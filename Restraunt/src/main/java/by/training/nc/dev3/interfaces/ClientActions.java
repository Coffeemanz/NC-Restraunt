package by.training.nc.dev3.interfaces;

import by.training.nc.dev3.beans.Food;

public interface ClientActions {

	void addToOrder(Food food);
	void removeFromOrder(Food food);
	void viewOrder();
	void clearOrder();
	Boolean pay ();
	void tip();
	
}
