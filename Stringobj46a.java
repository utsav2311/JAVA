public class Stringobj46a {
      public static void main(String[] args) {
            
            String str1 = "Java Program";

            String str2=new String("JAVA");//created in heap

            char c[]={'H','e','l','l','o'};

            String str3 =new String(c,1,3);

            byte b[]={65,66,67,68};

            String str4=new String(b,2,2);
            //it means start from index 2 and take only 2 letter;

            
            System.out.println(str3);
      }
}
