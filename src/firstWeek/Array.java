package firstWeek;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //Create an empty int Array with size of 5
        //assign the values using a for loop and scanner
        //then print all the values using another forLoop

//        int[] intArray = new int[5];
//        for (int i = 0; i <intArray.length ; i++) {
//            System.out.println("Enter an integer for index: "+i);
//            intArray[i]=console.nextInt();
//        }
//        printArray1D(intArray);

//        int[] beforeSumArray = {1,2,3,4};
//        int sumArray = sumArray(beforeSumArray);
//        System.out.println(sumArray);

//        int[] beforeSquaredArray = {1,2,3,4};
//        int[] afterSquaredArray = squaredArray(beforeSquaredArray);
//        System.out.println("Array after squared: "+Arrays.toString(afterSquaredArray));

//        int[] arrayToFindElement = {1,2,3,4};
//        System.out.println("the element index is: "+searchForItemInArray(arrayToFindElement,2));

        int[] minimumElementArray = {20,4,-1,5,0};
        System.out.println(minimumElementInArray(minimumElementArray));


    }





    //create an int array of three element (1,2,3)
    //then create a method to sum all the elements in the array
    //the method should accepts an int Array as parameter and
    // return a number(int) that is sum of all element
    public static int sumArray(int[] array){
        int sum=0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
        }
        return sum;
    }



    //create a method named squaredArray that square every element in Array
    //the method should take an int Array as argument and
    // return the squared array
    public static int[] squaredArray(int[] array){
        for (int i = 0; i <array.length ; i++) {
            array[i] = (int)Math.pow(array[i], 2);
        }
        return array;
    }




    //create a method to search for an element in array
    //the methods should take two parameter , an int array to search in
    //and an number(int) to search for in the array
    //and if it find the item it should return the index of the item
    //if the item does not exist in the array it should return -1,
    //the method should return int
    //the method signature would be like this searchForItemInArray(int[] array, int num)

    public static int searchForItemInArray(int[] array, int num){
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Array index: "+i+", and element is: "+array[i]);
            System.out.println("num is: "+num);
            if (array[i]==num){
                System.out.println("founded");
                return i;

            }
        }
        return -1;

    }




    //create a method to find the minimum element in an int array
    //and return the element(int)
    //the method should take an int array as parameter
    //and it would return minimum element
    public static int minimumElementInArray(int[] list){
        int minimumElement = list[0];
        for (int i = 1; i < list.length ; i++) {
            if (list[i]<minimumElement)
                minimumElement = list[i];
        }
        return minimumElement;
    }





    public static void printArray1D(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Array index: "+i+", and element is: "+array[i]);
        }
    }


}
