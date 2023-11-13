# Java Basic

```java
public class Main {
    public static void main(String[] args) {
        // \n - newline
        // \t - tab
        // \b - backspace
        System.out.println("Nguyễn Tuấn Anh đẹp trai!");
        System.out.println("Sáu Bảnh");
    }
}
```

## Variables

### Primitive Data types

| Data type | Value Range                                 |
| --------- | ------------------------------------------- |
| byte      | -128 to 127                                 |
| sort      | -32768 to 32767                             |
| int       | -2147483648 to 2147483647                   |
| long      | -9223372036854775808 to 9223372036854775807 |
| float     | varies                                      |
| double    | varies                                      |
| boolean   | true/false                                  |
| char      | 0 to 65535                                  |

```java
public class UserInput1 {
    public static void main(String[] args) {
        int one= 5;
        double two = one;
        System.out.println(one);
        System.out.println(two);
    }
}
```

```java
public class UserInput1 {
    public static void main(String[] args) {
        int foo = 17;
        int bar = 4;
//        System.out.println((double) foo/bar);
//        System.out.println(foo/(double)bar);
        System.out.println((double) (foo/bar)); // not do this
    }
}

```

### User Input

```java
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What your name?");
        String userName = scanner.next();
        System.out.println(userName + " is nice name.");

        System.out.println("How old are you?");
        int userAge = scanner.nextInt();
        System.out.println("Your name is " + userName + " and you are " + userAge + " years old.");

        System.out.println("How tall are you in metres?");
        double userHeight = scanner.nextDouble();
        System.out.println("Your are " + userHeight + " metres tall.");
    }
}

```

```java
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

```

### Conditional Statements

```java
import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wellcome to SuperFast Rollercoaster!");
        System.out.println("Please enter your height in centimetres: ");
        int height = scanner.nextInt();

//        if (height < 130) {
//            System.out.println("Sorry, you are too short.");
//        }
//
//        if (height >= 130) {
//            System.out.println("Height accepted. Go ahead.");
//        }

//        if (height < 130) {
//            System.out.println("Sorry, you are too short.");
//        }else {
//            System.out.println("Height accepted. Go ahead.");
//        }

        if (height < 130) {
            System.out.println("Sorry, you are too short.");
        }else if (height > 210) {
            System.out.println("Sorry, you are too tall.");
        }else {
            System.out.println("Height accepted. Go ahead.");
        }
    }
}

```

```java
public class conditionalStatements {
    public static void main(String[] args) {
        System.out.println("TuanAnh".equals("tuananh"));
    }
}
```

switch

```java
public class conditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num){
            case 1:
                System.out.println("You enter one.");
                break;
            case 2:
                System.out.println("You enter two.");
                break;
            case 3:
                System.out.println("You enter three.");
                break;
            default:
                System.out.println("Invalid number.");
                break;
        }
    }
}
```

### Loop

#### while

```java
public class Loop {
    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}

```

#### for

```java
public class Loop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

    }
}

```

#### Break and continue

```java
// Break
public class Loop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

    }
}

```

```java
public class Loop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }
}

```

#### do while

```java
public class Loop {
    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println(i);
            i++;
        }while (i <= 10);

    }
}

```

```java
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Loop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String again;

        do {
            int num = ThreadLocalRandom.current().nextInt(1,7);
            System.out.println("You rolled a " + num + ".");
            System.out.println("Roll again? y/n: ");
            again = scanner.next();
        }while (again.equals("y"));
    }
}

```

### Arrays

```java
public class Arrays {
    public static void main(String[] args){
        int[] b = {72, 56, 84, 15, 55};
        // System.out.println(b[2]);
        System.out.println(b.length);
        // b[2] = 10;
        // System.out.println(b[2]);
        for (int i = b.length; i < 5; i++) {
            System.out.println(b[i]);
        }
    }
}
```

```java
public class Arrays {
    public static void main(String[] args){
        int[] nums = {72, 56, 84, 15, 55};
        int count = 0;
        int sumOfNums = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
            sumOfNums = sumOfNums + nums[i];
        }
        double mean = (double)sumOfNums / nums.length;
        System.out.println("Count: " + count);
        System.out.println("sumOfNums: " + sumOfNums);
        System.out.println(mean);
    }
}

```

```java
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of laps: ");
        int numberOfLaps = scanner.nextInt();

        double[] laptimes = new double[numberOfLaps];

        for(int i = 0; i < numberOfLaps; i++){
            System.out.print("Lap time: ");
            laptimes[i] = scanner.nextDouble();
        }

        double fastestTime = laptimes[0];
        for(int i = 1; i < numberOfLaps; i++){
            if (laptimes[i] < fastestTime) {
                fastestTime = laptimes[i];
            }
        }
        System.out.println("Fastest time: " + fastestTime);
    }
}
```

