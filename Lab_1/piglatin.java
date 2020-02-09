import java.util.Scanner;
public class piglatin{
	public static void main(String[] args){
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter String : ");
		String str = sc.nextLine();
		String[] arrOfStr = str.split(" ");
		System.out.printf("Equivalent String : ");
		for(int l=0; l<arrOfStr.length; l++){
			flag=0;
			str = arrOfStr[l];
			if(str.charAt(0)=='a' || str.charAt(0)=='A' ||
			   str.charAt(0)=='e' || str.charAt(0)=='E' ||
			   str.charAt(0)=='i' || str.charAt(0)=='I' ||
			   str.charAt(0)=='o' || str.charAt(0)=='O' ||
			   str.charAt(0)=='u' || str.charAt(0)=='U'){
				System.out.print(str+"way ");
				flag=1;   
			}
			if(flag == 0){
				for(int i=1; i<str.length(); i++){
					if(str.charAt(i)=='a' || str.charAt(i)=='A' ||
					   str.charAt(i)=='e' || str.charAt(i)=='E' ||
					   str.charAt(i)=='i' || str.charAt(i)=='I' ||
					   str.charAt(i)=='o' || str.charAt(i)=='O' ||
					   str.charAt(i)=='u' || str.charAt(i)=='U'){
					   	String s = str.substring(0,i);
						System.out.print(str.substring(i)+s+"ay ");
						flag=1;
						break;
					}
				}
			}
			if(flag == 0){
				System.out.print(str+"ay ");
			}		
		}
		System.out.println();
	}
}
