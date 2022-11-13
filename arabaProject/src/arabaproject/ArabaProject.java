
package arabaproject;

public class ArabaProject {

    public static void main(String[] args) {
        araba car1=new araba();
        car1.marka="BMW";
        car1.model="M5";
        car1.year=2010;
        car1.distance=0;
        
        String info=car1.getInfo();
        System.out.println(car1.getInfo());
        System.out.println("when car moves");
        car1.accelerate(120);
        car1.go(240);
        car1.go(50);
        System.out.println(car1.getInfo());
        car1.stop();
        System.out.println(car1.getInfo());
        
    }
    
}
