// Ayush Jain - 2017UCP1168
class IntegerSet{
	private boolean arr[] = new boolean[101];
	IntegerSet(){
		for (int i=0; i<101; i++) {
			arr[i] = false;
		}
	}

	public String toSetString(){
		String s = "{ ";
		for(int i=0; i<101; i++){
			if(arr[i] == true){
				s = s + i + " ";
			}
		}
		s = s + "}";
		return s;
	}

	public void insertElement(int k){
		arr[k] = true;
	}

	public void deleteElement(int k){
		arr[k] = false;
	}

	public void union(IntegerSet i1, IntegerSet i2){
		for (int i=0; i<101; i++) {
			if(i1.arr[i] == true || i2.arr[i] == true){
				this.arr[i] = true;
			}
		}
	}

	public void intersection(IntegerSet i1, IntegerSet i2){
		for (int i=0; i<101; i++) {
			if(i1.arr[i] == true && i2.arr[i] == true){
				this.arr[i] = true;
			}
		}
	}

	public boolean isEqualTo(IntegerSet i1){
		boolean ans = true;
		for (int i=0; i<101; i++) {
			if(this.arr[i] != i1.arr[i]){
				ans = false;
				break;
			}
		}
		return ans;
	}
}

public class IntegerSetTest{
	public static void main(String[] args) {
		IntegerSet i1 = new IntegerSet();
		i1.insertElement(1);
		i1.insertElement(3);
		i1.insertElement(5);
		i1.insertElement(7);
		i1.insertElement(9);
		IntegerSet i2 = new IntegerSet();
		i2.insertElement(2);
		i2.insertElement(4);
		i2.insertElement(6);
		i2.insertElement(8);
		i2.insertElement(10);
		System.out.println("i1 = " + i1.toSetString());
		System.out.println("i2 = " + i2.toSetString());
		IntegerSet i3 = new IntegerSet();
		i3.union(i1,i2);
		System.out.println("Union of i1 and i2 : " + i3.toSetString());
		IntegerSet i4 = new IntegerSet();
		i4.intersection(i1,i2);
		System.out.println("Intersection of i1 and i2 : " + i4.toSetString());
		i1.insertElement(11);
		i2.insertElement(11);
		System.out.println("i1 = " + i1.toSetString());
		System.out.println("i2 = " + i2.toSetString());
		i3.union(i1,i2);
		System.out.println("Union of i1 and i2 : " + i3.toSetString());
		i4.intersection(i1,i2);
		System.out.println("Intersection of i1 and i2 : " + i4.toSetString());
	}
}