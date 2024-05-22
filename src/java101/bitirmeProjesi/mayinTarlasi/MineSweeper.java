package java101.bitirmeProjesi.mayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	int row;
	int column;
	String[][] mineField;
	String[][] mineUser;
	int mineNumber;
	int rowInput;
	int colInput;
	int rowMin;
	int rowMax;
	int colMin;
	int colMax;
	int mineCount = 0;
	int answer = 0;
	

	MineSweeper(int row, int column) {
		this.row = row;
		this.column = column;
		this.mineUser = new String[row][column];
		this.mineField = new String[row][column];
		this.mineNumber = (row * column) / 4;
	}
	
	void run() {
		this.createMineField();
		Scanner input = new Scanner(System.in);
		while(this.answer<this.row * this.column - this.mineNumber) {
			System.out.println("=========================");
            this.printArray(this.mineUser);
			System.out.println("Satır Giriniz : ");
			rowInput=input.nextInt();
			System.out.println("Sutun Giriniz : ");
			colInput=input.nextInt();
			
			if(this.rowInput>=0 && this.rowInput<this.mineField.length) {
				
				if(this.colInput>=0 && this.colInput<this.mineField[0].length) {
					this.findMines();
					answer++;
					
					if(this.answer == this.row*this.column -this.mineNumber) {
						System.out.println("Son tablo");
                        this.printArray(this.mineUser);;
                        System.out.println("====================");
                        System.out.println("Tebrikler. Kazandınız.");
					}
					
					if(this.mineField[rowInput][colInput].equals("*")) {
						 //this.printArray(this.mineField);
	                        System.out.println("Patladınız.");
	                        System.out.println("Oyunu Kaybettiniz.");
	                        break;
					}
				}else {
					 System.out.println("==Geçerli aralık giriniz.==");
				}
			}else {
				 System.out.println("==Geçerli aralık giriniz.==");
			}
		}
		
		
	}

	void createMineField() {

		for (int i = 0; i < this.row; i++) {
			for (int j = 0; j < this.column; j++) {
				this.mineUser[i][j] = "-";
				this.mineField[i][j] = "-";
			}
		}
		Random random = new Random();
		int randRow, randColumn;
		for (int k = mineNumber; k > 0; k--) {
			do {
				randRow = random.nextInt(this.row);
				randColumn = random.nextInt(this.column);
			} while (mineField[randRow][randColumn].equals("*"));
			this.mineField[randRow][randColumn] = "*";
		}
		System.out.println("Mayınların konumu");
		printArray(mineField);
		System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
		//printArray(this.mineUser);
	}

	void printArray(String[][] arr) {
		for (String[] row : arr) {
			for (String column : row) {
				System.out.print(column);
			}
			System.out.println();
		}
	}
	
	void findMines() {
		this.rowMin = this.rowInput -1;
		this.rowMax = this.rowInput +1;
		this.colMin = this.colInput-1;
		this.colMax = this.colInput+1;
		
		if(this.rowMin<0) {
			this.rowMin++;
		}
		if(this.rowMax >= this.mineField[0].length) {
			this.rowMax--;
		}
		if(this.colMin<0) {
			this.colMin++;
		}
		if(this.colMax >= this.mineField.length) {
			this.colMax--;
		}
		for(int i=this.rowMin;i<=this.rowMax;i++) {
			for(int j=this.colMin;j<=colMax;j++) {
				if(this.mineField[i][j].equals("*")) {
					this.mineCount++;
				}
			}
		}
		this.mineUser[this.rowInput][this.colInput] = Integer.toString(this.mineCount);
		this.mineCount = 0;
		
	}

}
