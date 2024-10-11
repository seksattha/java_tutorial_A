package Pattern.BridgePattern;

public class Shirt implements ClothingItems {

    private final Size size;

    public Shirt(Size size) {
        this.size = size;
    }

    @Override
    public void getType() {
        System.out.println("Shirt");
    }

    @Override
    public Size getSize() {
        return size;
    }
}
