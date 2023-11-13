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