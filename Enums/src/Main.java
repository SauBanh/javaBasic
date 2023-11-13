public class Main {
    public static void main(String[] args) {
        whichSeason(Month.JUNE);
    }

    public static void whichSeason(Month month) {
        switch (month) {
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