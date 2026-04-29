class A{
    public int x =10;
}

public class AccessPublic {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.x);
    }
}


//public = sab jagah access allowed
//Same class
//Same package
//Different package
//Accessible everywhere
// No restriction
// Used when data/method should be globally available