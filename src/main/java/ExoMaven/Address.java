package ExoMaven;

public class Address {
	private String rue;
	private Integer num;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		result = prime * result + ((rue == null) ? 0 : rue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		if (rue == null) {
			if (other.rue != null)
				return false;
		} else if (!rue.equals(other.rue))
			return false;
		return true;
	}

	public Address() {
		setRue("de la Nouvelle france");
		setNum(140) ;
	}
	
	public Address(String rue, Integer num) {
		this.setRue(rue) ;
		this.setNum(num) ;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

}
