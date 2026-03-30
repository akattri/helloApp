import java.util.Scanner;
public class helloApp{
    public static void main (String args[]){
        Scanner userinput = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = userinput.nextLine();
        System.out.println("Hello, " + name);
    }
}
