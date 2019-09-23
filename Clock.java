import java.util.Scanner;
public class Clock{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter a time in hours, minutes, and seconds");
    double H = input.nextDouble();
    double M = input.nextDouble();
    double S = input.nextDouble();
    System.out.println(H + " hours in seconds is " + (H*60*60));
    System.out.println(M + " minutes in seconds is " + (H*60));
    System.out.println(S + " seconds in seconds is " + (H*60*60));
  }
}
