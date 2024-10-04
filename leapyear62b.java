import java.util.Scanner;

public class leapyear62b {
      public static void main(String[] args) {
            int year;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Year :");
            year = scan.nextInt();

             if (year % 4 == 0) 
             {
                   if (year % 100 == 0) 
                   {
                         if (year % 400 == 0) 
                         {
                               System.out.println("It's a Leap Year");
                         } 
                   else 
                         {
                               System.out.println("Not a Leap Year");
                         }
                   } 
             else 
             {
                         System.out.println("It's a Leap Year");
             }
             }
            
      }
}