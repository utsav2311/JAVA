
import java.util.Scanner;

public class challenge61c {
      public static void main(String[] args) 
      {
            int m1, m2, m3;
            float avgMarks;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your marks of m1, m2 and m3");

            m1 = sc.nextInt();
            m2 = sc.nextInt();
            m3 = sc.nextInt();

            avgMarks = (float) (m1 + m2 + m3) / 3;

            if (avgMarks >= 70) {
                  System.out.println("Grade is 'A' ");
            } else if (avgMarks >= 60 && avgMarks < 70) {
                  System.out.println("Grade is 'B' ");
            } else if (avgMarks >= 50 && avgMarks < 60) {
                  System.out.println("Grade is 'C' ");
            } else if (avgMarks >= 40 && avgMarks < 50) {
                  System.out.println("Grade is 'D' ");
            }

            else {
                  System.out.println("Grade is 'Fail' ");
            }

      }
}
