interface One{
    public void run();
}

interface Two{
    public void run();
}

class Three implements One,Two{
    public void run(){
        System.out.println("Third class run method");
    }
}

public class MultipleInheritance {
    public static void main(String[] args){
        Three obj = new Three();
        obj.run();
    }
}
