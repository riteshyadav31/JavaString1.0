class day6{
    public static void main(String[] args) {
        String name = "  OpenAI ";
        String name1 = "ChatGPT  ";
        System.out.println("Original name: "+ name + name1);
        System.out.println("concatenated name: "+ name.concat(name1));
     
          System.out.println("Original name: "+ name);
        System.out.println("name after join: "+ String.join(",",name,name1)); // removes leading and trailing whitespace including unicode spaces
       // System.out.println("name after join: "+ String.join(null, name, name1));// joins multiple strings with a delimiter but with null it send nullpointerexception
    }
}