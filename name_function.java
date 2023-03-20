import java.util.Scanner;
public class name_function{
    public static void printName(String name){
        System.out.println("Hello " + name);
       return;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        printName(name);

    }
}
    
