class day5{
    public static void main(String[] args) {

        String s1 = "hello world";
        String s2 = "HELLO WORLD";
        System.out.println("s1 equals s2: " + s1.equals(s2)); // false, case-sensitive comparison
        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2)); // true, case-insensitive comparison
        

        String s3 ="a";
        String s4 ="b";
        System.out.println("s3 compareTo s4: " + s3.compareTo(s4)); // negative value, 'a' is less than 'b'
        System.out.println("s4 compareTo s3: " + s4.compareTo(s3)); // positive value, 'b' is greater than 'a'
        String s5 ="apple";
        String s6 ="apple";
        System.out.println("s5 compareTo s6: " + s5.compareTo(s6)); // 0, both strings are equal
        String s7 ="banana";
        System.out.println("s7 compareTo s5: " + s7.compareTo(s5)); // positive value, 'banana' is greater than 'apple'
String s8 ="a";
String s9 ="A";
        System.out.println("s9 compareTo s8: " + s9.compareTo(s8)); // positive value, 'A' (65) is less than 'a' (97) in ASCII

        String str1 = "HelloWorld";
        String str2 = "HelloJava";
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2)); // positive value, 'W' is greater than 'J'
        System.out.println("str2 compareTo str1: " + str2.compareTo(str1)); // negative value, 'J' is less than 'W'
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2)); // positive value, case-insensitive comparison
System.out.println("str2 compareToIgnoreCase str1: " + str2.compareToIgnoreCase(str1)); // negative value, case-insensitive comparison
System.out.println("hello".compareToIgnoreCase("Hello")); // positive value, 'h' (104) is greater than 'H' (72) in ASCII


    }
}