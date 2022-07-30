package OOP.Inheritance;

public class Person {
    //create a Person class(it is super class)
    //person fields: name and age
    String name;
    int age;

    //accept the fields via constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //methods: goHome() , goOut() they are void and without any parameter
    //just printing a msg "Person go Home", "Person Go out"
    public void goHome() {
        System.out.println("Person go Home");
    }

    public void goOut() {
        System.out.println("Person Go out");
    }


    //another method called identity() which print person name and age
    public void identity() {
        System.out.println("Person Name: " + name + ", age: " + age);
    }


    //and override toString method , return Person name and age(String)


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


