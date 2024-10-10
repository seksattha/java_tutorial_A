package Pattern.AdapterPattern;

public class WordDocumentAdapter implements DocumentUploader {
    private final WordDocumentUploader adaptedwordDocumentUploader;

    public WordDocumentAdapter() {
        adaptedwordDocumentUploader = new WordDocumentUploader();
    }


    @Override
    public void upload() {
        adaptedwordDocumentUploader.uploadWordDocument();

    }
}
