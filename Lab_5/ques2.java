import java.util.Scanner;
class Person{
    public String Hobby = "Reading";
    private String name;

    Person(String name){
        this.name = name;
    }

    public String getName(){
        return (this.name);
    }
}

class Student extends Person{
    public String Hobby = "Facebook";
    Student(String name){
        super(name);
    }

    public String getPersonHobby(){
        return (super.Hobby);
    }
}

class CSEStudent extends Student{
    public String Hobby = "Hacking";
    CSEStudent(String name){
        super(name);
    }

    public String getStudentHobby(){
        return (super.Hobby);
    }

    public String getPersonHobby(){
        return (super.getPersonHobby());
    }
}

public class ques2{
    public static void main(String[] args) {
        CSEStudent s1 = new CSEStudent("Varun");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("\nHello, my name is " + s1.getName() + " and my hobby is " + s1.Hobby + "\n");
                break;
            case 2:
                System.out.println("\nHello, my name is " + s1.getName() + " and my hobby is " + s1.getStudentHobby() + "\n");
                break;
            case 3:
                System.out.println("\nHello, my name is " + s1.getName() + " and my hobby is " + s1.getPersonHobby() + "\n");
        }
    }
}
