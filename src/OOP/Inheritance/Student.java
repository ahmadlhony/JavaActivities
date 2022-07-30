package OOP.Inheritance;

//create Student class that extends Person class
public class Student extends Person {
    int[] marks;
    int classCount;

    //Student fields: name , age(this two is inherited from parent class), int[classCount] marks , classCount(int)
    //accept the fields via constructor , pass the parent classes fields with super keyword
    public Student(String name, int age, int classCount){
        super(name,age);
        marks = new int[classCount];
    }

    //methods: override goHome() and goOut() methods
    //just print messages: "Students take their bag before going home"
    //"Students take their Homework and bag before going out"
    @Override
    public void goHome() {
        System.out.println("Students take their bag before going home");
    }

    @Override
    public void goOut() {
        super.goOut();
        System.out.println("Students take their Homework and bag before going out");
    }


    //a method to set marks, setMark(int classIndex, int mark)
    //body only has , this.marks[classIndex] = mark;
    public void setMarks(int classIndex, int mark){
        this.marks[classIndex] = mark;
    }


    //a methods called studentAverageMark() that return average of marks(int)
    public int studentAverageMark(){
        int a = 0;
        for (int mark : this.marks) {
            a += mark;
        }
        a = a/marks.length;
        return a;
    }

    //and override toString method , return Student name , age , averageMarks


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                 ", Average mark: "+this.studentAverageMark() +'}';
    }
}
