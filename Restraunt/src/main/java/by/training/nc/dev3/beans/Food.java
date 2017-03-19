package by.training.nc.dev3.beans;

import java.util.Objects;

public class Food {

	protected String name;
	protected Float value;
	
	public Food()
	{
		super();
	}
	
	public Food(String name, Float value)
	{
		super();
		this.name = name;
		this.value = value;
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
		Food other = (Food) otherObject;
		return name == other.name  &&
				value == other.value;
	}

	
	@Override
	public int hashCode()
	{
		return Objects.hash(name, value);
	}

	@Override 
	public String toString()
	{
		return "Food: " + name + " = " + value;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setValue(Float value)
	{
		this.value = value;
	}
	
	public Float getValue()
	{
		return value;
	}
			
	
}
