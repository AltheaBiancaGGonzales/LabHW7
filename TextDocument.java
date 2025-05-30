public class TextDocument implements Document {
    String filePath;
    String encoding;
    int wordCount;

    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }

    public TextDocument(String filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }

    @Override
    public Document clone() {
        return new TextDocument(this.filePath, this.encoding, this.wordCount);
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
    }

    @Override
    public String getType() {
        return "Text, Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount;
    }
}
