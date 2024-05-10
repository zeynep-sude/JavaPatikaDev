package patikadev.arrays;

public class PCokBoyutluDizilerileHarfYazdirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] letter = new String[5][3];
		for(int i=0;i<letter.length;i++) {
			for(int j=0;j<letter[i].length;j++) {
				if((i==0 ||i==4) &&(j==0||j==1)) {
					letter[i][j] = "*";
				}else if((i==1||i==3)&&(j==0 ||j==2)){
					letter[i][j] = "*";
				}else if(i==2) {
					letter[i][j] = "*";
				}
				else {
					letter[i][j] = " ";
				}
				
			}
			
		}
		for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

	}

}
