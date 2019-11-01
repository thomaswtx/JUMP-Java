package ArrayExamples;

public class Person {
	private String name;
	private int age;
	private String gender;

	public Person() {
		this.name = "";
		this.age = 0;
		this.gender = "";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public static int findYoungest(Person[] persons) {
		int minIndex = 0;
		
		for(int i = 0; i < persons.length; i++) {
			if(persons[i].getAge() < persons[minIndex].getAge()) {
				minIndex = i;
			}
		}
		
		return minIndex;
	}
	
	public static int findOldest(Person[] persons) {
		int maxIndex = 0;
		
		for(int i = 0; i < persons.length; i++) {
			if(persons[i].getAge() > persons[maxIndex].getAge()) {
				maxIndex = i;
			}
		}
		
		return maxIndex;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