#### Foreach loop

```java
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        double[] da = new double[] {25.9, 1.34, -76.24, 833.11, 76.084};

        for (double e : da) {
            System.out.println(e);
        }
    }
}
```

### Function

```java
public class Function {
    public static void main(String[] args){
        foo("Nguyễn Tuấn Anh");
    }

    public static void foo(String string) {
        System.out.println(string);
    }
}

```

```java
public class Function {
    public static void main(String[] args){
        int var;
        var = 10;
        foo(var, 0.1, "điểm không có nhưng");
    }

    public static void foo(int a, double b, String c) {
        System.out.println(a + b + c);
    }
}

```

```java
public class Function {
    public static void main(String[] args){
        foo(bar(7));
    }

    public static void foo(int a) {
        System.out.println(a);
    }

    public static int bar(int a) {
        return a;
    }
}

```

```java
public class Function {
    public static void main(String[] args){
        System.out.println(sum(sum(sum(4, sum(4, 1)), 4), 8));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}

```

```java
public class Function {
    public static void main(String[] args){
        System.out.println(coneVolume(4,5));
    }

    public static double coneVolume(double r, double h) {
        return Math.PI * r * r * h / 3;
    }
}

```

```java
public class Function {
    public static void main(String[] args){
        int a = 10;
        int b = a;
        b = 20;

        int[] x = {3, 5, 8, 65, 32};
        int[] y = x;

        y[0] = 44;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("+++++++++++++++++++++++++");
        for (int i = 0; i < x.length; i++){
            System.out.println("X [" + i + "] =" + x[i]);
        }
        System.out.println("+++++++++++++++++++++++++");
        for (int i = 0; i < y.length; i++){
            System.out.println("Y [" + i + "] =" + y[i]);
        }
    }
}

```

```java
public class Function {
    public static void main(String[] args){

        int[] x = {3, 5, 8, 65, 32};
        int[] d = foo(x);
        d[4] = 35;
        System.out.println("+++++++++++++++++++++++++");
        for (int i = 0; i < x.length; i++){
            System.out.println("X [" + i + "] =" + x[i]);
        }
    }

    public static int[] foo(int[] c) {
        c[1] = 50;
        return c;
    }
}

```

```java
public class Function {
    static int x = 5;
    public static void main(String[] args){
        System.out.println(x);
        foo();
        bar();
    }

    public static void foo() {
        System.out.println(x);
        x = 10;
    }

    public static void bar() {
        System.out.println(x);
    }
}

```

```java
import java.util.Scanner;

public class Function {
    static int x = 5;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(x);
        foo(scanner);
        bar(scanner);
    }

    public static void foo(Scanner scanner) {
        scanner.nextDouble();
        System.out.println(x);
        x = 10;
    }

    public static void bar(Scanner scanner) {
        scanner.next();
        System.out.println(x);
    }
}

```

```java
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

```

#### Tic-Tac-Toe

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        Scanner scanner = new Scanner(System.in);

        int input;
        char turn = 'X';
        int currentTurn = 1;

        while (true) {
            do {
                System.out.print("Enter a position: ");
                input = scanner.nextInt();
            } while (pos[input - 1] == 'X' || pos[input - 1] == 'O');
            pos[input - 1] = turn;

            System.out.println("\n " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " \n");

            if (pos[0] == turn && pos[1] == turn && pos[2] == turn
                || pos[3] == turn && pos[4] == turn && pos[5] == turn
                || pos[6] == turn && pos[7] == turn && pos[8] == turn
                || pos[6] == turn && pos[3] == turn && pos[0] == turn
                || pos[7] == turn && pos[4] == turn && pos[1] == turn
                || pos[8] == turn && pos[5] == turn && pos[2] == turn
                || pos[6] == turn && pos[4] == turn && pos[2] == turn
                || pos[8] == turn && pos[4] == turn && pos[0] == turn){
                    System.out.println(turn + " is the WINNER!!!");
                    break;
            }

            if (turn == 'X') {
                turn = 'O';
            }else if (turn == 'O') {
                turn = 'X';
            }

            currentTurn++;
            if (currentTurn > 9) {
                System.out.println("DRAW");
                break;
            }
        }
    }
}
```

#### SimpleGuestListProgram

```java
import java.util.Scanner;

