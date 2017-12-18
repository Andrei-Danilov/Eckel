class Vehicle{
    public static void  kmToMiles(int km){
        System.out.println("Внутри родительского класса/статического метода");
    }
}

class Car extends Vehicle{
    public static void  kmToMiles(int km){
        System.out.println("Внутри дочернего класса/статического метода ");
    }
}

public class Demo{
    public static void main(String args[]){
        Vehicle vehicle = new Car();
        vehicle.kmToMiles(10);
        Car car = new Car();
        car.kmToMiles(10);
    }
}