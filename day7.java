class day7{
    public static void main(String[] args) {
        String greeting = "Hello World!";
        System.out.println(greeting.replace("l", "Hi"));// Replaces "Hello" with "Hi"
        System.err.println(greeting.replaceFirst("o(.*)","hi"));// Replaces first "l" with "hi" we can also use regex here
       System.out.println(greeting.replaceAll("l.(.)", "n"));// Replaces all "l" with "n"
        System.out.println(greeting.toUpperCase());

    }
}