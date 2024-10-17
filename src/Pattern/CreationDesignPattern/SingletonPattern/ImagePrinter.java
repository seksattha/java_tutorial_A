package Pattern.CreationDesignPattern.SingletonPattern;

public class ImagePrinter {

    public void printImage() {
        PrintSpooler spooler = PrintSpooler.getInstance();

        spooler.print();
    }
}
