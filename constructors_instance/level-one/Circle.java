import java.util.*;
public class Circle{
     double radius;

    public Circle(){
        this(5);
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public void display(){
        System.out.println("radius of Circle: "+ radius);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter radius for circle:10");
        double r=sc.nextDouble();
        Circle c=new Circle();
        Circle cc =new Circle(r);
        
        c.display();
        cc.display();

        sc.close();
    }
}