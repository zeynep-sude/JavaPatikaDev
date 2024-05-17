package java101.classes.obs;

public class PStudent {
	PCourse c1, c2, c3;
	String name;
	String stuNo;
	String classes;
	double average;
	boolean isPass;

	public PStudent(String name, String stuNo, String classes, PCourse c1, PCourse c2, PCourse c3) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.average = 0.0;
		this.isPass = false;

	}

	void addBulkExamNote(int note1, int note2, int note3) {
		if (note1 >= 0 && note1 <= 100) {
			this.c1.note = note1;
		}
		if (note2 >= 0 && note2 <= 100) {
			this.c2.note = note2;
		}
		if (note3 >= 0 && note3 <= 100) {
			this.c3.note = note3;

		}

	}

	void addExam2Note(int snote1, int snote2, int snote3) {
		if (snote1 >= 0 && snote1 <= 100) {
			this.c1.sNote = snote1;
		}
		if (snote2 >= 0 && snote2 <= 100) {
			this.c2.sNote = snote2;
		}
		if (snote3 >= 0 && snote3 <= 100) {
			this.c3.sNote = snote3;

		}
	}
	void addEtkiOrani(double etki1, double etki2, double etki3) {
		this.c1.etkiOrani = etki1;
		this.c2.etkiOrani  =etki2;
		this.c3.etkiOrani = etki3;
	}
	
	

	void calcAvarage() {
		double average1, average2, average3;
		average1 = (this.c1.sNote * this.c1.etkiOrani) + (this.c1.note * (1.00 - this.c1.etkiOrani));
		System.out.println(c1.name + " Dersinin Not Ortalaması " + average1);
		average2 = (this.c2.sNote * this.c2.etkiOrani) + (this.c2.note * (1.00 - this.c2.etkiOrani));
		System.out.println(c2.name + " Dersinin Not Ortalaması " + average2);
		average3 = (this.c3.sNote * this.c3.etkiOrani) + (this.c3.note * (1.00 - this.c3.etkiOrani));
		System.out.println(c3.name + " Dersinin Not Ortalaması " + average3);
		this.average = (average1 + average2 + average3) / 3;
		System.out.println("Ortalamanız: " + average);
	}

	public boolean isCheckPass() {
		calcAvarage();
		return this.average > 55;
	}

	void isPass() {
		 this.isPass = isCheckPass();
		if (this.isPass) {
			System.out.println("Sınıfı Geçti. ");
		} else {
			System.out.println("Sınıfta Kaldı.");
		}
	}

	void printNote() {
		System.out.println(this.c1.name + "Notu\t" + this.c1.note);
		System.out.println(this.c2.name + "Notu\t" + this.c2.note);
		System.out.println(this.c3.name + "Notu\t" + this.c3.note);
	}
}
