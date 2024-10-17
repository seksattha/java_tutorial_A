package Pattern.StructuralDesignPattern.AdapterPattern;

public class App {
    public static void main(String[] args) {
        DocumentUploader pdfDocumentUploader = new PdfDocumentUploader();
        OnlineApplication onlineApplication = new OnlineApplication(pdfDocumentUploader);
        onlineApplication.uploadDocument();

        DocumentUploader wordDocumentUploader = new WordDocumentAdapter();
        OnlineApplication onlineApplication1 = new OnlineApplication(wordDocumentUploader);
        onlineApplication1.uploadDocument();


    }
}