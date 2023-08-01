import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int Number = scanner.nextInt();
        int FirstNumber = 0, SecondNumber = 1, Cycle = 2;
        if (Number == 1) {
            System.out.println("0");
        } else {
            System.out.println("0 \n1");
        }
        while (Number > Cycle) {
            int Sum = FirstNumber + SecondNumber;
            FirstNumber = SecondNumber;
            SecondNumber = Sum;
            System.out.println(Sum);
            Cycle++;
        }
    }
}
