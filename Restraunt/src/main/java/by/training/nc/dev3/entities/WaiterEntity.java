package by.training.nc.dev3.entities;

public class WaiterEntity {
	
	private int waiter_id;
	private String waiter_name;
	
	public WaiterEntity()
	{
		super();
	}
	
	public WaiterEntity(int waiter_id, String waiter_name) {
		super();
		this.waiter_id = waiter_id;
		this.waiter_name = waiter_name;
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
	 * @return the waiter_name
	 */
	public String getWaiter_name() {
		return waiter_name;
	}

	/**
	 * @param waiter_name the waiter_name to set
	 */
	public void setWaiter_name(String waiter_name) {
		this.waiter_name = waiter_name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + waiter_id;
		result = prime * result + ((waiter_name == null) ? 0 : waiter_name.hashCode());
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
		if (!(obj instanceof WaiterEntity))
			return false;
		WaiterEntity other = (WaiterEntity) obj;
		if (waiter_id != other.waiter_id)
			return false;
		if (waiter_name == null) {
			if (other.waiter_name != null)
				return false;
		} else if (!waiter_name.equals(other.waiter_name))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WaiterEntity [waiter_id=" + waiter_id + ", waiter_name=" + waiter_name + "]";
	}


	
	
	
	

}
