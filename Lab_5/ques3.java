import fact_recursion.fact;
import java.util.Scanner;

public class ques3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer : ");
        int a = sc.nextInt();
        int ans = 0;
        try{
            ans = fact_recursion.fact.factorial(a);
            System.out.println("Ans = " + ans);
        }catch(StackOverflowError e){
            System.out.println("Number should be non-negative..Try Again");
        }
    }
}
