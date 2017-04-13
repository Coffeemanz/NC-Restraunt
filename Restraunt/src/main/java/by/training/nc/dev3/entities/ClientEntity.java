package by.training.nc.dev3.entities;

public class ClientEntity {
	
	private int client_id;
	private Float client_cash;
	private Boolean paid;
	
	public ClientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientEntity(int client_id, Float client_cash, Boolean paid) {
		super();
		this.client_id = client_id;
		this.client_cash = client_cash;
		this.paid = paid;
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
	 * @return the client_cash
	 */
	public Float getClient_cash() {
		return client_cash;
	}

	/**
	 * @param client_cash the client_cash to set
	 */
	public void setClient_cash(Float client_cash) {
		this.client_cash = client_cash;
	}

	/**
	 * @return the paid
	 */
	public Boolean getPaid() {
		return paid;
	}

	/**
	 * @param paid the paid to set
	 */
	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client_cash == null) ? 0 : client_cash.hashCode());
		result = prime * result + client_id;
		result = prime * result + ((paid == null) ? 0 : paid.hashCode());
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
		if (!(obj instanceof ClientEntity))
			return false;
		ClientEntity other = (ClientEntity) obj;
		if (client_cash == null) {
			if (other.client_cash != null)
				return false;
		} else if (!client_cash.equals(other.client_cash))
			return false;
		if (client_id != other.client_id)
			return false;
		if (paid == null) {
			if (other.paid != null)
				return false;
		} else if (!paid.equals(other.paid))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClientEntity [client_id=" + client_id + ", client_cash=" + client_cash + ", paid=" + paid + "]";
	}
	
	

}
