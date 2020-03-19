package oop;

class person{
	String name;
	String age;
	String color;
	
	void eat() {
		System.out.println(name + "is eating");
	}
	void over() {
		System.out.println(age + "is over");
	}
	void race() {
		System.out.println(color  + "is black");
	}
}


public class demo {

	public static void main(String[] args) {
		// Instantiate the object
		person person1=new person();
		person1.name="Dereje";
		person1.age="40";
		person1.color="black";
		
		person person2=new person();
		person2.age="41";
		person1.over();
		person2.over();
		

	}

}
