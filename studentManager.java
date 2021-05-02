package oopIntroGun2Odev1;

public class studentManager {

	public static void StudentList(Student[] list) {

		System.out.println("\n---------------------Öğrenciler--------------------");

		for (Student student : list) {
			System.out.println(student.studentName + " --> " + student.studentLastName + " --> " + student.studentEmail);
		}

	}

}
