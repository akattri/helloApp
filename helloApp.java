public class UC3HelloApp {
    public static void main(String[] args) {
        // Get name from command-line argument, default to "World" if not provided
        String name = (args.length > 0) ? args[0] : "World";
        
        System.out.println("Hello, " + name);
    }
}
