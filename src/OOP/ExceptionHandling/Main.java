package OOP.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {





    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        //in Exception Handling activity we have to examples to handle the exception

        //1.create an int array of 5 element
        //try to access 6th element will give you IndexOutOfBoundException
        //handle that exception with try catch block
        int[] array = {0,1,2,3,4};
        try {
            System.out.println("6th Element of Array" +array[5]);

        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound , you have only "+array.length+" element");
        }



        //2.creat an scanner object
        //create an infinite while loop(while true)
        //ask user to Enter an integer
        //if the user inputs int break the loop
        //if the user entered other types print a msg "you should enter an integer"
        //and continue to next iteration
        //DO NOT use if else , use try catch
        while (true){
            System.out.println("please enter an integer");

            try {
                int a = console.nextInt();
            }catch (InputMismatchException e){
                System.out.println("you should enter an integer");
                String a = console.nextLine();
                continue;
            }

            break;
        }
    }
}
