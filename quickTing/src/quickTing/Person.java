package quickTing;

public class Person {

	String name;
	int age = 0;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		People ppList = new People();
		ppList.addPpl(this);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
