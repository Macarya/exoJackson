package ExoMaven;

public class Address {
	private String rue;
	private Integer num;

	public Address() {
		// TODO Auto-generated constructor stub
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
