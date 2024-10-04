
import java.util.Scanner;

public class challenge61b {
      public static void main(String[] args) 
      {
         
         int age;
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter age");
         age=sc.nextInt();

            if(age>=14 && age<=55)
            {
            System.out.println("Person is Young");
            }
            else 
            {
            System.out.println("Person is not young");
            }
      }
}
