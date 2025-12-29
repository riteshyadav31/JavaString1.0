public class day2 {
    public static void main(String[] args) {
      String s1 = "hello";
      String s2 = "hello"; // s2 refers to the same string in the string pool as s1
      System.out.println(s1 == s2); // true, same reference in string pool
      s1=s1.concat(s2); // creates a new string in the string pool
System.out.println(s1 == s2); // false, different references
         System.out.println(s1.concat(" world "));
        System.out.println(s1); 
    }}

