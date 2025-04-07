package Document;

class PDFdocument extends Document {

    public PDFdocument(String title, int sizeInKB) {
        super(title, sizeInKB);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF in Adobe Reader...");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF file.");
    }

    @Override
    public String getType() {
        return "PDF";
    }
}

