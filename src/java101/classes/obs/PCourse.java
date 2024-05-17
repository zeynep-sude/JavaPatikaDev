package java101.classes.obs;

public class PCourse {
	PTeacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	int sNote;
	double etkiOrani;
	
	public PCourse(String name,String code,String prefix,PTeacher teacher) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.teacher = teacher;
	}
	
	void prinTeacherInfo() {
		this.teacher.print();
		
	}
	
	void addTeacher(PTeacher teacher) {
		if(teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
			teacher.print();
		}else {
			 System.out.println(" Öğretmen ve Branşı Uyuşmuyor!!");
		}
	}

	

}
