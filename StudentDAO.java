package cogent23.arraylist.DAO;

import cogent23.arraylist.model.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentDAO {
	
	ArrayList<Student>al =new ArrayList();
	Scanner sc=new Scanner(System.in);
	
	public void addStudent() {
		System.out.println("Please enter the student rollNo: ");
		int rollNo=sc.nextInt();
		System.out.println("Please enter student name: ");
		String name=sc.next();
		System.out.println("Please enter student age: ");
		int age=sc.nextInt();
		System.out.println("Please enter student address: ");
		String address=sc.next();
		Student student = new Student(rollNo,name,age,address);
		
		
	}
	public void displayStudent() {
		for(Student student:al) {
			System.out.println("Student roll numbre is: "+student.getRollNo());
			System.out.println("Student name: "+student.getName());
			System.out.println("Student age: "+student.getAge());
			System.out.println("Strudent address: "+student.getAddress());		
		}
	}
	
	public void search(String searchName) {
		
		if(al.contains(searchName)) {
			System.out.println("Student Exists");
		}
		else {
			System.out.println("Student does not exist");
		}
	}
	
	public void printName() {
		Iterator<Student> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}
	}
}
