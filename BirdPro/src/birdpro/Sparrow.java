
package birdpro;

public class Sparrow extends Bird implements Flyable{

    public Sparrow(int weight, String gender) {
        super(weight, gender);
    }
    @Override
    public void fly(){
        System.out.println("flying");
    }
}
