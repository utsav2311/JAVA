public class formatted43 {
      public static void main(String[] args) {
            int x=10;
            float y=0.0012f;
            char z='A';
            String str= "Java Program";

            System.out.printf("Hello %x %f %c World\n",x,y,z);
            System.out.printf("Hello %e \n",y);
            System.out.printf("Hello %s \n",str);
            System.out.printf("%1$d %1$d %1$d \n",x);
            System.out.printf("%3$s %2$f %1$d",x,y,str);

      }
}
