package src;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
	public boolean equals(Person obj) {
		return obj.getName().equals(this.name);
	}	
	
}
