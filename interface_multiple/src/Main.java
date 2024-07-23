public class Main {
    public static void main(String[] args) {
        SmartCamera c1 = new SmartCamera();
        c1.takephoto();
        c1.changeAperture();
        System.out.println(Camera.currentLocalDataTime()); // using static method
        c1.takingWithHDR();


    }
}