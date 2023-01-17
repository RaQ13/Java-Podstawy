package docs;

public class DocumentChecker {

    //tak samo polimorfizm działa w przypadku interfesów
    public static void main(String[] args) {
        Document excel = new ExcelDocument();
        Document pdfdocument = new PdfDocument();

        excel.getDescription();
        pdfdocument.getDescription();
    }
}
