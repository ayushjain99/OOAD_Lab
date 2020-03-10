// Ayush Jain - 2017UCP1168
// Implementing the CharSequence interface of java.lang
public class Question implements CharSequence {
    private String s;

    public Question(String s) {
        this.s = s;
    }

    //If the string is backwards, the end is the beginning
    private int fromEnd(int i) {
        return s.length() - 1 - i;
    }

    public char charAt(int i) {
        if ((i < 0) || (i >= s.length())) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return s.charAt(fromEnd(i));
    }

    public int length() {
        return s.length();
    }

    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > s.length()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }
        String tmp = ""; int i = end-1;
        while(i >= start){
            tmp = tmp + s.charAt(i);
            i--;
        }
        return (tmp);
    }

    public String toString() {
        String tmp = ""; int i;
        for(i=s.length()-1 ; i>=0 ; i--){
            tmp = tmp + s.charAt(i);
        }
        return tmp;
    }
}

class Test{
    public static void main(String[] args) {
        Question s = new Question("Write a class that implements the CharSequence interface");

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }

        System.out.println("");

        //Test subSequence() and length();
        int start = 8;
        int end = 13;
        System.out.println(s.subSequence(start, end));

        //Test toString();
        System.out.println(s);

    }
}
