package oopIntroGun2Odev1;

public class courseManager {

	public static void CoursList(Course[] list) {
		
		System.out.println("\n---------------------Kurslar--------------------");

		for (Course course : list) {
			System.out.println(course.courseName + " --> " + course.courseInstructor + " --> " + course.courseTime);

		

		}
	}

}
