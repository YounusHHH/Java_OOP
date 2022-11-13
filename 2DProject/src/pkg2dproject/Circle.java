
package pkg2dproject;


public class Circle extends Shape2D {

    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2)*Math.PI;
    }

   
    
}
