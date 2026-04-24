abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    String fuelType() {
        return "Petrol/Diesel";
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}

public class practical_18 {
    public static void main(String[] args) {

        Vehicle c = new Car();
        Vehicle b = new Bike();

        System.out.println(c.fuelType() + " " + c.noOfWheels());
        System.out.println(b.fuelType() + " " + b.noOfWheels());
    }
}
