package Pattern.StructuralDesignPattern.BridgePattern;

public class ChildSize implements Size {
    @Override
    public void get() {
        System.out.println("size => Child");
    }
}
