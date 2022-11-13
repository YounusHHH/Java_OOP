
package pkg2dproject;


public class Rectangle extends Shape2D{

    public Rectangle(double hight, double width) {
        super(hight, width);
    }
        public Rectangle( double width) {
        super(  width);
    }
    
    @Override
     public double getArea() {
        return this.hight*this.width;
    }
    
}
