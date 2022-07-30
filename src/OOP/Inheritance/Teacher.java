package OOP.Inheritance;

//create a Teacher class that extends Person class
public class Teacher extends Person {
    //Teachers fields: name , age(this two is inherited from parent class) , baseSalary , classCount
    int baseSalary;
    int classCount;

    //accept the fields via constructor , pass the parent classes fields with super keyword
    public Teacher(String name, int age, int baseSalary, int classCount) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.classCount = classCount;
    }
    //methods: override goHome() and goOut() methods
    //just print messages: "Teacher take students paper before going home"
    //"Teacher take their laptop before Going out"

    @Override
    public void goHome() {
        System.out.println("Teacher take students paper before going home");
        super.goHome();
    }

    @Override
    public void goOut() {
        System.out.println("Teacher take their laptop before Going out");
    }

    //another method like , calculateSalary() which return baseSalary + for each class 10%
    public int calculateSalary(){
        return (int) ( baseSalary + (baseSalary*0.1)*classCount);
    }
    //and override toString method , return Teacher name , age , classCount
    @Override
    public String toString() {
        return "name: "+name
                + ", age: "+age
                +", class count: "+classCount;
    }
}
