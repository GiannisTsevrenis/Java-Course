package Section8;
public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return ("Section8.Car -> Starting engine. type is " + getClass().getSimpleName());
    }

    public String accelerate() {
        return ("Section8.Car -> Accelerating. type is " + getClass().getSimpleName());
    }

    public String brake() {
        return ("Section8.Car -> Braking. type is " + getClass().getSimpleName());
    }
}

