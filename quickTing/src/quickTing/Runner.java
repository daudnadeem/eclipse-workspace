package quickTing;

public class Runner {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("personA", 20);
		Person p2 = new Person("personB", 30);
		Person p3 = new Person("personC", 25);
		Person p4 = new Person("personD", 22);
		
		People people = new People();
		System.out.println(people.getPpl());
		
	}

}
