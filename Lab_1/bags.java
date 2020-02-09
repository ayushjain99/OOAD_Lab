// Minimum 1 Kg bags needed
import java.util.Scanner;
public class bags{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of 1 Kg bags : ");
		int n = sc.nextInt();
		System.out.print("Enter no. of 5 Kg bags : ");
		int m = sc.nextInt();
		System.out.print("Enter goal weight : ");
		double w = sc.nextInt();
		int five_req,one_req;
		int var1,var2;
		if (m*5 >= w) {
			five_req = (int)Math.ceil(w/5);
			w = 0; one_req = 0;
		}else{
			w = w - (m*5);
			five_req = m;
			one_req = (int)w;
		}

		if(one_req > n){
			System.out.println("Packaging not possible : -1");
		}else{
			System.out.println("5 Kg bags needed : " + five_req);
			System.out.println("1 Kg bags needed : " + one_req);
		}
	}
}
