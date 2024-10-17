package Pattern.SingletonPattern;

public class DocumentPrinter {

    public void printDocument() {
        PrintSpooler spooler = new PrintSpooler();
        spooler.print();
    }
}
