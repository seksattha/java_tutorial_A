package Pattern.AdapterPattern;

public class App {
    public static void main(String[] args) {
        PdfDocumentUploader pdfDocumentUploader = new PdfDocumentUploader();
        OnlineApplication onlineApplication = new OnlineApplication(pdfDocumentUploader);
        onlineApplication.uploadDocument();
    }
}
