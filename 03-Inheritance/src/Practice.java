class Students{
    int roll;
    String branch;

    void display(){
        System.out.println("Roll-" + roll);
        System.out.println("Branch :" +branch);
    }

}
class Childs extends Students{
    String name;

    void displayInfo(){
        System.out.println("Name of student :-" + name);
    }
}

public class Practice {


    public static void main(String[] args) {
         Childs s1 = new Childs();
        s1.name = "Abhishek";
        s1.roll = 14;
        s1.branch = "C.S";

        s1.displayInfo();
        s1.display();
    }
}
