import java.util.Scanner;
class Student{
	private int sports;
    private int marks;
    private int total;

	public void setMarks(int x){
		marks = x;
	}

	public int getMarks(){
		return marks;
	}

	public void setSports(int m){
		sports = m;
	}

	public int getSports(){
		return sports;
	}

	public int getTotal(){
		return total;
	}

	public void setTotal(int x){
		total = x;
	}
}

class Exam extends Student{
	private int max_marks;
	public int getMaxMarks(){
		return max_marks;
	}
	public void setMaxMarks(int x){
		max_marks = x;
	}
}

interface Sports{
	int sportsMarks = 15;
	void computeMarks();
}

class Result extends Exam implements Sports{
	public void computeMarks(){
		int m1 = getMarks();
		int max = getMaxMarks();
		int sport = getSports();
		int finalMarks = m1;
		if(sport==1) finalMarks += sportsMarks;
		if(finalMarks > max){
			finalMarks = max;
		}
		setTotal(finalMarks);
	}
}

public class ques1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Result r1 = new Result();
		System.out.print("Enter marks of Student : ");
		int marks = s.nextInt();
		r1.setMarks(marks);
		System.out.print("Enter Maximum Marks : ");
		int max = s.nextInt();

		System.out.print("Inter NIT (1 -> yes, 0 -> no) : ");
		int tmp = s.nextInt();
		r1.setSports(tmp);
		r1.setMaxMarks(max);
		r1.computeMarks();
		System.out.println("Final marks : " + r1.getTotal());
	}
}
