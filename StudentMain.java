package exercise03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentMain {
	
	public static void editStudentById() {
		
	}

	public static void main(String[] args) {
		System.out.println(
				"1. Add student \n2. Edit student by Id "
						+ "\n3. Delete student by Id \n4. Sort student by GPA "
						+ "\n5. Sort student by name \n6. Show student \n0. Exit");

		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<Student>();

		boolean cont = true;
		do {
			System.out.println("Choose 1 function: [0 - 6]");
			int funcId;
			funcId = scanner.nextInt();

			switch (funcId) {
			case 1:
				Student student = new Student();
				student.addStudent();
				studentList.add(student);
				break;		
			case 2:
				System.out.println("Input student Id to edit: ");
				int idToEdit;
				idToEdit = scanner.nextInt();
			  
				for(Student std : studentList) {
					if(std.getId() == idToEdit) {
						std.addStudent();
					}
				}
				break;
			case 3: 
				System.out.println("Input student Id to delete: "); 
				int idToDelete;
				idToDelete = scanner.nextInt();
				
				for(Student std : studentList) {
					if(std.getId() == idToDelete) {
						studentList.remove(std);
					}
				}
				break;
			case 4:
				//Sort student list by GPA in ascending order
				Collections.sort(studentList, new Comparator<Student>() {
					  @Override 
					  public int compare(Student std0, Student std1) { 
						  // TODO Auto-generated method stub 
					  return (int) (std0.getGpa() - std1.getGpa()); }
					  });
				break;
			case 5:
				//Sort student list by name in ascending order
				Collections.sort(studentList, new Comparator<Student>() {
					  @Override 
					  public int compare(Student std0, Student std1) { 
						  // TODO Auto-generated method stub 
						  return std0.getName().compareTo(std1.getName()); }
					  });
				break;
			case 6:
				for(Student std : studentList) {
					std.showStudent();
				}
				break;
			case 0:
				System.out.println("Good bye!");
				cont = false;
				break;
			}
		} while (cont);
	}
}
