import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What your name?");

//        String userName = scanner.next();
//        System.out.println(userName + " is your name.");

//        String fristName = scanner.next();
//        String lastName = scanner.next();
//        System.out.println(fristName + " " + lastName + " is your name.");
        String name = scanner.nextLine();
        System.out.println(name + " is your name.");
    }
}
