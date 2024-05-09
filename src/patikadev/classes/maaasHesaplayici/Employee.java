package patikadev.classes.maaasHesaplayici;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name,double salary,int workHours,int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		
	}
	double tax() {
		double tax;
		if(salary<1000) {
			//System.out.println("Verginiz Bulunmamaktadır");
			tax=0;
			
		}else {
			
			tax = salary*0.03;
			
		}
		return tax;
	}
	double bonus() {
		double increaseHours =0;
		if(workHours>40) {
			increaseHours =(workHours - 40)*30.0;
		}
		return increaseHours;
	}
	
	double raiseSalary() {
		int year = 2021 - hireYear;
		double raise;
		if(year<10) {
			raise = salary * 0.05;
		}else if(year>9 && year<20) {
			raise = salary *0.10;
		}else {
			raise = salary*0.15;
		}
		return raise;
	}
	
	public String toString() {
		return "Adı: " +  this.name +"\n"
				+ "Maaşı : " + this.salary +"\n"
				+"Haftalık Çalışma Saati : " +this.workHours+"\n"
				+"Başlangıç Yılı : " + this.hireYear +"\n"
				+"Vergi : " + tax()+"\n"
				+"Bonus : " + bonus() + "\n"
				+"Maaş Artışı : " + raiseSalary() + "\n"
				+"Vergi ve Bonuslar ile birlikte maaş : " + (salary + bonus() - tax()) + "\n" 
				+"Toplam Maaş : " +(salary + bonus() + raiseSalary() - tax());
	}
	

}
