import java.util.Scanner;

public class Two_nums{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter two numbers");
    double A = input.nextDouble();
    double B = input.nextDouble();
    System.out.println("the sum is " + (A+B));
    System.out.println("the difference is " + (A-B));
    System.out.println("the product is " + (A*B));
    System.out.println("the quotient is " + (A/B));
  }
}
