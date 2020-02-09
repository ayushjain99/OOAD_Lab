import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rational{
  private int numerator;
  private int denominator;
  private int sign; // 1 for negative, 0 for positive

  Rational(){
      numerator = 1;
      denominator = 1;
  }

  Rational(int x,int y){
      reduce(x,y);
  }

  public void reduce(int x,int y){
      int a,b;
      if(x < 0)
          a = -x;
      else
          a = x;


      if(y < 0)
          b = -y;
      else
          b = y;

      int t = gcd(a,b);
      a = a/t;
      b = b/t;
      if((x<0 && y<0) || (x>0 && y>0))
        numerator = a;
      else
        numerator = -a;
      denominator = b;
  }

  public void displayPrecision(int x){
      double value = ((double)numerator)/denominator;
      BigDecimal bd = new BigDecimal(value).setScale(x, RoundingMode.HALF_UP);
      double y = bd.doubleValue();
      System.out.print(y);
  }

  public static Rational add(Rational a,Rational b){
      Rational res = new Rational();
      int d1 = a.denominator; int d2 = b.denominator;
      int tmp = gcd(d1,d2);
      int LCM = (d1*d2)/tmp;
      int n1 = (LCM/d1)*(a.numerator);
      int n2 = (LCM/d2)*(b.numerator);
      tmp = n1 + n2;
      res.reduce(tmp,LCM);
      return res;
  }

  public static Rational subtract(Rational a,Rational b){
      Rational res = new Rational();
      int d1 = a.denominator; int d2 = b.denominator;
      int tmp = gcd(d1,d2);
      int LCM = (d1*d2)/tmp;
      int n1 = (LCM/d1)*(a.numerator);
      int n2 = (LCM/d2)*(b.numerator);
      tmp = n1 - n2;
      res.reduce(tmp,LCM);
      return res;
  }

  public static Rational multiply(Rational a,Rational b){
      Rational res = new Rational();
      int num = a.numerator * b.numerator;
      int deno = a.denominator * b.denominator;
      res.reduce(num,deno);
      return res;
  }

  // It is a/b
  public static Rational divide(Rational a,Rational b){
      Rational res = new Rational();
      int num = a.numerator * b.denominator;
      int deno = a.denominator * b.numerator;
      res.reduce(num,deno);
      return res;
  }

  public static int gcd(int a,int b){
      int tmp;
      if(a < b){
          tmp = a;
          a = b;
          b = tmp;
      }
      while(b != 0){
          tmp = a % b;
          a = b;
          b = tmp;
      }
      return a;
  }

  public String display(){
      String s = numerator + "/" + denominator;
      return s;
  }
}

class RationalTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rational a,b;
        int x,y;
        System.out.print("Enter numerator of a : ");
        x = sc.nextInt();
        System.out.print("Enter denominator of a : ");
        y = sc.nextInt();
        a = new Rational(x,y);
        System.out.print("Enter numerator of b : ");
        x = sc.nextInt();
        System.out.print("Enter denominator of b : ");
        y = sc.nextInt();
        b = new Rational(x,y);
        System.out.println();
        System.out.println("a = " + a.display());
        System.out.println("b = " + b.display());
        System.out.println();
        Rational tt = Rational.add(a,b);
        System.out.print("a + b = " + tt.display() + "   ");
        tt.displayPrecision(2);
        System.out.println();

        tt = Rational.subtract(a,b);
        System.out.print("a - b = " + tt.display() + "   ");
        tt.displayPrecision(3);
        System.out.println();

        tt = Rational.multiply(a,b);
        System.out.print("a * b = " + tt.display() + "   ");
        tt.displayPrecision(4);
        System.out.println();

        tt = Rational.divide(a,b);
        System.out.print("a / b = " + tt.display() + "   ");
        tt.displayPrecision(1);
        System.out.println();
    }
}
