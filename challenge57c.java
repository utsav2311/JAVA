public class challenge57c {
      public static void main(String[] args) 
      {
        
            String str="      abc     def     gh   ijk    ";
            
            str=str.replaceAll("\\s+", " ").trim();
            
            String words[]=str.split("\\s");
            
            System.out.println(words.length);
            
            
        }
}
