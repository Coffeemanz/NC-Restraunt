package by.training.nc.dev3.dao;

public class Menu_entity {
	private int product_id;
	private String product_name;
	private Double price;
	private int client_id;
	
	public Menu_entity(){}
	
	public Menu_entity(int product_id, String product_name, Double price, int client_id)
	{
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
		this.client_id = client_id;
	}
	
	public String toString()
	{
		return "Menu: [" + product_id + "\t" + product_name + "\t" + price + "$\t" + client_id;
	}

}
