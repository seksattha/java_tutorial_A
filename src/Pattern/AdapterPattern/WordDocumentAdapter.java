package Pattern.AdapterPattern;

public class WordDocumentAdapter
        extends WordDocumentUploader
        implements DocumentUploader {



    @Override
    public void upload() {
        uploadWordDocument(); // ตรงนี้มาสามารถเอามาใช้ได้เลยเพราะว่า ทำการ Extends มาแล้ว

    }

    @Override
    public void uploadWordDocument() {
        System.out.println("Preparing Word document ...");
        System.out.println("Uploading Word document");

    }
}
