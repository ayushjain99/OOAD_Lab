import java.util.Scanner;
import java.util.Random;

public class Invoice{
    private String item_number;
    private String description;
    private int[] quantity = new int[10];
    private int[] price = new int[10];
    private static int count_Obj_Copy = 0;
    Random rand = new Random();

    public Invoice(){
        int x = rand.nextInt(10) + 1;
        item_number = Integer.toString(x);
        description = "No Description";
        for(int i=0; i<x; i++){
            quantity[i] = rand.nextInt(10)+1;
            price[i] = rand.nextInt(500)+1;
        }
    }

    public Invoice(String x,String y){
        item_number = x;
        description = y;
        for(int i=0; i<10; i++){
            quantity[i] = 0;
            price[i] = 0;
        }
    }

    public Invoice(Invoice another){
        this.item_number = another.item_number;
        this.description = another.description;
        this.quantity = another.quantity;
        this.price = another.price;
        count_Obj_Copy++;
    }

    public void setProducts(){
        int num = Integer.parseInt(item_number);
        int x,y;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<num; i++){
            System.out.print("Enter quantity of item "+(i+1)+" : ");
            x = sc.nextInt();
            System.out.print("Enter price of item "+(i+1)+" : ");
            y = sc.nextInt();
            quantity[i] = x;
            price[i] = y;
        }
    }

    public String get_item_number(){
        return item_number;
    }

    public String get_description(){
        return description;
    }

    public int getQuantity(int i){
        return quantity[i];
    }

    public int getPrice(int i){
        return price[i];
    }

    public int getInvoiceAmount(){
        int sum = 0;
        int num = Integer.parseInt(item_number);
        for (int i=0; i<num; i++) {
            sum += (quantity[i]*price[i]);
        }
        return sum;
    }

    public static int function(Invoice a, Invoice b){
        int num1 = Integer.parseInt(a.item_number);
        int num2 = Integer.parseInt(b.item_number);
        int q1 = 0,q2 = 0;
        for (int i=0; i<num1; i++) {
            q1 += a.quantity[i];
        }

        for (int i=0; i<num2; i++) {
            q2 += b.quantity[i];
        }
        return (q1>q2 ? q1 : q2);
    }

    public static int getCountCopy(){
        return count_Obj_Copy;
    }
}

class TestInvoice{
    public static void main(String[] args) {
        Invoice i1 = new Invoice("5","Invoice 1");
        Invoice i2 = new Invoice("3","Invoice 2");
        System.out.println("Set the information for Invoice 1");
        i1.setProducts();
        System.out.println("Set the information for Invoice 2");
        i2.setProducts();
        System.out.println("Amount for 1 = " + i1.getInvoiceAmount());
        System.out.println("Amount for 2 = " + i2.getInvoiceAmount());
        System.out.println("Max quantity = " + Invoice.function(i1,i2));

        System.out.println("Objects created through copy operation = " + Invoice.getCountCopy());
    }
}
