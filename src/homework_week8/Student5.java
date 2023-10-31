package homework_week8;

/**
 * Java program to overload constructors
 */

public class Student5 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Student5(int i, String n) {
        id = i;
        name = n;
    }

    // creating three arg constructor
    Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + age);
    }

    public static void main(String[] args) {
        Student5 m1 = new Student5(111, "Karan");
        Student5 m2 = new Student5(222, "Aryan", 25);
        m1.display();
        m2.display();
    }
}



