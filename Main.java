package oopIntroGun2Odev1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println(
				"Kursları Listelemek İçin 1'i\nÖğrencileri Listelemek İçin 2'yi\nHer İkisini Listelemek İçin 3'ü Seçiniz!!\n");

		Scanner islem = new Scanner(System.in);
		System.out.print("Seçim : ");
		int secim = islem.nextInt();

		// -------------------Kurs Ekleme----------------------
		Course course1 = new Course(1, "Pyhton", "Engin Demiroğ", "Last for 2 Weeks");
		Course course2 = new Course(2, "C#", "Engin Demiroğ", "Last for 2 Months");
		Course course3 = new Course(3, "Java", "Engin Demiroğ", "Last for 3 Months");

		Course[] courses = { course1, course2, course3 };

		// -----------------Öğrenci Ekleme---------------------
		Student student1 = new Student();
		student1.studentId = 1;
		student1.studentName = "Murat";
		student1.studentLastName = "UĞUR";
		student1.studentEmail = "murat@hotmail.com";

		Student student2 = new Student();
		student2.studentId = 2;
		student2.studentName = "Emre";
		student2.studentLastName = "DEMİR";
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
			System.out.println("\n....Hatalı Giriş Yaptınız..!!");
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
