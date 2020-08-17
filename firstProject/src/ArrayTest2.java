
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[][] array = new int[5][5];
		
		
		for(int i=0;i<5;i++) {
				array[i][0]= i+1;
			for(int j=0;j<5;j++) {
				if(j==0) {
				}else
					sum+=5;
					array[i][j]=array[i][0]+sum;
					System.out.printf("%3d",array[i][j]);
			}
			sum=0;
			System.out.println();
		}
	}

}
