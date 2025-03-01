/*Create a Vehicle class with common properties (e.g., brand, year) and a method (displayDetails) to display 
the vehicle's details. Then, create two subclasses: Car and Bike. Each subclass should have additional 
properties and override the displayDetails method to include their specific details.*/

class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Car, Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    private boolean hasSideCar;

    public Bike(String brand, int year, boolean hasSideCar) {
        super(brand, year);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Bike, Has Sidecar: " + hasSideCar);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        // a Car object
        Car myCar = new Car("Toyota", 2020, 4);
        myCar.displayDetails();

        // a Bike object
        Bike myBike = new Bike("Harley-Davidson", 2019, false);
        myBike.displayDetails();
    }
}

// Output
// Brand: Toyota, Year: 2020
// Type: Car, Number of Doors: 4
// Brand: Harley-Davidson, Year: 2019
// Type: Bike, Has Sidecar: false
