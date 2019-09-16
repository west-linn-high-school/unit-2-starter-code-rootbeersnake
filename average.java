import java.util.Scanner;
public class average{
  public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.println("enter 3 numbers");
      int X = in.nextInt();
      int Y = in.nextInt();
      int Z = in.nextInt();
      System.out.println("The average is " + ((X+Y+Z)/3));

}
}
