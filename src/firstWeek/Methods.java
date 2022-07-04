package firstWeek;

public class Methods {
    public static void main(String[] args) {
//        printFibonacci(9);

//        int factorialOfFive = factorial(5);
//        System.out.println("Factorial of 5 is : "+ factorialOfFive);

//        System.out.println("Factorial of 5 is : "+ factorial(5));

//        String evenOrOdd = oddOrEven(3);
//        System.out.println(evenOrOdd);

        System.out.println("Sum of two integer: 1+2 = " + sum(1,2));
        System.out.println("Sum of double and integer: 1.2+2 = " + sum(1.2,2));
        System.out.println("Sum of three integer: 1+2+2 = " + sum(1,2,2));



    }

    //creat a method that return nothing(void) and prints fibonacci series by index
    //the method should only have index as parameter
    //then call the method in main method and pass 9 as argument
    //fibonacciSeries(9)
    //the output of above statement should be { 0, 1, 1, 2, 3, 5, 8, 13, 21 }

    public static void printFibonacci(int index) {
        int firstNum = 0;
        int secondNum = 1;
        int temp;
        System.out.print("{");
        for (int i = 0; i < index; i++) {
            System.out.print(firstNum);

            if (i < index - 1)
                System.out.print(", ");
            temp = firstNum;
            firstNum += secondNum;
            secondNum = temp;
        }
        System.out.println("}");
    }

    //create a method to return a factorial of a number (return type)
    //pass the number as parameter
    //assign the returned value to a variable in main method and print it
    //for example the result of factorial(5) is 120

    //factorial, in mathematics, the product of all positive integers less than or equal to a given positive integer
    //factorial of 5 is equal to 5*4*3*2*1
    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    //create a method that accepts a number it checks if the number is even or odd
    //it will return a string , if the number was even it Will return the number is Even
    //if the number was odd it will return the number is odd

    public static String oddOrEven(int number){
        if (number%2==0){
            return "the number is Even";
        }else {
            return "the number is Odd";
        }
    }

    //methods overloading

    //create three methods for summing numbers with those signature
    //sum(int firstNum, int secondNum)
    //sum(int firstNum, int secondNum, int thirdNum)
    //sum(double firstNum, int secondNum)
    //those methods should return the result of summing parameters
    //test them in main methods

    public static int sum(int firstNum, int secondNum){
        return firstNum + secondNum;
    }

    public static int sum(int firstNum, int secondNum, int thirdNum){
        return firstNum + secondNum + thirdNum;
    }

    public static double sum(double firstNum, int secondNum){
        return firstNum + secondNum;
    }


}
