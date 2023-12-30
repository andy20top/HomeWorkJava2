
public class Main {
    public static void main(String[] args) {


        Vehicle car = new Car("Renault", "Sandero", 2020, 60);
        car.displayInfo();
//        car.power();
//        car.accelerate(40);
//        car.displayInfo();
//        car.brake();
//        car.displayInfo();
//        car.refuel(40);
//        car.refuel(60);
//        car.accelerate(60);
//        car.displayInfo();
//        car.brake();
//        car.power();

        Vehicle aircraft = new Aircraft("boing", "747", 2023, 5000);
        aircraft.displayInfo();
//        aircraft.power();
//        ((Aircraft) aircraft).takeOff();
//        aircraft.displayInfo();
//        ((Aircraft) aircraft).land();
//        aircraft.power();

        Vehicle boat = new Boat("Titanic", "Biggest", 2000, 60);
        boat.displayInfo();
        boat.accelerate(30);
        boat.power();
        ((Boat) boat).startSwimming();
        ((Boat) boat).stopSwimming();
        boat.power();


    }
}