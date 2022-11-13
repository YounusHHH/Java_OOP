
package pkg2dproject;


public class Shape2D {
    double hight;
    double width;
    double radius;
    double area;

    public Shape2D(double hight, double width) {
        this.hight = hight;
        this.width = width;
    }

    public Shape2D(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }
    
}
