import java.util.*;

public class Task2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (1 <= N && N <= 100) {

            if (N % 2 == 0) {

                if (2 <= N && N <= 5) {

                    System.out.println("Not Weird");

                } else if (6 <= N && N <= 20) {

                    System.out.println("Weird");

                } else if (N > 20) {

                    System.out.println("Not Weird");

                }

            } else {

                System.out.println("Weird");

            }
        } else {

            System.out.println("The number you input must be between 1 and 100.");
        }


        scanner.close();
    }
}
