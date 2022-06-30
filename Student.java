package exercise03;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private String address;
	private float gpa;
	
	@Override
	public String toString() {
		return "Student: id = " + this.id + ", name = " + this.name + 
				", age = " + this.age + ", address = " + this.address + ", GPA = " + this.gpa;
	}
	
	Scanner scanner = new Scanner(System.in);

	public void addStudent() {
		Student student = new Student();
		
		System.out.println("Input student Id: ");
		this.id = scanner.nextInt();
		
		System.out.println("Input student name: ");
		this.name = scanner.next();
		
		System.out.println("Input student age: ");
		this.age = scanner.nextInt();
		
		System.out.println("Input student address: ");
		this.address = scanner.next();
		
		//System.out.println("Input student GPA: ");
		//this.gpa = scanner.nextFloat();
	}
	
	public void showStudent() {
			System.out.println(toString());
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public float getGpa() {
		return gpa;
	}
	
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
}
