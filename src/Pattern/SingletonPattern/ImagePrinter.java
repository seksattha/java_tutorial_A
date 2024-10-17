package Pattern.SingletonPattern;

public class ImagePrinter {

    public void printImage() {
        PrintSpooler spooler = new PrintSpooler();
        spooler.print();
    }
}
