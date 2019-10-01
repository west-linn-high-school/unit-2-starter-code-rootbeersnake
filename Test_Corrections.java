import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Test_Corrections{
public static void main(String[] args){
int n = 4;
double w = 5.0;
int m =2;
int r = 13;
int ans1 = m*r/n-n*m;
//26/4 = 6.5 - 8 = 2 when it's an int
//int ans2 = n*w+r;
//error because of lossy conversion
//double ans3 = r/m-w;
//error lossy conversion
// String a = ("A"); String is the return type and A is it's parameter
String firstName = "Sofia";
String middleName = "Maria";
String lastName = "Hernandez";
String F = firstName.substring(0,1);
String M = middleName.substring(0,1);
String L = lastName.substring(0,1);
String FML = F+M+L;
System.out.println(FML.toLowerCase());
//Used substring
Scanner scan = new Scanner(System.in);
Random rand = new Random();
System.out.println("enter a number between 1-100");
int userInput = scan.nextInt();
int randInput = rand.nextInt(100)+1;
int luckyNumber = Math.abs(userInput-randInput);
System.out.println("Your lucky number is: "+luckyNumber);
//fixed absolute value and put System.in in the scanner
}
}
