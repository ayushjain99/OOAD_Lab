import java.util.*;
class ex1{
	public static void main(String args[]){	
		Scanner sc=new Scanner(System.in);
		
		Random random = new Random();
		
		int n,i,j,k;
		n=sc.nextInt();
		int a[][]=new int [n][n];
		int b[][]=new int [n][n];
		int c[][]=new int [n][n];
		for(i=0;i<n;i++){
			a[i][i]=2;
		}
		
		
		for(i=0;i<n;i++){
			for(j=0;j<i;j++){
				
				int random_v=1;
				while(random_v==1){
					random_v=random.nextInt(3)-3;
				}
				a[i][j]=random_v;
			}
		}
		for(i=0;i<n;i++){
			for(j=i;j<n;j++){
				if(a[j][i]==0){
					a[i][j]=0;
				}
				else{
					int random_v=1;
					while(random_v==1){
						random_v=random.nextInt(6)-3;
					}
					a[i][j]=random_v;
				}
			}
		}
		
		for(i=0;i<n;i++){
			b[i][i]=2;
		}
		
		
		for(i=0;i<n;i++){
			for(j=0;j<i;j++){
				
				int random_v=1;
				while(random_v==1){
					random_v=random.nextInt(3)-3;
				}
				b[i][j]=random_v;
			}
		}
		for(i=0;i<n;i++){
			for(j=i;j<n;j++){
				if(b[j][i]==0){
					b[i][j]=0;
				}
				else{
					int random_v=1;
					while(random_v==1){
						random_v=random.nextInt(6)-3;
					}
					b[i][j]=random_v;
				}
			}
		}
		System.out.println("matrix a is:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(a[i][j]+"	");
			}
			System.out.println();
		}
		
		System.out.println("matrix b is:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(b[i][j]+"	");
			}
			System.out.println();
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				c[i][j]=0;
				for(k=0;k<n;k++){
					c[i][j]+=a[i][k] *  
                             b[k][j];
				}
			}
		}
		System.out.println("matrix c is:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(c[i][j]+"	");
			}
			System.out.println();
		}
		
	}
}
