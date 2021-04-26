package JavaD2HW1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (C# + Angular)", "Engin Demiroğ");
		
		Course course2 = new Course(2, "Yazılım Geliştirici Yetiştirme Kampı (Java + React)", "Engin Demiroğ");
		
		Course course3 = new Course(3, "Programlamaya Giriş İçin Temel Kurslar", "Engin Demiroğ");
		
		Course[] courses = {course1, course2, course3};
		
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		System.out.println("--------------");
		
		Student student1 = new Student(1, "Ali", "Can", "ali@can.com");
		
		Student student2 = new Student(2, "Ahmet", "Mehmet", "ahmet@mehmet.com");
		
		Student student3 = new Student(3, "Hasan", "Mert", "asan@mert.com");
		
		Student[] students = {student1, student2, student3};
		
		
		for (Student student : students) {
			System.out.println(student.name + " " + student.surName);
		}
		
		System.out.println("--------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addToAccount(student1);
		studentManager.addToAccount(student2);
		studentManager.addToAccount(student3);
		
		System.out.println("--------------");
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCart(course1);
		courseManager.addToCart(course2);
		courseManager.addToCart(course3);
		
		
	}

}
