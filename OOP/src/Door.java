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
