package java101.classes.obs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PTeacher t1 = new PTeacher("Zeynep", "123456", "Mat");
		PTeacher t2 = new PTeacher("Sude", "1234", "Fiz");
		PTeacher t3 = new PTeacher("sena", "1234", "biyo");

		PCourse c1 = new PCourse("Matematik", "1", "Mat", t1);
		PCourse c2 = new PCourse("Fizik", "2", "Fiz", t2);
		PCourse c3 = new PCourse("Biyoloji", "3", "biyo", t3);
		
		PStudent s1 = new PStudent("Elif","1","A",c1,c2,c3);
		
		/*t1.print();
		t2.print();
		c1.prinTeacherInfo();
		c2.prinTeacherInfo()
		c1.addTeacher(t1);*/
		s1.addBulkExamNote(100, 60, 70);
		s1.addExam2Note(80, 90, 45);
		s1.addEtkiOrani(0.50, 0.20, 0.30);
		//s1.calcAvarage();
		s1.isPass();
		
	}

}
