package by.training.nc.dev3.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import by.training.nc.dev3.beans.Client;
import by.training.nc.dev3.beans.Menu;

/**
 * 
 * Serialization for Client objects
 * 
 * @author Сергей
 *
 */
public class ClientSerializer {

	
	/**
	 * Serializes the Client object
	 * 
	 * @param bill
	 */
	public static void serializer(Client client)
	{
		String filename = "C:\\Users\\Сергей\\workspace\\netcracker\\NC-Restraunt\\Restraunt\\src\\main\\java\\by\\training\\nc\\dev3\\files\\input\\client.ser";

		try 
		{
			FileOutputStream fs = new FileOutputStream(filename);
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(client);
			os.close();
		}
		catch (NotSerializableException e)
		{
			System.out.println("Object can't be serialized!");
		} catch (IOException e) {
			System.err.println(e);;
		}
	}
	
	
	/**
	 * 
	 * Deserializes the Bill object
	 * 
	 * @return
	 * @throws InvalidObjectException
	 */
	public static Client deserialization() throws InvalidObjectException
	{
		String filename = "C:\\Users\\Сергей\\workspace\\netcracker\\NC-Restraunt\\Restraunt\\src\\main\\java\\by\\training\\nc\\dev3\\files\\input\\client.ser";

		ObjectInputStream os = null;
		try 
		{
			FileInputStream fs = new FileInputStream(filename);
			os = new ObjectInputStream(fs);
			Object ob = os.readObject();
			Client c = (Client) ob;
			//os.mlose();
			return c;
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Can't find file to recover object from!");
		}
		catch (IOException e)
		{
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println("Can't match class");
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
