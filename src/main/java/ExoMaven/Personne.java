package ExoMaven;

public class Personne {
	private Address adr;
	private String name;
	private Integer age;
	

	public Personne() {
	}
	
	public Personne(Address adr, String name, Integer age) {
		this.adr=adr;
		this.age=age;
		this.name=name;
	}

}
