// public class bitwise38b {
//       public static void main(String[] args)
//       {
//             int x=0b1000;

//             int y;
//             y=x<<2;

//             System.out.println(y);
//       }
// }

// public class bitwise38b {
//       public static void main(String[] args)
//       {
//             int x=0b1000;

//             int y;
//             y=x>>1;

//             System.out.println(y);
//       }
// }

// public class bitwise38b {
//       public static void main(String[] args)
//       {
//             int x=-0b1010;

//             int y;

//             y=x>>>1;

//             System.out.println(y);
//       }
// }

public class bitwise38b {
      public static void main(String[] args) {
            int x = -0b1010;

            int y;

            y = ~x; // y=x>>1;

            System.out.println(String.format("%s", Integer.toBinaryString(x)));
            System.out.println(String.format("%s", Integer.toBinaryString(y)));
      }
}