public class Main {
    static String[] guests = new String[10];
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            displayGuests();
            int option = scanner.nextInt();
            displayMenu();
            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                        guests[i] = scanner.next();;
                        break;
                    }
                }
            }else if (option == 2) {
                System.out.println("Name: ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }

            }else if (option == 3) {
                break;
            }

        } while (true);
        System.out.println("Exiting...");
    }

    static void displayGuests() {
        System.out.println();
        System.out.println("______________________________");
        System.out.println("\t- Guests -");
        for (int i = 0; i < guests.length; i++) {
            // if (guests[i] == null) {
            //     System.out.println("--");
            // }else {
            //     System.out.println(guests[i]);
            // }
            System.out.println(guests[i] == null ? "--" : guests[i]);
        }
    }

    static void displayMenu() {
        System.out.println();
        System.out.println("______________________________");
        System.out.println("\t- Menu -");
        System.out.println("1 - Add Guest.");
        System.out.println("2 - Remove Guest.");
        System.out.println("3 - Exit.");
        System.out.print("Options: ");
        System.out.println();
    }
}
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] guests = new String[10];
        Scanner scanner = new Scanner(System.in);

        do {
            displayGuests(guests);
            System.out.println();
            System.out.println("______________________________");
            System.out.println("\t- Menu -");
            System.out.println("1 - Add Guest.");
            System.out.println("2 - Remove Guest.");
            System.out.println("3 - Exit.");
            System.out.print("Options: ");
            int option = scanner.nextInt();
            System.out.println();

            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                        guests[i] = scanner.next();;
                        break;
                    }
                }
            }else if (option == 2) {
                System.out.println("Name: ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }

            }else if (option == 3) {
                break;
            }

        } while (true);
        System.out.println("Exiting...");
    }

    public static void displayGuests(String[] guests) {
        System.out.println();
            System.out.println("______________________________");
            System.out.println("\t- Guests -");
            for (int i = 0; i < guests.length; i++) {
                // if (guests[i] == null) {
                //     System.out.println("--");
                // }else {
                //     System.out.println(guests[i]);
                // }
                System.out.println(guests[i] == null ? "--" : guests[i]);
            }
    }
}
```

```java
import java.util.Scanner;

public class Main {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        do {
            displayGuests();
            displayMenu();
            int option = getOption();
            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                        guests[i] = scanner.next();;
                        break;
                    }
                }
            }else if (option == 2) {
                System.out.println("Name: ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }
                String[] temp = new String[guests.length];
                int ti = 0;
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null) {
                        temp[ti] = guests[i];
                        ti++;
                    }
                }
                guests = temp;
            }else if (option == 3) {
                break;
            }

        } while (true);
        System.out.println("Exiting...");
    }

    static void displayGuests() {
        System.out.println();
        System.out.println("______________________________");
        System.out.println("\t- Guests -");
        for (int i = 0; i < guests.length; i++) {
            // if (guests[i] == null) {
            //     System.out.println("--");
            // }else {
            //     System.out.println(guests[i]);
            // }
            System.out.println((i + 1) + ". " + (guests[i] == null ? "--" : guests[i]));
        }
    }

    static void displayMenu() {
        System.out.println();
        System.out.println("______________________________");
        System.out.println("\t- Menu -");
        System.out.println("1 - Add Guest.");
        System.out.println("2 - Remove Guest.");
        System.out.println("3 - Exit.");
        System.out.println();
    }

    static int getOption() {
        System.out.print("Options: ");
        return scanner.nextInt();
    }
}
```

```java
import java.util.Scanner;

public class Main {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        insertTestName();
        do {
            displayGuests();
            displayMenu();
            int option = getOption();
            if (option == 1) {
                addGuest();
            }else if (option == 2) {
                insertGuest();
            }else if (option == 3) {
                renameGuest();
            }else if (option == 4) {
                removeGuest();
            }else if (option == 5) {
                break;
            }

        } while (true);
        System.out.println("Exiting...");
    }

    static void displayGuests() {
        System.out.println();
        System.out.println("______________________________");
        System.out.println("\t- Guests -");
        boolean isEmpty = true;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println((i + 1) + ". " + guests[i]);
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("Guest list is empty.");
        }
    }

    static void displayMenu() {
        System.out.println();
        System.out.println("______________________________");
        System.out.println("\t- Menu -");
        System.out.println("1 - Add Guest.");
        System.out.println("2 - Insert Guest.");
        System.out.println("3 - Rename Guest.");
        System.out.println("4 - Remove Guest.");
        System.out.println("5 - Exit.");
        System.out.println();
    }

    static int getOption() {
        System.out.print("Options: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }

    static void addGuest(){
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                guests[i] = scanner.nextLine();
                break;
            }
        }
    }

    static void insertGuest() {
        System.out.println("Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number >= 1 && number <= 10 && guests[number - 1] != null) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            for (int i = guests.length - 1; i > number - 1 ; i--){
                guests[i] = guests[i - 1];
            }

            guests[number - 1] = name;
        }else {
            System.out.println("Error: There is no guest with that number.");
        }
    }

    static void renameGuest() {
        System.out.println("Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number >= 1 && number <= 10 && guests[number - 1] != null) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            guests[number - 1] = name;
        }else {
            System.out.println("Error: There is no guest with that number.");
        }
    }

    static void removeGuest(){
        System.out.println("Number: ");
        int number = scanner.nextInt();
        if (number >= 1 && number <= 10 && guests[number - 1] != null) {
            guests[number - 1] = null;
            String[] temp = new String[guests.length];
            int ti = 0;
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] != null) {
                    temp[ti] = guests[i];
                    ti++;
                }
            }
            guests = temp;
        }else {
            System.out.println("Error: There is no guest with that number.");
        }
    }

    static void insertTestName() {
        guests[0] = "TuanAnh";
        guests[1] = "TaiLe";
        guests[2] = "Cuong";
        guests[3] = "SauBanh";
        guests[4] = "Toan";
    }
}
```

### Data structures

```java
// file Employee
public class Employee {
    String name;
    int age;
    String jobTitle;
}

