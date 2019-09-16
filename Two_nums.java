import java.util.Scanner;
import java.lang.Math;
public class Two_nums{
  public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.println("enter 2 numbers");
      double X = in.nextDouble();
      double Y = in.nextDouble();
      System.out.println("The sum is " + (X+Y));
      double XY = abs((X-Y));
      System.out.println("The difference is " + XY);
      System.out.println("The product is " + (X*Y));
      System.out.println("The quotient is " + (X/Y));
}
}
