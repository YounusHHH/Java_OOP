
package pkg2dproject;

public class Main {

    
    public static void main(String[] args) {
        Circle c=new Circle(5);
        Rectangle r= new Rectangle(10,25);
        Square s=new Square(5);
        Cylinder c1=new Cylinder(10,5);
        Cuble c2=new Cuble(5);
        
        
        System.out.printf("%.01f %n",c.getArea());
         System.out.printf("%.01f %n",r.getArea());
         System.out.printf("%.01f %n",s.getArea());
          System.out.printf("area %.01f volum %.01f%n",c1.getArea(),c1.getVolume());
          System.out.printf("area %.01f volum %.01f%n",c2.getArea(),c2.getVolume());
    }
    
}