// file Employee

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.name = "Nguyen Tuan Anh";
        employee1.age = 22;
        employee1.jobTitle = "Software Engineer";

        employee2.name = "Le Van Tai";
        employee2.age = 23;
        employee2.jobTitle = "Telephone";

        employee3.name = "Do Quoc Cuong";
        employee3.age = 22;
        employee3.jobTitle = "Marketing";

        bar(employee1);
    }

    static void bar(Employee e) {
        System.out.println(e.name + " is " + e.age + " year old and is a " + e.jobTitle);
    }
}

```

#### State and behaviour

```java
// file Door.java
public class Door {
    String name;
    boolean isOpen;

    void open() {
        isOpen = true;
    }

    void close() {
        isOpen = false;
    }

    void printStatus() {
        if (isOpen) {
            System.out.println(name+ "'s door is open.");
        }else {
            System.out.println(name+ "'s door is close.");
        }
    }
}


// file Main.java
public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        door.name = "Nguyen Tuan Anh";
        door.open();
        door.printStatus();

        Door door2 = new Door();
        door2.name = "Sau Banh";
        door2.close();
        door2.printStatus();
    }
}

```

### Encapsulation

```java
// file Rectangle.java
public class Rectangle {
    private int height; // const is always private
    private int width; // const is always private

    void setHeight(int h) {
        height = h;
    }

    void setWidth(int w) {
        width = w;
    }

    void printArea() {
        System.out.println(height * width);
    }
}

// file Main.java
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setHeight(5);
        r1.setWidth(9);
        r1.printArea();

        Rectangle r2 = new Rectangle();
        r2.setHeight(8);
        r2.setWidth(4);
        r2.printArea();
    }
}
```

```java
// file Rectangle.java

public class Rectangle {
    private int height = 1; // const is always private
    private int width = 1; // const is always private

    void setHeight(int h) {
        if (h > 0){
            height = h;
        }
    }

    int getHeight() {
        return height;
    }

    void setWidth(int w) {
        if (w > 0) {
            width = w;
        }
    }

    int getWidth() {
        return width;
    }

    int getArea() {
        return height * width;
    }

    public int getPermieter() {
        return ((2 * height) + (2 * width));
    }
}

// file Main.java

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        // r1.setHeight(5);
        // r1.setWidth(9);
        // r1.printArea();

        Rectangle r2 = new Rectangle();
        r2.setHeight(8);
        r2.setWidth(4);
        System.err.println("Height: " + r2.getHeight() + " Width: " + r2.getWidth() + " Area:  " + r2.getArea() + " Permieter: " + r2.getPermieter());
    }
}
```

#### Contructor

```java
// file Rectangle.java

public class Rectangle {
    private int height = 1; // const is always private
    private int width = 1; // const is always private

    public Rectangle (int h, int w) {
        // System.out.println("Rectangle created");
        // if (h > 0) {
        //     height = h;
        // }
        // if (w > 0) {
        //     width = w;
        // }
        setHeight(h);
        setWidth(w);
    }

    public void setHeight(int h) {
        if (h > 0){
            height = h;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int w) {
        if (w > 0) {
            width = w;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return height * width;
    }

    public int getPermieter() {
        return ((2 * height) + (2 * width));
    }
}

// file Main.java
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(7, 9);

        Rectangle r2 = new Rectangle(8, 4);

        System.out.println(r1.getHeight() + ", " + r1.getWidth());
        System.out.println(r2.getHeight() + ", " + r2.getWidth());
    }
}

