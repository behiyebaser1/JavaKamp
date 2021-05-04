package odevInheritance;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor("Engin", "Demiro�","Java");
		Instructor instructor2 = new Instructor("�mer", "�ahin", "C#");
		
		Student student1 =  new Student("Behiye", "Ba�er", "Bilgisayar M�hendisli�i");
		Student student2 =  new Student("Eren", "Y�lmaz","Makine M�hendisli�i");
		Student student3 =  new Student("Mustafa", "Demir","Bilgisayar M�hendisli�i");
		Student student4 =  new Student("Asl�", "Do�an","Elektrik-Elektronik M�hendisli�i");
		
		UserManager userManager = new UserManager();
		//userManager.add(instructor1);
		//userManager.add(student2);
		
		User[] users  = {instructor1, instructor2, student1, student2, student3, student4};
		
		Instructor[] instructors= {instructor1, instructor2};
		Student[] students  = {student1, student2, student3, student4};
		
		
		userManager.addMultiple(users);
		
		userManager.list(users);
		
		InstructorManager instructorManager  = new InstructorManager();
		instructorManager.listToBranch(instructors);
		
		StudentManager studentManager  = new StudentManager();
		studentManager.listToDepartment(students);
		
		
	

	}

}
