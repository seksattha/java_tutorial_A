package Pattern.BridgePattern;

public class AdultSize implements Size {
    @Override
    public void get() {
        System.out.println("size => ADULT");
    }
}