```

#### Array List

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] sa = new String[5];
        ArrayList<String> sal = new ArrayList<String>();
        sal.add("Tuan anh dep train");
        sal.add("Tai Le");
        sal.add("Cuong");
        int index = sal.indexOf("Cuong");
        System.out.println(index);
        System.out.println(sal.get(1));
        sal.set(1, "Tai Cho Dien");
        System.out.println(sal.get(1));
        System.out.println(sal.size());
        sal.clear();
        System.out.println(sal.size());
    }
}
```

#### Composition

```java
// Student.java
public class Student {
    private String name;
    private String dateOfBirth;
    private boolean hasStudentHousing;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isHasStudentHousing() {
        return this.hasStudentHousing;
    }

    public void setHasStudentHousing(boolean hasStudentHousing) {
        this.hasStudentHousing = hasStudentHousing;
    }
}
// Main.java
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nguyen Tuan Anh");
        student.setDateOfBirth("05/06/2001");
        student.setHasStudentHousing(true);

        System.out.println("Name: " + student.getName());
        System.out.println("Dob: " + student.getDateOfBirth());
        System.out.println("Housing: " + (student.isHasStudentHousing() ? "YES" : "NO"));
    }
}
```

```java
// file Course.java
public class Course {
    private String title;
    private String level;
    private String startDate;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
// file Student.java
public class Student {
    private String name;
    private String dateOfBirth;
    private boolean hasStudentHousing;
    public Course course;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isHasStudentHousing() {
        return this.hasStudentHousing;
    }

    public void setHasStudentHousing(boolean hasStudentHousing) {
        this.hasStudentHousing = hasStudentHousing;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }
}
// file Main.java
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nguyen Tuan Anh");
        student.setDateOfBirth("05/06/2001");
        student.setHasStudentHousing(true);
        student.course = new Course();
        student.getCourse().setTitle("Java Course");
        student.getCourse().setLevel("Beginer");
        student.getCourse().setStartDate("08/11/2023");

        Course c = student.getCourse();//
        c.setTitle("Java Course");// using this like: student.getCourse().setTitle("Java Course");
        c.setLevel("Beginer");//using this like: student.getCourse().setLevel("Beginer");
        c.setStartDate("08/11/2023");//using this like: student.getCourse().setStartDate("08/11/2023");

        System.out.println("Name: " + student.getName());
        System.out.println("Dob: " + student.getDateOfBirth());
        System.out.println("Housing: " + (student.isHasStudentHousing() ? "YES" : "NO"));
        System.out.println("The student " + student.getName() + " Is enrolled on the " + student.getCourse().getTitle() + "course due to start on " + student.getCourse().getStartDate());
    }
}
```

#### Enums

```java
// file Main.java
public class Main {
    public static void main(String[] args) {
        whichSeason(6);
    }

    public static void whichSeason(int month) {
        switch (month) {
            case 1:
                System.out.println("January is in the winter season.");
                break;
            case 2:
                System.out.println("February is in the winter season.");
                break;
            case 3:
                System.out.println("March is in the spring season.");
                break;
            case 4:
                System.out.println("April is in the spring season.");
                break;
            case 5:
                System.out.println("May is in the spring season.");
                break;
            case 6:
                System.out.println("June is in the summer season.");
                break;
            case 7:
                System.out.println("July is in the summer season.");
                break;
            case 8:
                System.out.println("August is in the summer season.");
                break;
            case 9:
                System.out.println("September is in the autumn season.");
                break;
            case 10:
                System.out.println("October is in the autumn season.");
                break;
            case 11:
                System.out.println("November is in the autumn season.");
                break;
            case 12:
                System.out.println("December is in the winter season.");
                break;
            default:
                System.out.printf("%d is an invalid month", month);
                break;
        }
    }
}
```

```java
// file Month.java
public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER,
}
// file Main.java
public class Main {
    public static void main(String[] args) {
        whichSeason(Month.JUNE);
    }

    public static void whichSeason(Month month) {
        switch (month) {
            // case DECEMBER:
            // case JANUARY:
            // case FEBRUARY:
            // System.out.printf("%s is in the spring season.", month);
            // break;
            // case MARCH:
            // case APRIL:
            // case MAY:
            //     System.out.printf("%s is in the summer season.", month);
            //     break;
            // case JUNE:
            // case JULY:
            // case AUGUST:
            //     System.out.printf("%s is in the summer season.", month);
            //     break;
            // case SEPTEMBER:
            // case OCTOBER:
            // case NOVEMBER:
            //     System.out.printf("%s is in the autumn season.", month);
            //     break;
            // default:
            //     System.out.printf("%d is an invalid month", month);
            //     break;
            case DECEMBER, JANUARY, FEBRUARY:
            System.out.printf("%s is in the spring season.", month);
            break;
            case MARCH, APRIL, MAY:
                System.out.printf("%s is in the summer season.", month);
                break;
            case JUNE, JULY, AUGUST:
                System.out.printf("%s is in the summer season.", month);
                break;
            case SEPTEMBER, OCTOBER, NOVEMBER:
                System.out.printf("%s is in the autumn season.", month);
                break;
            default:
                System.out.printf("%d is an invalid month", month);
                break;
        }
    }
}
```

