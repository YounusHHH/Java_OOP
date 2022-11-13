
package pkg2dproject;

public class Cuble extends Shape3D {


    public Cuble(double size) {
        super(size,size,size);
    }
   
    @Override
    public double getVolume() {
        return Math.pow(width, 3);
    }
     @Override
    public double getArea() {
        return this.width*this.width*6;
    }
    
}
