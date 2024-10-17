package Pattern.StructuralDesignPattern.BridgePattern;

public class Hoodie implements ClothingItems{

    private final Size size;

    public Hoodie(Size size) {
        this.size = size;
    }

    @Override
    public void getType() {
        System.out.println("Hoodie");
    }

    @Override
    public Size getSize() {
        return size;
    }


}
