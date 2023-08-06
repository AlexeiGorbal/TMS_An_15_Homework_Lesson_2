import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int firstNumber = 0, secondNumber = 1, cycle = 2;
        if (number == 1) {
            System.out.println("0");
        } else {
            System.out.println("0 \n1");
        }
        while (number > cycle) {
            int sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            System.out.println(sum);
            cycle++;
        }
    }
}
