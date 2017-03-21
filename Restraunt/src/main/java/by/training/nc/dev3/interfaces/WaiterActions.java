package by.training.nc.dev3.interfaces;

import by.training.nc.dev3.beans.Bill;
import by.training.nc.dev3.beans.Order;
import by.training.nc.dev3.exeptions.WrongValueException;

public interface WaiterActions {
	
	boolean acceptOrder(Order order) throws WrongValueException;
	void giveBill(Bill bill) throws WrongValueException;
	void callPolice();

}
