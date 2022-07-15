import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
//        int x = sc.nextInt();
//        String xx = evenOrOdd(x);
//        System.out.println("the number is " + xx);
//
//
//        System.out.println("enter the number");
//        int Xx = sc.nextInt();
//        fibonacci(Xx);
//
//
//        System.out.println("enter the number");
//        int xX = sc.nextInt();
//        int Yy = factorial(xX);
//        System.out.print("the factorial of " + Xx + " is " + Yy);
//
//
//        System.out.println("enter first number");
//        double X = sc.nextDouble();
//        System.out.println("enter second number");
//        int Y = sc.nextInt();
//        System.out.println("enter third number if you only have two numbers enter 0");
//        int Z = sc.nextInt();
//        if (Z == 0)
//            sum(X, Y);
//        else
//            sum((int) X, Y, Z);

//        System.out.println(sum((int)1.2,3,4));

        System.out.println((double)1);


    }


    public static String evenOrOdd(int x) {
        String name;
        if (x % 2 == 0) {
            name = "even";
        } else {
            name = " odd ";
        }
        return name;

    }


    public static void fibonacci(int f) {
        int num1 = 0;
        int num2 = 1;
        for (int i = 1; i <= f; i++) {
            System.out.print(num1 + ",");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

    }


    public static int factorial(int x) {
        int factorial = 1;
        for (int counter = 1; counter <= x; counter++)
            factorial = factorial * counter;
        return factorial;
    }


    public static int sum(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        System.out.println("the sum of the numbers is " + sum);
        return sum;
    }

    public static int sum(int firstNum, int secondNum, int thirdNum) {
        int sum = firstNum + secondNum + thirdNum;
        System.out.println("the sum of the numbers is " + sum);
        return sum;
    }

    public static double sum(double firstNum, int secondNum) {
        double sum = firstNum + secondNum;
        System.out.println("the sum of the numbers is " + sum);
        return sum;
    }
}
