import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select the figure whose area you want to calculate: \n1.Rectangle \n2.Triangle \n3.Circle \nEnter the number: ");
        int Number = scanner.nextInt();
        if (Number == 1) {
            System.out.print("Enter the first side a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter the second side b: ");
            double b = scanner.nextDouble();
            double s = a * b;
            System.out.println("Area is s=" + s);
        } else if (Number == 2) {
            System.out.print("Select triangle: \n1.Equilateral \n2.Isosceles \n3.Rectangular \nEnter the number: ");
            int Num = scanner.nextInt();
            if (Num == 1) {
                System.out.print("Enter the side a: ");
                double a = scanner.nextDouble();
                double s = (a * a * Math.sqrt(3)) / 4;
                System.out.println("Area is s=" + s);
            } else if (Num == 2) {
                System.out.print("Enter the sides that will be equal a=b: ");
                double a = scanner.nextDouble();
                System.out.print("Enter a third part c: ");
                double c = scanner.nextDouble();
                double s= (c/4)*Math.sqrt((4*(a*a))-(c*c));
                System.out.println("Area is s=" + s);
            } else {
                System.out.print("Enter the first side a: ");
                double a = scanner.nextDouble();
                System.out.print("Enter the second side b: ");
                double b = scanner.nextDouble();
                double s = (a * b) / 2;
                System.out.println("Area is s=" + s);
            }
        } else if (Number == 3) {
            System.out.print("Enter the radius of the circle R:");
            double R = scanner.nextDouble();
            double s = 3.14 * Math.pow(R, R);
            System.out.println("Area is s=" + s);
        } else {
            System.out.println("You entered the wrong number");
        }
    }
}
