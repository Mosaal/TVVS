package src;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	
	public boolean equals(Person obj) {
		return obj.getName().equals(this.name);
	}	
	
}
