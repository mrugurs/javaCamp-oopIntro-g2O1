package oopIntroGun2Odev1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println(
				"Kurslar� Listelemek ��in 1'i\n��rencileri Listelemek ��in 2'yi\nHer �kisini Listelemek ��in 3'� Se�iniz!!\n");

		Scanner islem = new Scanner(System.in);
		System.out.print("Se�im : ");
		int secim = islem.nextInt();

		// -------------------Kurs Ekleme----------------------
		Course course1 = new Course(1, "Pyhton", "Engin Demiro�", "Last for 2 Weeks");
		Course course2 = new Course(2, "C#", "Engin Demiro�", "Last for 2 Months");
		Course course3 = new Course(3, "Java", "Engin Demiro�", "Last for 3 Months");

		Course[] courses = { course1, course2, course3 };

		// -----------------��renci Ekleme---------------------
		Student student1 = new Student();
		student1.studentId = 1;
		student1.studentName = "Murat";
		student1.studentLastName = "U�UR";
		student1.studentEmail = "murat@hotmail.com";

		Student student2 = new Student();
		student2.studentId = 2;
		student2.studentName = "Emre";
		student2.studentLastName = "DEM�R";
		student2.studentEmail = "emre@hotmail.com";

		Student[] students = { student1, student2 };

		if (secim == 1) {
			ListKurs(courses);
		} else if (secim == 2) {
			ListStudent(students);
		} else if (secim == 3) {
			ListKurs(courses);
			ListStudent(students);
		} else {
			System.out.println("\n....Hatal� Giri� Yapt�n�z..!!");
		}

	}

	public static void ListKurs(Course[] list) {
		courseManager course = new courseManager();
		course.CoursList(list);
	}

	public static void ListStudent(Student[] list) {
		studentManager studentManager = new studentManager();
		studentManager.StudentList(list);
	}

}
