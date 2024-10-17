package Pattern.SingletonPattern;

public class DocumentPrinter {

    public void printDocument() {
        PrintSpooler spooler =  PrintSpooler.getInstance();
        spooler.print();
    }
}
