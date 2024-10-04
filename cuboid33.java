import java.util.Scanner;

public class cuboid33 {
      public static void main(String[] args) {
            int length, breadth, height;
            int totalArea, volume;
            
            Scanner sc = new Scanner(System.in);
            

            System.out.println("Enter Length,Breadth and Height");

            length = sc.nextInt();
            breadth = sc.nextInt();
            height = sc.nextInt();

            totalArea = 2*((length * height) + (breadth * height) + (length * breadth));

            volume = length * breadth * height;

            System.out.println("Total Area is " + totalArea);
            System.out.println("Volume is " + volume);

      }
}
