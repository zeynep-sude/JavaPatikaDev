package java101.classes.obs;

public class PTeacher {
	String name;
	String mpno;
	String branch;
	
	public PTeacher(String name,String mpno,String branch){
		this.name = name;
		this.mpno = mpno;
		this.branch = branch;
	}
	
	void print() {
		System.out.println("Adı: " + this.name);
		System.out.println("Telefon NO : " + this.mpno);
		System.out.println("Branş : " + this.branch);
		
	}


}
