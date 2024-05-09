package patikadev.classes.boksOyunu;

import java.util.Random;

public class Match {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;

	public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;

	}

	public void run() {
		int i =1;
		if (isCheck()) {
			while (this.f1.health > 0 && this.f2.health > 0) {
				Random random = new Random();
				int randomNumber = random.nextInt(2);
				// Üretilen değere 1 ekleyerek 1 veya 2 değerlerini elde ederiz
				int first = randomNumber + 1;

				if (first == 1) {
					System.out.println("==========" + i + ".Round Başlıyor==========");
					System.out.println("Vuruş Yapan: " + this.f1.name);
					this.f2.health = this.f1.hit(f2);
					System.out.println(this.f2.name + " Adlı Rakibin Kalan Canı: " + this.f2.health);
					i++;

				} else {
					System.out.println("==========" + i + ".Round Başlıyor==========");
					System.out.println("Vuruş Yapan: " + this.f2.name);
					this.f1.health = this.f2.hit(f1);
					System.out.println(this.f1.name + " Adlı Rakibin Kalan Canı: " +this.f1.health);
					i++;

				}
				
				System.out.println("******************************************");
				if(isWin() ) {
					
				}
				

			}

		} else {
			System.out.println("Sporcuların Sikletleri Uymuyor");
		}
	}

	boolean isCheck() {
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
				&& (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
	}
	
	boolean isWin() {
		if(this.f1.health == 0) {
			System.out.println(this.f2.name + " Kazandı");
			return true;
		}
		
		if(this.f2.health == 0) {
			System.out.println(this.f1.name + " Kazandı");
			return true;
		}
		
		return false;
	}

}
