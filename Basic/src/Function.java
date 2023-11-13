import java.util.Scanner;

public class Function {
    static int x = 5;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        
        System.out.println(x);
        foo();
        bar();
    }

    public static void foo() {
        scanner.nextDouble();
        System.out.println(x);
        x = 10;
    }

    public static void bar() {
        scanner.next();
        System.out.println(x);
    }
}
