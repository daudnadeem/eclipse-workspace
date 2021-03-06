package com.qa.Delegate;



public class Person {

	public String name;
	public int age;
	public String jobTitle;
	

	
	@Override
	public String toString() {
		return "[Name = " + name + ", Age = " + age + ", Job Title = " + jobTitle + "]";
	}

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;

	}


	public String info() {
		String info = "Name: " + name + "\n" + "Age: " + age + "\n" + "Job Title: " + jobTitle + "\n";
		return info;
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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
