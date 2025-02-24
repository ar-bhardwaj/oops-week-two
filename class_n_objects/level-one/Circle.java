public class Circle {

    //created a variable
    double radius;

    public Circle(double radius){
        this.radius=radius;

    }
    //method for area of circle
    public double area(double radius){
        return Math.PI*radius*radius; //used in-built func

    }
    //method for circumference
    public double circumference(double radius){
        return 2*Math.PI*radius;
    }
    //
    public void displaymethods(){
        System.out.println("area of circle: "+area(radius));
        System.out.println("circumference of circle: "+circumference(radius));
    }
    public static void main(String[] args) {
        Circle c= new Circle(5);
        c.displaymethods();
    }
    
}
