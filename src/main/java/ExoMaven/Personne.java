package ExoMaven;

public class Personne {
	public Address adr;
	public String name;
	public Integer age;
	

	public Personne() {
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adr == null) ? 0 : adr.hashCode());
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Personne other = (Personne) obj;
		if (adr == null) {
			if (other.adr != null)
				return false;
		} else if (!adr.equals(other.adr))
			return false;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Personne(Address adr, String name, Integer age) {
		this.adr=adr;
		this.age=age;
		this.name=name;
	}

}
