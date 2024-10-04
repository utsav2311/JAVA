import java.util.Scanner;

public class radix62a {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String num;

          System.out.println("Enter a Number");

          num = sc.nextLine();

          if (num.matches("[01]+")) {
               System.out.println("Binary Radix=2");
          } else if (num.matches("[0-7]+")) {
               System.out.println("Octal Number=8");
          } else if (num.matches("[0-9 A-F]+")) {
               System.out.println("Hexadecimal Number=16");
          } 
          else if (num.matches("[0-9]+")) {
               System.out.println("Decimal Number=10");
          }
          else 
          {
               System.out.println("Number is Invalid");
          }
     }
}
