package com.qa.Delegate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {

		Person p1 = new Person("Person One", 27, "Data Scientist");
		Person p2 = new Person("Person Two", 27, "Student");
		Person p3 = new Person("Person Three", 27, "Data Engineer");
		Person p4 = new Person("Person Four", 27, "Digital Animal Freaky Folk");

		System.out.println(p1.info());
		System.out.println(p2.info());

		ArrayList<Person> ppl = new ArrayList<Person>();
		ppl.add(p1);
		ppl.add(p2);
		ppl.add(p3);
		ppl.add(p4);

		ppl.stream().forEach(System.out::println);
		
		
//		List<Person> searchForPerson = ppl.stream().filter(n -> n.getName().equals("Person One")).collect(Collectors.toList());
		System.out.println(ppl.stream().filter(n -> n.getName().equals("Person 1")).collect(Collectors.toList()));
//		search("Person One", ppl);
		
	}

	public static String search(String name, ArrayList arr) {
		for (int i = 0; i < arr.size(); i++) {
			if(name.equals(arr.get(i))) {
				System.out.println("NOT");
			}
		}
		
		return Person.class.getName();
	}

}
