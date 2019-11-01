package inheritanceExample;

public class Pet {
	private String name;
	
	public Pet() {
		name = "Unknown";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String speak()	 {
		return "I'm your cuddly little pet.";
	}

}
