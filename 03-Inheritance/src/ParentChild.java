class Parent{
    void animal(){
        System.out.println("Animal eat food");
    }


}
class Dog extends Parent{
    void bark(){
        System.out.println("Dog barks");
    }
}


public class ParentChild {
    public static void main(String[] args){
      Dog d1 = new Dog();
      d1.bark();
      d1.animal();
    }
}
