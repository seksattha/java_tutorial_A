package Pattern.StructuralDesignPattern.AdapterPattern;

public class WordDocumentAdapter
        extends WordDocumentUploader
        implements DocumentUploader {
    // ทำการลบ พวก Contructor และ Field ออกไปให้หมด


    @Override
    public void upload() {
        uploadWordDocument(); // ตรงนี้มาสามารถเอามาใช้ได้เลยเพราะว่า ทำการ Extends มาแล้ว

    }
    // เราทำแบบนี้ก็ได้เหมือนกัน Override Method ของ Superclass
    @Override
    public void uploadWordDocument() {
        System.out.println("Preparing Word document ...");
        System.out.println("Uploading Word document");

    }
}
