
import java.util.Scanner;
class Scannerexample {
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your name");
 String name = sc.nextLine();
 System.out.println("your name is:" +name);
 System.out.println("enter the integer value");
 int a= sc.nextInt();
 System.out.println("the integer value:" +a);
 System.out.println("enter the byte value");
 Byte b = sc.nextByte();
 System.out.println("the byte value:" +b);
 System.out.println("enter boolean value");
 boolean c = sc.nextBoolean();
 System.out.println("the boolean value" +c);
 System.out.println("enter the float value");
 float d= sc.nextFloat();
 System.out.println("the float value :" + d);
 System.out.println("enter your character value");
 char character =sc.next().charAt(0);
 System.out.println("your character is" + character);
 }
}
