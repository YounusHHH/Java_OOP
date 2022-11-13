
package pkg2dproject;


public class Cylinder extends Shape3D{

    public Cylinder(double hight, double radius) {
        super(hight, radius);
    }

    @Override
    public double getArea() {
        return 2*Math.PI*this.radius*this.hight+2*Math.PI*Math.pow(radius, 2);
    }

    
@Override
    public double getVolume() {
        return Math.pow(radius, 2)*Math.PI*this.hight;
    }
    
    
}
