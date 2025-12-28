import java.util.Scanner;
class day1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        // String s1=new String("raju");// created in heap memory
        // String s2=new String("rahul");// created in heap memory
        // String s3=new String("raju");// created in heap memory
        // String s4="raju";// created in string pool
        // System.out.println(s1==s); // compares memory locations, false
        // System.out.println(s1==s3); // compares memory locations, false
        // System.out.println(s1.equals(s3)); // true, compares content
        // System.out.println(s1.equals(s4)); // true, compares content
         System.out.println("You entered: " + s);
int length = s.length();
String reversed = "";
for (int i=length-1; i>=0; i--) {
reversed+=s.charAt(i);
}
        System.out.println("reverse of the string: " + reversed);



        sc.close();
    }
}