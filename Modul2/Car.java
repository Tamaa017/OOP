package Modul2;

public class Car {
    private int cadence;
    private int speed;
    private int gear;

    void changeCadence(int nextCadence) {
        cadence = nextCadence;
    }

    void speedUp(int increase) {
        speed = increase;
    }

    void changeGear(int nextGear) {
        gear = nextGear;
    }

    void printInfo() {
        System.out.println("Cadence: " + cadence);
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
    }
}