### OOP: Inheritance and Polymorphism

#### Constructors and Inheritance

```java
// file Account.java
package account;

public class Account {
    private double balance;
    private double interestRate;

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }

        balance = amount;
        return true;
    }

    public void deposit(double amount) {
        balance = amount;
    }

    public void status() {
        System.out.printf("Balance: %.2f\n", balance);
    }
}

// file CheckingAccount.java
package account;

public class CheckingAccount extends Account {
    public CheckingAccount() {
        // System.out.println("Whatever"); // You cannot place any code before the supper() function.
        super(50, 0.072);
        System.out.println("Whatever");
    }
}

// file Main.java
import account.Account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(100, 0.025);
    }
}
```

```java
// file Account.java
package account;

public class Account {
    private double balance;
    private double interestRate;

    public Account() {
        System.out.println("Account constructor");
    }

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }

        balance = amount;
        return true;
    }

    public void deposit(double amount) {
        balance = amount;
    }

    public void status() {
        System.out.printf("Balance: %.2f\n", balance);
    }
}

// file CheckingAccount.java
package account;

public class CheckingAccount extends Account {
    public CheckingAccount() {
        super(); //This method can have super() or not
        System.out.println("Checking account constructor");
    }
}

// file Main.java
import account.Account;
import account.CheckingAccount;

public class Main {
    public static void main(String[] args) {
        new CheckingAccount();
    }
}
```

```java
// file Account.java
package account;

public class Account {

    private double balance;
    private double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }

        balance = amount;
        return true;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void status() {
        System.out.printf("Balance: %.2f\n", balance);
    }

}

// file CheckingAccount.java
package account;

public class CheckingAccount extends Account {

    public CheckingAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

}

// file SavingsAccount.java
package account;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

}

// file Main.java
import account.Account;
import account.CheckingAccount;

public class Main {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(100, 0.042);
        account.status();
        account.deposit(20);
        account.status();
    }
}
```

#### Method Overriding

```java
// file Account.java
package account;

public class Account {

    protected double balance;
    private double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void status() {
        System.out.printf("Balance: %.2f\n", balance);
    }

}

// file SavingsAccount.java
package account;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public boolean withdraw(double amount) {
        double fee = 0.025 * amount;
        amount += fee;
        // if (amount > balance) {
        //     return false;
        // }

        // balance -= amount;
        // return true;
        return super.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        // super.deposit(amount);
    }
}

// file CheckingAccount.java
package account;

public class CheckingAccount extends Account {

    public int rewardPoints;

    public int getRewardPoints() {
        return this.rewardPoints;
    }

    public CheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate);
        this.rewardPoints = rewardPoints;
    }

    public boolean purchase(double cost) {
        if (cost > balance) {
            return false;
        }
        balance -= cost;
        rewardPoints += calculateRewardPoints(cost);
        return true;
    }

    public int calculateRewardPoints(double cost) {
        return (int)(cost * 10);
    }

}

// file SilverCheckingAccount.java
package account;

public class SilverCheckingAccount extends CheckingAccount{

    public SilverCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        return (int)(cost * 25);
    }
}

// file GoldCheckingAccount.java
package account;

public class GoldCheckingAccount extends CheckingAccount{

    public GoldCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        return ((int) Math.min(cost, 4000) * 50);
    }
}
// file DiamondCheckingAccount.java
package account;

public class DiamondCheckingAccount extends CheckingAccount{

    public DiamondCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        int rewards = 0;

        if (cost > 50) {
            rewards += (cost - 500) * 80;
            cost = 500;
        }

        if (cost > 100) {
            rewards += (cost - 100) * 65;
            cost = 100;
        }

        rewards += cost * 40;
        return rewards;
    }
}

// file Main.java
import account.DiamondCheckingAccount;
import account.GoldCheckingAccount;
import account.SilverCheckingAccount;

public class Main {
    public static void main(String[] args) {
        SilverCheckingAccount sikver = new SilverCheckingAccount(5000, 0.025, 1000);
        GoldCheckingAccount gold = new GoldCheckingAccount(5000, 0.025, 1000);
        DiamondCheckingAccount diamond = new DiamondCheckingAccount(5000, 0.025, 1000);

        System.out.println(sikver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());

        sikver.purchase(500);
        gold.purchase(500);
        diamond.purchase(500);

        System.out.println(sikver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());
    }
}
```

