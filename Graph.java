import java.util.Scanner;
public class Graph{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter an X coordinate and then a Y coordinate then do it again");
    double X = input.nextDouble();
    double Y = input.nextDouble();
    double X2 = input.nextDouble();
    double Y2 = input.nextDouble();
    System.out.println("the distance between the points is " + ((X-X2)+(Y-Y2)));
  }
}
