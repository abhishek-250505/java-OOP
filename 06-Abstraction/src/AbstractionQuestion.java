abstract class Shape {

    abstract void area();
}

class Circle extends Shape {

    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    void area(){
        double result = 3.14 * radius * radius;
        System.out.println("Circle Area: " + result);
    }
}

class Rectangle extends Shape {

    int length;
    int width;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    void area(){
        int result = length * width;
        System.out.println("Rectangle Area: " + result);
    }
}

public class AbstractionQuestion {

    public static void main(String[] args){

        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        c.area();
        r.area();
    }
}
