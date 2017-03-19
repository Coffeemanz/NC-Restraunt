package by.training.nc.dev3.interfaces;

import by.training.nc.dev3.beans.Bill;
import by.training.nc.dev3.beans.Order;

public interface WaiterActions {
	
	boolean acceptOrder(Order order);
	void giveBill(Bill bill);
	void callPolice();

}
