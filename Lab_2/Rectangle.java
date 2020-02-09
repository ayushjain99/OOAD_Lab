public class Rectangle{
    float length = 1.0f;
    float width = 1.0f;

    public void setLength(float l){
        if((l > 0.0) && (l < 20.0)){
            length = l;
        }else{
            System.out.println("Error : Length should be between 0.0 and 20.0. Try Again");
        }
    }

    public void setWidth(float w){
        if((w > 0.0) && (w < 20.0)){
            width = w;
        }else{
            System.out.println("Error : Width should be between 0.0 and 20.0. Try Again");
        }
    }

    public float getLength(){
        return length;
    }

    public float getWidth(){
        return width;
    }

    public float cal_perimeter(){
        return 2*(length+width);
    }

    public float cal_area(){
        return (length*width);
    }

    // Testing
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setWidth(21);
        r.setWidth(15);
        r.setLength(12);
        float a = r.cal_perimeter();
        float b = r.cal_area();
        System.out.println("Perimeter = " + a);
        System.out.println("Area = " + b);
    }
}
