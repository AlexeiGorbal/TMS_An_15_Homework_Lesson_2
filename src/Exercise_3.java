import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int Number = scanner.nextInt();
        int Sum = 0, Cycle = 0;
        int Num = Number;
        while (Num > 0) {
            int Percent = Num % 10;
            Cycle++;
            Num /= 10;
        }
        if (Cycle == 3) {
            while (Number > 0) {
                int Percent = Number % 10;
                Sum += Percent;
                Number /= 10;
            }
            System.out.println("The sum is: " + Sum);
        } else {
            System.out.println("You did enter a three-digit number");
        }
    }
}
