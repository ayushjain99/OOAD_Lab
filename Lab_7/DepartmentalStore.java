import java.util.Random;

public class DepartmentalStore{
    private String D_Store_Name;
    private String D_Store_Address;
    public Employee[] employees = new Employee[10];
    public Invoice[] invoices = new Invoice[300];
    public int[] map = new int[300];

    public DepartmentalStore(String s1, String s2){
        D_Store_Name = s1;
        D_Store_Address = s2;
    }
}

class Test{
    public static void main(String[] args){
        DepartmentalStore ddd = new DepartmentalStore("Levis", "WTP Jaipur");
        int num_employees = 6;
        ddd.employees[0] = new Employee("Virat", "Kohli", 6000);
        ddd.employees[1] = new Employee("Rishabh", "Pant", 5000);
        ddd.employees[2] = new Employee("Mayank", "Agarwal", 4000);
        ddd.employees[3] = new Employee("Rohit", "Sharma", 3000);
        ddd.employees[4] = new Employee("Ajinkya", "Rahane", 2000);
        ddd.employees[5] = new Employee("Hardik", "Pandya", 1000);

        int num_invoices = 200;
        Random rand = new Random();
        for(int i=0; i<num_invoices; i++){
            ddd.invoices[i] = new Invoice();
            ddd.map[i] = rand.nextInt(num_employees);
        }
        // System.out.println(ddd.invoices[12].get_description());
        int temp[] = {0,0,0,0,0,0,0,0,0,0};
        int x;
        for(int i=0; i<num_invoices; i++){
            x = Integer.parseInt(ddd.invoices[i].get_item_number());
            for(int j=0; j<x; j++){
                temp[j] += ddd.invoices[i].getQuantity(j);
            }
        }

        int max = temp[0]; x = 0;
        for(int i=0; i<10; i++){
            if(temp[i] > max){
                max = temp[i];
                x = i;
            }
        }
        x += rand.nextInt(5);
        System.out.println("Item with maximum sold quantity = " + x);
        System.out.println("And that quantity is : " + max);

        int temp2[] = new int[num_employees];
        for (int i=0; i<num_employees; i++)
            temp2[i] = 0;

        int ttt;
        for (int i=0; i<num_invoices; i++) {
            ttt = ddd.map[i];
            temp2[ttt] += ddd.invoices[i].getInvoiceAmount();
        }

        System.out.println();
        System.out.println("The employees who are eligible for increment - ");
        for (int i=0; i<num_employees; i++){
            if(temp2[i] >= 250000){
                System.out.println((i+1) + ". " + ddd.employees[i].get_first_name() + " " + ddd.employees[i].get_last_name());
                // System.out.println(temp2[i]);
            }
        }

    }
}
