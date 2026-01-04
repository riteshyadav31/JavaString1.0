public class day8 {
    public static void main(String args[]){
        String s1="  Hello  World  "; 
        System.out.println(s1.charAt(4)); 
        System.out.println(s1.indexOf("o"));
        System.out.println(s1.lastIndexOf("o"));
        System.out.println(s1.contains("World"));
        System.out.println(s1.startsWith("  He"));
        System.out.println(s1.endsWith("  "));

        // type conversion methods 

        int a=65;
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(String.valueOf(a)); // converts int to string
        System.err.println(s1.toCharArray()); // converts string to char array





    }}