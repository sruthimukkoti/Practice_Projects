package java_projects;

	import java.util.Scanner;

public class program6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int n = sc.nextInt();
        sc.close();

        for (int j = 2; j <= n; j++) {
            boolean isPrime = true;

            if (j < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(j); i++) {
                    if (j % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(j + " is prime");
            }
        }
    }
}

