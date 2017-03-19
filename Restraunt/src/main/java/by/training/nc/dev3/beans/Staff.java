package by.training.nc.dev3.beans;

public abstract class Staff {

	protected String name;
	protected Integer id;
	
	public Staff()
	{
		super();
	}
	
	public Staff(String name, Integer id)
	{
		super();
		this.name = name;
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setId(Integer id)
	{
		this.id = id;
	}
	
	public Integer getId()
	{
		return id;
	}
	
	
}
