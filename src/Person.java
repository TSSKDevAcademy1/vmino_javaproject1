
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return (this.name+" ("+this.age+")");
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

	public boolean setAge(int age) {
		if (isValidAge(age)) {
			this.age = age;
			return true;
		} else {
			return false;
		}
	}

	private boolean isValidAge(int age) {
		return (age > 0 && age < 120);
	}

}
