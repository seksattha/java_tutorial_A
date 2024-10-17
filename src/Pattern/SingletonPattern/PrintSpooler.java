package Pattern.SingletonPattern;

// singleton must be final class, not able to be extended.
public final class PrintSpooler {

    // create explicitly "Private" constructor
    // Now won't be able to have any new PrintSpooler
    // Anywhere except inside the PrintSpooler class itself.
    // ---------"just empty constructor here"
    private PrintSpooler() {

    }
    // creating field
    // static because want one instance be created

    private static PrintSpooler INSTANCE;

    public static PrintSpooler getInstance() {
        // checking this instance has been initiated.
        if (INSTANCE == null) {
            INSTANCE = new PrintSpooler();
        }
        return INSTANCE;
    }


    // a method called "print"
    public void print() {
        System.out.println("Printing ... ");
    }
}
