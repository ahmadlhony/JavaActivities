package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Balen",22);
        person.goHome();
        person.goOut();
        person.identity();
        System.out.println(person);

        Student student = new Student("bilal",19,3);
        student.goHome();
        student.goOut();
        student.identity();
        student.setMarks(0,10);
        student.setMarks(1,8);
        System.out.println(student);

        Teacher teacher = new Teacher("Master",30,2000,3);
        teacher.goHome();
        teacher.goOut();
        teacher.identity();
        System.out.println(teacher.calculateSalary());
        System.out.println(teacher);

    }
}
