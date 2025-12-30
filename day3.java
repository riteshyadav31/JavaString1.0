class day3{
    public static void main(String[] args) {
        String s1 = "hello";
        String sc =new String();
        StringBuffer sb = new StringBuffer("hello");
       
         System.out.println(sb); 
         String s2 = sb.toString(); // converts StringBuffer to String
          s2 = s2 + " world"; // concatenates " world" to s2
         sb.append(" world"); // appends " world" to sb
         s1 = s1.concat(" world"); // concatenates " world" to s1
         System.out.println(s1==s1.concat(s2)); // false, different references
        System.out.println(s2); // prints "hello world"
         System.out.println(sb ==sb.append("!!!")); // true, same reference 
        System.out.println(sb);
        System.out.println(s1); // prints "hello"

        char[] cha = {'h', 'e', 'l', 'l', 'o'};
        String s9 = new String(cha); // creates a new String from char array
        System.out.println(s9);

        byte[] b = {65, 66, 67, 68, 69};
        byte b1 = '1';
    byte b2 = 66;
    byte b3 = 67;
        String s3 = new String(b); // creates a new String from byte array
System.out.println(b3);
        System.out.println(b1);
        System.out.println(cha);
        System.out.println(b);
        System.out.println(s3);
        System.out.println(s2);

        System.out.println(s3);

        // char array used for storing the passwords   because Strings are immutable and remain in memory until garbage collected
        // making them vulnerable to security risks and char arrays can be explicitly cleared after use and not stored in String pool and heap memory like Strings
// reducing the risk of sensitive data exposure and it can not be accessed directly like Strings
        char[] password = {'p', 'a', 's', 's', '1', '2', '3'};      
        String s4 = new String(password); // creates a new String from char array
        System.out.println(s4);      // after using the password, clear the char array
   System.out.println(password);
        for (int i = 0; i < password.length; i++) {
            password[i] = '\0'; // clear each character
        }
        System.out.println(password); // char array is cleared
   
String s5 = "rahul";
char[] ch = s5.toCharArray(); // converts String to char array
System.out.println(ch[1]); // prints 'a'





    }
}