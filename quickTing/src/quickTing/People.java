package quickTing;

import java.util.ArrayList;

public class People {

	static ArrayList<Person> ppl = new ArrayList<Person>();

	public static ArrayList<Person> getPpl() {
		return ppl;
	}

	public static void addPpl(Person p) {
		ppl.add(p);
	}

}
