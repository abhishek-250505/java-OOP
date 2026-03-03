public class Mobile {
    String brand;
    String model;
    int price;
    int batteryPercentage;

    // Method 1
    public void call() {
        System.out.println(model + " is calling...");
    }

    // Method 2
    public void charge() {
        batteryPercentage = 100;
        System.out.println(model + " is fully charged.");
    }

    // Method 3
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Battery: " + batteryPercentage + "%");
        System.out.println("------------------------");
    }

    public static void main(String[] args) {

        // Object 1
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.model = "Galaxy S23";
        m1.price = 75000;
        m1.batteryPercentage = 80;

        m1.displayDetails();
        m1.call();
        m1.charge();
        m1.displayDetails();

        // Object 2
        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.model = "iPhone 14";
        m2.price = 90000;
        m2.batteryPercentage = 60;

        m2.displayDetails();
        m2.call();
    }
}
