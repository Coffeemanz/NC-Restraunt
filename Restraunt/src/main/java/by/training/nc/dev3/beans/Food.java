package by.training.nc.dev3.beans;

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
