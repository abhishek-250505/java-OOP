class Person {

    String name;

    void showName(){
        System.out.println("Name: " + name);
    }
}

class Student extends Person {

    int rollNo;

    void showRoll(){
        System.out.println("Roll No: " + rollNo);
    }
}

class CollegeStudents extends Student {

    String course;

    void showCourse(){
        System.out.println("Course: " + course);
    }
}

public class CollegeStudent {
    public static void main(String [] args){

        CollegeStudents obj = new CollegeStudents();

        obj.name = "Abhishek";
        obj.rollNo = 101;
        obj.course = "B.Tech";

        obj.showName();
        obj.showRoll();
        obj.showCourse();

    }

}







