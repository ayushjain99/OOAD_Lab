package fact_recursion;

public class fact{
    public static int factorial(int x){
        if(x == 0){
            return 1;
        }
        return (x*factorial(x-1));
    }
}
