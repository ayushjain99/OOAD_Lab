public class ComplexNum{
	// a + ib
	private double a;
	private double b;
	ComplexNum(){
		a = 1.0;
		b = 1.0;
	}
	
	ComplexNum(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	public void add(ComplexNum c1,ComplexNum c2){
		this.a = c1.a + c2.a;
		this.b = c1.b + c2.b;
	}
	
	public void subtract(ComplexNum c1,ComplexNum c2){
		this.a = c1.a - c2.a;
		this.b = c1.b - c2.b;
	}
	
	public void display(){
		if(b>=0){
			System.out.print(a + " + " + b + "i");
		}else{
			System.out.print(a + " - " + (-b) + "i");
		}
	}
}

class ComplexNumTest{
	public static void main(String args[]){
		ComplexNum c1 = new ComplexNum(5,3);
		ComplexNum c2 = new ComplexNum(-2,5);
		System.out.print("c1 = "); c1.display();
		System.out.println();
		System.out.print("c2 = "); c2.display();
		System.out.println();
		ComplexNum c3 = new ComplexNum();
		c3.add(c1,c2);
		System.out.print("c1 + c2 = "); c3.display();
		System.out.println();
		ComplexNum c4 = new ComplexNum();
		c4.subtract(c1,c2);
		System.out.print("c1 - c2 = "); c4.display();
		System.out.println();
	}
}


