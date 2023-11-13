import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Wellcome to SuperFast Rollercoaster!");
//        System.out.println("Please enter your height in centimetres: ");
//        int height = scanner.nextInt();

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
//            System.out.println("Height
//            accepted. Go ahead.");
//        }

//        if (height < 130) {
//            System.out.println("Sorry, you are too short.");
//        }else if (height > 210) {
//            System.out.println("Sorry, you are too tall.");
//        }else {
//            System.out.println("Height accepted. Go ahead.");
//        }

//        System.out.println("TuanAnh".equals("tuananh"));


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
