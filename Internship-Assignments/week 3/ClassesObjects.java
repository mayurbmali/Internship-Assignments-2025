//Program Statement: Create a Car class with attributes (brand, model) and a method to display car details.

class Car {
    String brand;
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

public class ClassesObjects {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla");
        myCar.displayDetails(); 
    }
}

// Output
// Brand: Toyota, Model: Corolla