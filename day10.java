class day10{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println("equals method result: " + sb2.equals(sb)); // Outputs false because equals() is not overridden in StringBuilder
        StringBuilder sb1 = new StringBuilder(); // Creates an empty StringBuilder
        System.out.println("Initial capacity: " + sb1.capacity()); // Outputs the initial capacity
        sb1.append("Java Programming is good"); // Appends a string to the StringBuilder
        System.out.println("Capacity after appending: " + sb1.capacity()); // Outputs the capacity after appending
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
    }

}