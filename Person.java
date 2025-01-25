package logic;

public class Person {
	
	public static void main(String args[]) {
		
		temper t1 = new temper("Neelam", 25);
		temper t2 = new temper(null, 0) ;
		System.out.println("name for default cons: " +t2.getName());
		System.out.println("age for default cons: " +t2.getAge());
		
	}
	
	
}


class temper {
	
	private String name;
	private int age;
	
	public temper (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	String getName() {
		return this.name;
	}
	
	int getAge() {
		return this.age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age =age;
	}
}
