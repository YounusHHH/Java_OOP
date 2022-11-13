
package arabaproject;

public class araba {
    String marka;
    String model;
    int year;
    int distance;
    int speed;
   
    double go(int newDistace){
        distance=distance+newDistace;
        double timeToGo=newDistace/speed;
        return timeToGo;
    }
    void accelerate(int newSpeed){
        speed=speed+newSpeed;
    }
    void stop(){
        speed=0;
    }
    String getInfo(){
        String info="car info "+year+" "+marka+" "+model+". distance: "+distance+" km. and trelling at "+speed+"km";
        return info;
    }
}
