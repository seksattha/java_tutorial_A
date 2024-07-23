public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Wheel[] wheels = {new Wheel(18), new Wheel(18), new Wheel(18), new Wheel(18)};

        Car c1 = new Car(engine, wheels);

        c1.drive();

        System.out.println("Engine type: " + c1.getEngine().getType());
        System.out.println("Wheel size: " + c1.getWheels()[0].getSize());
    }
}