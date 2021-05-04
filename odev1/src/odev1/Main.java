package odev1;

public class Main {

	public static void main(String[] args) {
	
		Courses course1 = new Courses("C# + Angular Kursu","Engin Demiro�", 40 );
		Courses course2 = new Courses("Java + React Kursu","Engin Demiro�", 30 );
		
		Courses[] courses = {course1, course2};
		
		for(Courses course : courses) {
			
			System.out.println(course.courseName + "," + course.courseTeacher);
			
		}
		
		UserLogin user1 = new UserLogin("Behiye Ba�er", "behiye123");
		UserLogin user2 = new UserLogin("Engin Ba�er", "engin123");
		
		UserLogin[] users = {user1, user2};
		
		for(UserLogin user : users) {
			
			System.out.println(user.userName + "," + user.password);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		
		courseManager.addToCourse(course2);
		
		courseManager.deleteToCourse(course1);

	}

}
