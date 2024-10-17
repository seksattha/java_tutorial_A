package Pattern.StructuralDesignPattern.AdapterPattern;

public class OnlineApplication {
    //field
    private final DocumentUploader documentUploader;

    // constructor
    public OnlineApplication(DocumentUploader documentUploader) {
        this.documentUploader = documentUploader;
    }

    //Method
    public void uploadDocument() {
        documentUploader.upload();
    }
}
