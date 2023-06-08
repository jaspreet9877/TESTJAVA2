interface InterfaceOne {
    void UpdateGear(int gear);
}

interface InterfaceTwo {
    void Accelerate(int speed);
}

interface InterfaceThree {
    void PushBrake(int brake);
}

class Car implements InterfaceOne, InterfaceTwo, InterfaceThree {
    private int gear;
    private int speed;
    private int brake;

    public Car(int gear, int speed, int brake) {
        this.gear = gear;
        this.speed = speed;
        this.brake = brake;
    }

    public void UpdateGear(int gear) {
        this.gear = gear;
    }

    public void Accelerate(int speed) {
        this.speed = speed;
    }

    public void PushBrake(int brake) {
        this.brake = brake;
    }

    public int CurrentSpeed() {
        return speed - brake;
    }

    public void DisplayState() {
        System.out.println("Car present state:");
        System.out.println("Brake: " + brake);
        System.out.println("Speed: " + CurrentSpeed());
        System.out.println("Gear: " + gear);
    }
}

class Truck implements InterfaceOne, InterfaceTwo, InterfaceThree {
    private int gear;
    private int speed;
    private int brake;

    public Truck(int gear, int speed, int brake) {
        this.gear = gear;
        this.speed = speed;
        this.brake = brake;
    }

    public void UpdateGear(int gear) {
        this.gear = gear;
    }

    public void Accelerate(int speed) {
        this.speed = speed;
    }

    public void PushBrake(int brake) {
        this.brake = brake;
    }

    public int currentSpeed() {
        return speed - brake;
    }

    public void displayState() {
        System.out.println("Truck present state:");
        System.out.println("Brake: " + brake);
        System.out.println("Speed: " + currentSpeed());
        System.out.println("Gear: " + gear);
    }
}

public class Jaspreet {
    public static void main(String[] args) {
        Car c1 = new Car(2, 1, 2);
        Truck t1 = new Truck(1, 1, 3);

        c1.DisplayState();
        t1.displayState();
    }
}
