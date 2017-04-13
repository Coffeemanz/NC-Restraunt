package by.training.nc.dev3.entities;

import by.training.nc.dev3.dao.interfaces.Identified;

public class MenuEntity implements Identified<Integer> {
	
	private int id;
	private String product_name;
	private String product_description;
	private Float product_price;
	
	public MenuEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MenuEntity(int product_id, String product_name, String product_description, Float product_price) {
		super();
		this.id = product_id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.product_price = product_price;
	}

	/**
	 * @return the product_id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param product_id the product_id to set
	 */
	public void setId(int product_id) {
		this.id = product_id;
	}

	/**
	 * @return the product_name
	 */
	public String getProduct_name() {
		return product_name;
	}

	/**
	 * @param product_name the product_name to set
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	/**
	 * @return the product_description
	 */
	public String getProduct_description() {
		return product_description;
	}

	/**
	 * @param product_description the product_description to set
	 */
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	/**
	 * @return the product_price
	 */
	public Float getProduct_price() {
		return product_price;
	}

	/**
	 * @param product_price the product_price to set
	 */
	public void setProduct_price(Float product_price) {
		this.product_price = product_price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((product_description == null) ? 0 : product_description.hashCode());
		result = prime * result + id;
		result = prime * result + ((product_name == null) ? 0 : product_name.hashCode());
		result = prime * result + ((product_price == null) ? 0 : product_price.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof MenuEntity))
			return false;
		MenuEntity other = (MenuEntity) obj;
		if (product_description == null) {
			if (other.product_description != null)
				return false;
		} else if (!product_description.equals(other.product_description))
			return false;
		if (id != other.id)
			return false;
		if (product_name == null) {
			if (other.product_name != null)
				return false;
		} else if (!product_name.equals(other.product_name))
			return false;
		if (product_price == null) {
			if (other.product_price != null)
				return false;
		} else if (!product_price.equals(other.product_price))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MenuEntity [product_id=" + id + ", product_name=" + product_name + ", product_description="
				+ product_description + ", product_price=" + product_price + "]";
	}
	
	
	
	

}
