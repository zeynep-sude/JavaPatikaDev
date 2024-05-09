package patikadev.classes.boksOyunu;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f1 = new Fighter("Zeynep" ,10,120,100,25);
		Fighter f2 = new Fighter("Sude" ,20,85,85,50);
		Match m1 = new Match(f1,f2,85,100);
		m1.run();
		
		

	}

}
