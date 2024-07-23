public class SmartCamera implements Camera, Gps {
    @Override
    public void takephoto() {
        System.out.printf("Taking a pho");
    }

    @Override
    public void changeAperture() {
        System.out.printf("Adjusting Aperture");

    }

    @Override
    public void changeShutterSpeed() {

    }

    @Override
    public void deletePhoto() {

    }

    @Override
    public boolean isEnagle() {
        return false;
    }

    @Override
    public float receiveLat() {
        return 0;
    }

    @Override
    public float receiveLong() {
        return 0;
    }

    @Override
    public void takingWithHDR() {
        Camera.super.takingWithHDR();
    }
}
