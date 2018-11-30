package ExoMaven;

public class Personne {
	public Address adr;
	public String name;
	public Integer age;
	

	public Personne() {
	}
	
	public Personne(Address adr, String name, Integer age) {
		this.adr=adr;
		this.age=age;
		this.name=name;
	}

}