#### Polymorphism

```java
// file Account.java
package account;

public class Account {

    protected double balance;
    protected double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void status() {
        System.out.printf("Balance: %.2f\n", balance);
    }

}

// file SavingAccount.java
package account;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public boolean withdraw(double amount) {
        double fee = 0.025 * amount;
        amount += fee;
        // if (amount > balance) {
        //     return false;
        // }

        // balance -= amount;
        // return true;
        return super.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        // super.deposit(amount);
    }

    @Override
    public void status() {
        System.out.printf("Saving Account [Balance: %.2f | Interest rate: %.2f]\n", balance, interestRate);
    }
}

// file CheckingAccount.java
package account;

public class CheckingAccount extends Account {

    public int rewardPoints;

    public int getRewardPoints() {
        return this.rewardPoints;
    }

    public CheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate);
        this.rewardPoints = rewardPoints;
    }

    public boolean purchase(double cost) {
        if (cost > balance) {
            return false;
        }
        balance -= cost;
        rewardPoints += calculateRewardPoints(cost);
        return true;
    }

    public int calculateRewardPoints(double cost) {
        return (int)(cost * 10);
    }

    @Override
    public void status() {
        System.out.println("Checking Account.");
        System.out.printf("\tBalance: %.2f\n", balance);
        System.out.printf("\tReward Points: %d\n", rewardPoints);
        System.out.println();
    }
}

// file SilverCheckingAccount.java
package account;

public class SilverCheckingAccount extends CheckingAccount{

    public SilverCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        return (int)(cost * 25);
    }
}

// file GoldCheckingAccount.java
package account;

public class GoldCheckingAccount extends CheckingAccount{

    public GoldCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        return ((int) Math.min(cost, 4000) * 50);
    }
}
// file DiamondCheckingAccount.java
package account;

public class DiamondCheckingAccount extends CheckingAccount{

    public DiamondCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        int rewards = 0;

        if (cost > 50) {
            rewards += (cost - 500) * 80;
            cost = 500;
        }

        if (cost > 100) {
            rewards += (cost - 100) * 65;
            cost = 100;
        }

        rewards += cost * 40;
        return rewards;
    }
}

// file Main.java
import java.util.ArrayList;

import account.Account;
import account.CheckingAccount;
import account.DiamondCheckingAccount;
import account.GoldCheckingAccount;
import account.SavingsAccount;
import account.SilverCheckingAccount;

public class Main {
    public static void main(String[] args) {
        Account account1 = new SavingsAccount(500, 0.025);
        CheckingAccount account2 = new GoldCheckingAccount(1000, 0.032, 2500);
        Account account3 = new SilverCheckingAccount(280, 0.029, 1770);

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new SilverCheckingAccount(450, 0.015, 957));
        accounts.add(new DiamondCheckingAccount(3200, 0.053, 19504));
        accounts.add(new SavingsAccount(7241, 0.044));
        accounts.add(new GoldCheckingAccount(5527, 0.038, 4823));
        accounts.add(new CheckingAccount(838, 0.026, 7339));
        accounts.add(new SavingsAccount(992, 0.040));
        accounts.add(new Account(340, 0.019));

        for (Account account : accounts) {
            account.status();
            System.out.println();
        }
    }
}
```

#### Abstract Classes

note: An abstract class is a class you cannot instantiat. Its main purpose is to be extensible.
Abstract methods do not have a body.

#### Interfaces

interfaces only contain abstract methods.
methods in interface are abstract by default so we don't need to set abstraction.

false

```java
// file Baz.java
public interface Baz {
    void m1();
    boolean m2();
    String m3(int pos, String tag);
}

// file Foo.java
public class Foo{
    public void m1() {

    }

    public boolean m2() {
        return true;
    }

    public String m3(int pos, String tag) {
        return null;
    }
}

// file Main.java
public class Main {
    public static void main(String[] args) {
        Baz foo = new Foo();
        foo.m1();
    }
}
```

true

```java
// file Baz.java
public interface Baz {
    void m1();
    boolean m2();
    String m3(int pos, String tag);
}

// file Foo.java
public class Foo implements Baz{
    @Override
    public void m1() {

    }

    @Override
    public boolean m2() {
        return true;
    }

    @Override
    public String m3(int pos, String tag) {
        return null;
    }
}


// file Main.java
public class Main {
    public static void main(String[] args) {
        Baz foo = new Foo();
        foo.m1();
    }
}
```

like this:

