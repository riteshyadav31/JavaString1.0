public class day2 {
    public static void main(String[] args) {
      final String s1 = "hello";
      String s3 = s1.concat(" world"); // here s1 remains unchanged
      System.out.println(s3);
      s3 = s3.concat("!!!"); // here s3 is reassigned to a new string
      System.out.println(s3);
 //   s1=s1.concat(" world"); // error: cannot assign a value to final variable s1
      System.out.println(s1);
//       String s2 = "hello"; // s2 refers to the same string in the string pool as s1
//       System.out.println(s1 == s2); // true, same reference in string pool
//       s1=s1.concat(s2); // creates a new string in the string pool
// System.out.println(s1 == s2); // false, different references
//          System.out.println(s1.concat(" world "));
//         System.out.println(s1);
    }}

 