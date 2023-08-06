import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int sum = 0, cycle = 0;
        int num = number;
        while (num > 0) {
            int Percent = num % 10;
            cycle++;
            num /= 10;
        }
        if (cycle == 3) {
            while (number > 0) {
                int Percent = number % 10;
                sum += Percent;
                number /= 10;
            }
            System.out.println("The sum is: " + sum);
        } else {
            System.out.println("You did enter a three-digit number");
        }
    }
}
