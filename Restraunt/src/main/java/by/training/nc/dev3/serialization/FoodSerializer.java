package by.training.nc.dev3.serialization;

import java.io.*;

import by.training.nc.dev3.beans.Food;


/**
 * 
 * Serialization for Food objects
 * 
 * @author Сергей
 *
 */
public class FoodSerializer {

	
	/**
	 * Serializes the Food object
	 * 
	 * @param bill
	 */
	public static void serializer(Food food)
	{
		String filename = "C:\\Users\\Сергей\\workspace\\netcracker\\NC-Restraunt\\Restraunt\\src\\main\\java\\by\\training\\nc\\dev3\\files\\input\\food.ser";
		try 
		{
			FileOutputStream fs = new FileOutputStream(filename);
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(food);
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
	 * Deserializes the Food object
	 * 
	 * @return
	 * @throws InvalidObjectException
	 */
	public static Food deserialization() throws InvalidObjectException
	{
		String filename = "C:\\Users\\Сергей\\workspace\\netcracker\\NC-Restraunt\\Restraunt\\src\\main\\java\\by\\training\\nc\\dev3\\files\\input\\food.ser";
		ObjectInputStream os = null;
		try 
		{
			FileInputStream fs = new FileInputStream(filename);
			os = new ObjectInputStream(fs);
			Object ob = os.readObject();
			Food f = (Food) ob;
			//os.close();
			return f;
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