```java
// file Baz.java
public abstract class Baz {
    abstract void m1();
    abstract boolean m2();
    abstract String m3(int pos, String tag);
}


// file Foo.java
public class Foo extends Baz{
    public void m1() {

    }

    public boolean m2() {
        return true;
    }

    public String m3(int pos, String tag) {
        return null;
    }
}


// file Main.java
public class Main {
    public static void main(String[] args) {
        Baz foo = new Foo();
        foo.m1();
    }
}
```

```java
// File Bar.java
public class Bar {

}

// File Baz.java
public interface Baz {
    void m1();
    boolean m2();
    String m3(int pos, String tag);
}

// File Buzz.java
public interface Buzz {

}

// File Fizz.java
public class Fizz {

}

// File Foo.java
public class Foo extends Bar implements Baz, Buzz, Fuzz{
    @Override
    public void m1() {

    }

    @Override
    public boolean m2() {
        return true;
    }

    @Override
    public String m3(int pos, String tag) {
        return null;
    }
}

// File Fuzz.java
public interface Fuzz {

}

// File Main.java
public class Main {
    public static void main(String[] args) {
        Baz foo = new Foo();
        foo.m1();
    }
}
```

#### Example: Shape Interface

`````java
//  file Main.java
public class Main {
    public static void main(String[] args) {
        displayShape(new Square());
    }

    static void displayShape(Shape shape) {
        System.out.println(shape.getName());
        shape.draw();
        System.out.println("Sides: " + shape.getSideCount());
    }
}
// file Circle.java
public class Circle implements Shape{

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public int getSideCount() {
        return 1;
    }

    @Override
    public void draw() {

        System.out.println("      .  ```` .       ");
        System.out.println("    /           \\    ");
        System.out.println("   |             |    ");
        System.out.println("   |             |    ");
        System.out.println("    \\           /    ");
        System.out.println("     `- _____ -`       ");
    }
}

// file Shape.java
public interface Shape {
    String getName();
    int getSideCount();
    void draw();
}

// file Square.java
public class Square implements Shape{

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public int getSideCount() {
        return 4;
    }

    @Override
    public void draw() {
        System.err.println(" _______________");
        System.err.println("|              |");
        System.err.println("|              |");
        System.err.println("|              |");
        System.err.println("|              |");
        System.err.println("|              |");
        System.err.println(" --------------");
    }

}

// Triangle.java
public class Triangle implements Shape{


    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public int getSideCount() {
        return 3;
    }

    @Override
    public void draw() {
        System.out.println("        ^");
        System.out.println("       / \\");
        System.out.println("      /   \\");
        System.out.println("     /     \\");
        System.out.println("    /       \\");
        System.out.println("   /         \\");
        System.out.println("  /           \\");
        System.out.println(" /             \\");
        System.out.println("/_______________\\");
    }
}
`````

`````java
//  file Main.java
public class Main {
    public static void main(String[] args) {
        displayShape(new Square());
    }

    static void displayShape(Shape shape) {
        System.out.println(shape.getName());
        shape.draw();
        System.out.println("Sides: " + shape.getSideCount());
        if (shape instanceof Square) {
            Square square = (Square) shape;
            System.out.println(square.getShapeType());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        displayShape(new Square());
    }

    static void displayShape(Shape shape) {
        System.out.println(shape.getName());
        shape.draw();
        System.out.println("Sides: " + shape.getSideCount());
        Square square = (Square) shape;
        System.out.println(square.getShapeType());
    }
}
// file Circle.java
public class Circle implements Shape{

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public int getSideCount() {
        return 1;
    }

    @Override
    public void draw() {

        System.out.println("      .  ```` .       ");
        System.out.println("    /           \\    ");
        System.out.println("   |             |    ");
        System.out.println("   |             |    ");
        System.out.println("    \\           /    ");
        System.out.println("     `- _____ -`       ");
    }
}

// file Shape.java
public interface Shape {
    String getName();
    int getSideCount();
    void draw();
}

// file Square.java
public class Square implements Shape{

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public int getSideCount() {
        return 4;
    }

    @Override
    public void draw() {
        System.err.println(" _______________");
        System.err.println("|              |");
        System.err.println("|              |");
        System.err.println("|              |");
        System.err.println("|              |");
        System.err.println("|              |");
        System.err.println(" --------------");
    }

    public String getShapeType() {
        return "2D";
    }

}


// Triangle.java
public class Triangle implements Shape{


    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public int getSideCount() {
        return 3;
    }

    @Override
    public void draw() {
        System.out.println("        ^");
        System.out.println("       / \\");
        System.out.println("      /   \\");
        System.out.println("     /     \\");
        System.out.println("    /       \\");
        System.out.println("   /         \\");
        System.out.println("  /           \\");
        System.out.println(" /             \\");
        System.out.println("/_______________\\");
    }
}
`````
