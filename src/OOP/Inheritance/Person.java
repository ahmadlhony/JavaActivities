package OOP.Inheritance;

public class Person {
    //create a Person class(it is super class)
    //person fields: name and age
    //accept the fields via constructor
    //methods: goHome() , goOut() they are void and without any parameter
    //just printing a msg "Person go Home", "Person Go out"
    //another method called identity() which print person name and age
    //and override toString method , return Person name and age(String)

    //create a Teacher class that extends Person class
    //Teachers fields: name , age(this two is inherited from parent class) , baseSalary , classCount
    //accept the fields via constructor , pass the parent classes fields with super keyword
    //methods: override goHome() and goOut() methods
    //just print messages: "Teacher take students paper before going home"
    //"Teacher take their laptop before Going out"
    //another method like , calculateSalary() which return baseSalary
    //and override toString method , return Teacher name , age , classCount

    //create Student class that extends Person class
    //Student fields: name , age(this two is inherited from parent class), int[classCount] marks , classCount(int)
    //accept the fields via constructor , pass the parent classes fields with super keyword
    //methods: override goHome() and goOut() methods
    //just print messages: "Students take their bag before going home"
    //"Students take their Homework and bag before going out"
    //a method to set marks, setMark(int classIndex, int mark)
    //body only has , this.marks[classIndex] = mark;
    //a methods called studentAverageMark() that return average of marks(int)
    //and override toString method , return Teacher name , age , averageMarks


}


