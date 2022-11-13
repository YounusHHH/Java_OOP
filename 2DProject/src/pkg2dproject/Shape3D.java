
package pkg2dproject;

public class Shape3D extends Shape2D{
    double depth;
    double volume;
    double size;

    public Shape3D( double hight, double width,double depth) {
        super(hight, width);
        this.depth = depth;
    }

    public Shape3D(double hight, double radius) {
        super(radius);
        this.hight=hight;
       
        
    }
    
    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }
    
}
