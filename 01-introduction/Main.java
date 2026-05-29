// Topic: Classes and Objects
public class Main {
    public static void main(String[] args) {

        // object is an instance of a class
        Student student1 = new Student();

        // declaration
        Student student2;

        // 'new' dynamically allocates memory and returns reference variable
        student2 = new Student();

        Student student3 = new Student();

        student1.name = "Nanthana";
        student2.marks = 80;

        System.out.println(student1.name);
        System.out.println(student2.marks);
        System.out.println(student3.name);
    }
}

// user-defined data type
class Student {

    // instance variables
    int registerNo;
    String name;
    float marks = 90;

    // constructor gets called when object is created
    Student() {
        this.name = "Bob";
    }
}