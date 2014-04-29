package array2D;

public class Array2D {
	public static void main(String[] args) {
		int h=5;
		int w=5;
		int a[][]= create(h,w);
		System.out.println("updated array:");
		for (int i=0; i<h; i++ ){
			for(int j=0; j<w; j++){
				if (a[i][j] <10){
					a[i][j]=0;
				}
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
			
	}
	// creating 2D array with random data from 0 to 19
	public static int[][] create(int h, int w){
		int a[][]= new int [h] [w];
		System.out.println("created array:");
		for (int i=0; i<h; i++ ){
			for(int j=0; j<w; j++){
				a[i][j] = (int)(Math.random()*20);
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		return a;
	}

}
