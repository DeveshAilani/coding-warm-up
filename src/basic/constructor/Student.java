package basic.constructor;

public class Student {
    private int age;
    private String name;

    private Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private Student(Student anotherStudent) {
        age = anotherStudent.age;
        name = anotherStudent.name;
    }

    public static void main(String[] args) {
        Student s1 = new Student(25, "Devesh");
        Student s2 = new Student(s1);
        s1.reset();
        s1.display();
        s2.display();

        s2 = s1;
        s2.display();
    }

    private void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    private void reset() {
        age = -1;
        name = null;
    }
}
