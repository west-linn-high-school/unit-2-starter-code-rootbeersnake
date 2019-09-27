import java.util.Random;

public class Phone{
  public static void main(String[] args){
    Random rand = new Random();
    int firstSpot = (rand.nextInt(8)+2);
    int secondSpot = (rand.nextInt(9));
    int thirdSpot = (rand.nextInt(10));
    String firstThree = ("("+firstSpot+""+secondSpot+""+thirdSpot+")");
    int spot4 = (rand.nextInt(8)+2);
    int spot5 = (rand.nextInt(10));
    int spot6 = (rand.nextInt(10));
    String secondThree = (spot4+""+spot5+""+spot6+"-");
    int spot7 = (rand.nextInt(10));
    int spot8 = (rand.nextInt(10));
    int spot9 = (rand.nextInt(10));
    int spot10 = (rand.nextInt(10));
    String last4 = (spot7+""+spot8+""+spot9+""+spot10);
    String finalNumber = firstThree + secondThree + last4;
    System.out.println(finalNumber);
  }
}
