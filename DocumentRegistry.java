public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textDocumentPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }

    public Document createPdf(String fileName, String author, int pageCount) {
        PdfDocument doc = (PdfDocument) pdfPrototype.clone();
        doc.fileName = fileName;
        doc.author = author;
        doc.pageCount = pageCount;
        return doc;
    }

    public Document createText(String filePath, String encoding, int wordCount) {
        TextDocument doc = (TextDocument) textDocumentPrototype.clone();
        doc.filePath = filePath;
        doc.encoding = encoding;
        doc.wordCount = wordCount;
        return doc;
    }

    public Document createSpreadsheet(String spreadsheetName, int rowCount, int columnCount) {
        SpreadsheetDocument doc = (SpreadsheetDocument) spreadsheetPrototype.clone();
        doc.spreadsheetName = spreadsheetName;
        doc.rowCount = rowCount;
        doc.columnCount = columnCount;
        return doc;
    }
}
