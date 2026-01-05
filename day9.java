public class day9 {
    public static void main(String[] args) {
       StringBuffer sb = new StringBuffer("Hello");
       StringBuffer sb2 = new StringBuffer("Hello"); // Creates a StringBuffer with a capacity of 50
      System.out.println("equals method result: " + sb2.equals(sb)); // Outputs false because equals() is not overridden in StringBuffer
       StringBuffer sb1 = new StringBuffer(); // Creates an empty StringBuffer
       System.out.println("Initial capacity: " + sb1.capacity()); // Outputs the initial capacity
      sb1.append("Java Programming is good"); // Appends a string to the StringBuffer
       System.out.println("Capacity after appending: " + sb1.capacity()); // Outputs the
       sb.append(" World"); // Appends " World" to the original string            
       System.out.println(sb); // Outputs "Hello World"
       sb.insert(5, ","); // Inserts a comma at index 5
       System.out.println(sb); // Outputs "Hello, World"
       sb.replace(6, 11, " Java");
       System.out.println(sb); 
       sb.delete(5, 6); // Deletes the comma    
       System.out.println(sb);  
         sb.reverse(); // Reverses the string
         System.out.println(sb); // Outputs "dlroW olleH"
// type conversion methods 
       String str = "12345";
       int num = Integer.parseInt(str); // Converts string to int
       System.out.println("Converted integer: " + num);

       // back to string
       String str2 = Integer.toString(num); // Converts int back to string
         System.out.println("Converted back to string: " + str2);

       // the significance difference between String, StringBuffer, and String in Java is that String is immutable, meaning once created, its value cannot be changed. StringBuffer is mutable, allowing modifications
   
    }
}
