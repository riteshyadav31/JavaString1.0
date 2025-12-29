public class day2 {
    public static void main(String[] args) {

String s1 = "hello";
String s2 = "hello";        
System.out.println(s1 == s2); // true, same reference in string pool
String s3 = new String("hello");
System.out.println(s1 == s3); // false, different references

// equals() method compares content and returns true
// == operator compares references and returns false
// equals method in object class compares references by default
// but in String class it is overridden to compare content
// in String class, equals() method is overridden to compare content
System.out.println(s1.equals(s3)); // true, same content












//       final String s1 = "hello";
//       String s3 = s1.concat(" world"); // here s1 remains unchanged
//       System.out.println(s3);
//       s3 = s3.concat("!!!"); // here s3 is reassigned to a new string
//       System.out.println(s3);
//  //   s1=s1.concat(" world"); // error: cannot assign a value to final variable s1
//       System.out.println(s1);
//       String s2 = "hello"; // s2 refers to the same string in the string pool as s1
//       System.out.println(s1 == s2); // true, same reference in string pool
//       s1=s1.concat(s2); // creates a new string in the string pool
// System.out.println(s1 == s2); // false, different references
//          System.out.println(s1.concat(" world "));
//         System.out.println(s1);
    }}

 