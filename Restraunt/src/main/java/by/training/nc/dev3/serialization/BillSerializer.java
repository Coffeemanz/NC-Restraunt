package by.training.nc.dev3.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import by.training.nc.dev3.beans.Bill;
import by.training.nc.dev3.beans.Menu;

public class BillSerializer {
	
	public static void serializer(Bill bill)
	{
		String filename = "C:\\Users\\Сергей\\workspace\\netcracker\\NC-Restraunt\\Restraunt\\src\\main\\java\\by\\training\\nc\\dev3\\files\\input\\bill.ser";
		try 
		{
			FileOutputStream fs = new FileOutputStream(filename);
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(bill);
			os.close();
		}
		catch (NotSerializableException e)
		{
			System.out.println("Object can't be serialized!");
		} catch (IOException e) {
			System.err.println(e);;
		}
	}
	
	public static Bill deserialization() throws InvalidObjectException
	{
		String filename = "C:\\Users\\Сергей\\workspace\\netcracker\\NC-Restraunt\\Restraunt\\src\\main\\java\\by\\training\\nc\\dev3\\files\\input\\bill.ser";
		ObjectInputStream os = null;
		try 
		{
			FileInputStream fs = new FileInputStream(filename);
			os = new ObjectInputStream(fs);
			Object ob = os.readObject();
			Bill b = (Bill) ob;
			//os.mlose();
			return b;
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Can't find file to recover object from!");
		}
		catch (IOException e)
		{
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally	
		{
			try 
			{
				if (os != null)
				{
					os.close();
				}
			}
			catch (IOException e)
			{
				System.err.println("Error with closing the flow!");
			}
		}
		throw new InvalidObjectException("Object was't recovered");
		
	}

}
