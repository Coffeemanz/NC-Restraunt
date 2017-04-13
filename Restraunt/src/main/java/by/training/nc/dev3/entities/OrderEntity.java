package by.training.nc.dev3.entities;

public class OrderEntity {

	private int waiter_id;
	private int client_id;
	private int product_id;
	private Float total_price;
	
	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderEntity(int waiter_id, int client_id, int product_id, Float total_price) {
		super();
		this.waiter_id = waiter_id;
		this.client_id = client_id;
		this.product_id = product_id;
		this.total_price = total_price;
	}

	/**
	 * @return the waiter_id
	 */
	public int getWaiter_id() {
		return waiter_id;
	}

	/**
	 * @param waiter_id the waiter_id to set
	 */
	public void setWaiter_id(int waiter_id) {
		this.waiter_id = waiter_id;
	}

	/**
	 * @return the client_id
	 */
	public int getClient_id() {
		return client_id;
	}

	/**
	 * @param client_id the client_id to set
	 */
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	/**
	 * @return the product_id
	 */
	public int getProduct_id() {
		return product_id;
	}

	/**
	 * @param product_id the product_id to set
	 */
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	/**
	 * @return the total_price
	 */
	public Float getTotal_price() {
		return total_price;
	}

	/**
	 * @param total_price the total_price to set
	 */
	public void setTotal_price(Float total_price) {
		this.total_price = total_price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + client_id;
		result = prime * result + product_id;
		result = prime * result + ((total_price == null) ? 0 : total_price.hashCode());
		result = prime * result + waiter_id;
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
		if (!(obj instanceof OrderEntity))
			return false;
		OrderEntity other = (OrderEntity) obj;
		if (client_id != other.client_id)
			return false;
		if (product_id != other.product_id)
			return false;
		if (total_price == null) {
			if (other.total_price != null)
				return false;
		} else if (!total_price.equals(other.total_price))
			return false;
		if (waiter_id != other.waiter_id)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderEntity [waiter_id=" + waiter_id + ", client_id=" + client_id + ", product_id=" + product_id
				+ ", total_price=" + total_price + "]";
	}
	
	
	
	
	
}
