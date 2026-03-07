class Students {

    String name;
    int age;

    // Parameterized constructor
    Students(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Students(Students s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }


}

public class CopyConstructor {
    public static void main(String[] args) {

        Students s1 = new Students("Abhishek", 20);

        // copying object
        Students s2 = new Students(s1);

        s1.display();
        s2.display();
    }
}
