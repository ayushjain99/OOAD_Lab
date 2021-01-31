public class Employee{
    private String first_name;
    private String last_name;
    private int salary;
    private static int count = 0;

    public Employee(String s1, String s2, int x){
        first_name = s1;
        last_name = s2;
        salary = x;
        count++;
    }

    public void set_first_name(String s){
        first_name = s;
    }

    public void set_last_name(String s){
        last_name = s;
    }

    public void set_salary(int x){
        salary = x;
    }

    public String get_first_name(){
        return first_name;
    }

    public String get_last_name(){
        return last_name;
    }

    public int get_salary(){
        return salary;
    }

    public static int getCount(){
        return count;
    }

    public static String function(Employee e1,Employee e2){
        String ans = "";
        if(e1.get_salary() > e2.get_salary()){
            ans += e1.get_first_name() + " " + e1.get_last_name();
        }else{
            ans += e2.get_first_name() + " " + e2.get_last_name();
        }
        return ans;
    }
}

class TestEmployee{
    public static void main(String[] args) {
        int x;
        Employee e1 = new Employee("John","Hopkins",50000);
        Employee e2 = new Employee("Steve","Smith",200000);
        System.out.println("Yearly sal of " + e1.get_first_name() + " " + e1.get_last_name() + " - Rs " + 12*e1.get_salary());
        System.out.println("Yearly sal of " + e2.get_first_name() + " " + e2.get_last_name() + " - Rs " + 12*e2.get_salary());
        System.out.println("After 10% raise");
        x = e1.get_salary();
        x = x + (int)(0.1*x);
        e1.set_salary(x);
        x = e2.get_salary();
        x = x + (int)(0.1*x);
        e2.set_salary(x);
        System.out.println("Yearly sal of " + e1.get_first_name() + " " + e1.get_last_name() + " - Rs " + 12*e1.get_salary());
        System.out.println("Yearly sal of " + e2.get_first_name() + " " + e2.get_last_name() + " - Rs " + 12*e2.get_salary());
        System.out.println();
        System.out.println("Count of objects - " + Employee.getCount());
        System.out.print("One with greater salary - ");
        System.out.println(Employee.function(e1,e2));
    }
}
