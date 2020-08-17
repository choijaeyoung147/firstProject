
public class ArrayTest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int[][] array = new int[5][5];
			int sum=0;
		
			for(int j=0;j<5;j++) {
				for(int i=0;i<5;i++) {
						array[j][i]= ++sum;
						System.out.printf("%3d",array[i][j]);
				}
				System.out.println();
			}
			
			sum=0;
			for(int j=0;j<5;j++) {
				for(int i=0;i<5;i++) {
						array[i][j]= ++sum;
						System.out.printf("%3d",array[i][j]);
				}
				System.out.println();
			}
		}

	}
