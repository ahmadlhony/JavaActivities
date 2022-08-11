package OOP.Generics;

public class Main {
    public static void main(String[] args) {

        DynamicArray<Integer> dynamicArray = new DynamicArray<>(3);
        dynamicArray.insert(1);
        System.out.println(dynamicArray.get(0));
        dynamicArray.insert(2);
        System.out.println(dynamicArray.get(1));
        dynamicArray.insert(3);
        dynamicArray.removeAt(2);
        System.out.println(dynamicArray.get(2));
        dynamicArray.insert(4);
        System.out.println(dynamicArray.get(3));
        dynamicArray.removeAt(3);
        System.out.println(dynamicArray.get(3));


    }
}
