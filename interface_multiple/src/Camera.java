import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;

public interface Camera {
    void takephoto();

    void changeAperture();

    void changeShutterSpeed();

    void deletePhoto();

    default void takingWithHDR() {
        System.out.println(" taking 3 photos with different aperture");
    }
    // Static method for utiity method
    static LocalDateTime currentLocalDataTime() {
        return LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
    }

}
