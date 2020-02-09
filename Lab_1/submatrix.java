import java.util.Scanner;
public class submatrix{
	public static void main(String[] args){
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter order of input square matrix : ");
		int m = sc.nextInt();
		int mat[][] = new int[m][m];
		for(int i=0; i<m; i++){
			for(int j=0; j<m; j++){
				System.out.printf("Enter mat[%d][%d] : ",i+1,j+1);
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.printf("Enter order of sub matrix : ");
		int n = sc.nextInt();
		int count = 1;
		System.out.println("Non-overlapping sub-matrices : ");
		for(int k=0; k<m; k=k+n){
			for(int j=0; j<m; j=j+n){		
				System.out.printf("Sub-matrix %d : \n",count);
				for(int i=k; i<k+n; i++){
					for(int l=j; l<j+n; l++){
						if(i<m && l<m){
							System.out.printf("%d ",mat[i][l]);
						}
					}
					System.out.println();
				}
				count++;
			}
		}
	}
}
