import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);
        
        // System.out.println("Number of laps: ");
        // int numberOfLaps = scanner.nextInt();

        // double[] laptimes = new double[numberOfLaps];

        // for(int i = 0; i < numberOfLaps; i++){
        //     System.out.print("Lap time: ");
        //     laptimes[i] = scanner.nextDouble();
        // }

        // double fastestTime = laptimes[0];
        // for(int i = 1; i < numberOfLaps; i++){
        //     if (laptimes[i] < fastestTime) {
        //         fastestTime = laptimes[i];
        //     }
        // }
        // System.out.println("Fastest time: " + fastestTime);
        double[] da = new double[] {25.9, 1.34, -76.24, 833.11, 76.084};
        
        for (double e : da) {
            System.out.println(e);
        }
    }
}