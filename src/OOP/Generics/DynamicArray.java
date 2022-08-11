package OOP.Generics;

public class DynamicArray<T> {
    //in this activity we have dynamic implementation of array
    //Array is fixed size , we can not add items if it is full
    //here we use dynamic Array to fix that issue by
    //if the array was full while inserting
    //create a new array with twice size(X2) of current array
    //and copy existing items to new array then insert new element
    //for this activity:
    //create a generic class name : DynamicArray<T>
    //fields are: T[] array,  an array of type T
    //int count = 0 an variable which is a pointer to last index in the array
    //both variables should be private
    T[] array;
    int count = 0;



    //Important: while making object of this class we should Use wrapper class instead of primitive type
    // int = Integer
    // double = Double
    //...

    //in constructor we have one parameter which is the initial size of array (int size)
    //then we initialize our array , this.array = (T[]) new Object[size];
    //we can not directly instantiate Generic class array , one way is to instantiate it by Object[] class
    //and cast it to our generic class
    public DynamicArray(int size){
        this.array = (T[]) new Object[size];
    }

    //methods are:

    //resizeIfRequired(): void method that will resize our array if required
    //the implementation of this method is like this we will have only one condition
    //if(this.array.length == count) then create a new array of size count * 2 and type T
    //(T[] newArray = (T[]) new Object[count*2];)
    //copy all of the items in current array to new Array using for loop
    //and set our array to new array, array=newArray;

    public void resizeIfRequired(){
        if(this.array.length == count){
            T[] newArray = (T[]) new Object[count * 2];
            for (int i = 0; i < this.array.length ; i++) {
                newArray[i] = array[i];
            }
            array=newArray;

        }
    }

    //insert(T item) which we will first call resizeIfRequired()
    //then add this item to our array array[count++] = item

    public void insert(T item){
        resizeIfRequired();
        array[count++] = item;
    }

    //T get(int index), which will return Item of that index, at first you should check
    //if the index is between 0 and array.length , else throw IndexOutOfBoundException()
    public T get(int index){
        if (index >= 0 && index<array.length){
            return array[index];
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    //void removeAt(int index): at first you should check if the index is between 0 and array.length
    //then just array[index] = null;(in data structure subject you will do shifting item instead of = 0 ,
    // but it is not required for now)
    public void removeAt(int index){
        if (index >= 0 && index<array.length){
            array[index] = null;
        }
    }
}
