class day6{
    public static void main(String[] args) {
        String name = "  OpenAI ";
        String name1 = "ChatGPT  ";
        System.out.println("Original name: "+ name + name1);
        System.out.println("concatenated name: "+ name.concat(name1));
     
          System.out.println("Original name: "+ name);
        System.out.println("name after join: "+ String.join(",",name,name1)); // removes leading and trailing whitespace including unicode spaces
       // System.out.println("name after join: "+ String.join(null, name, name1));// joins multiple strings with a delimiter but with null it send nullpointerexception
   
       // substring and subSequence
       String message = "Hello, welcome to OpenAI ChatGPT!";
       String str = "Hello, welcome to OpenAI ChatGPT!";
         System.out.println("Original message: " + message);
        String sub1 = message.substring(7, 14); // "welcome"
        String sub2 = message.substring(7,14); // "to OpenAI ChatGPT!"
        System.out.println("Substring (7, 14): " + sub1);
        String sub3 = message.substring(15); // "to OpenAI ChatGPT!"
        System.out.println("Substring (15): " + sub2);
        CharSequence subSeq = str.subSequence(7, 14); // "welcome"
        System.out.println("SubSequence (7, 14): " + subSeq);
        System.out.println("comparison : " + subSeq.equals(sub1)); // true
   System.out.println("comparison : " + subSeq==sub1); // false because they are different objects
  // System.out.println("comparison using compareTo : " + subSeq.compareTo(sub1)); // 0 because they are equal
 System.out.println(sub1==sub2);
}
}