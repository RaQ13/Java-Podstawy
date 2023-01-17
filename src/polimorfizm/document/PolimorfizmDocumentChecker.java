package polimorfizm.document;

public class PolimorfizmDocumentChecker {

    public static void main(String[] args) {
//        ExcelDocument ducoment = new ExcelDocument(); //bezpośrenio z kontruktora excela
        PolimorfizmDocument excelDocument = new ExcelDocument(); //Document Excela jest jedna z postaci Dokumentu
        PolimorfizmDocument pdfDocument = new PdfDcoument();

        excelDocument.getDescription();
        pdfDocument.getDescription();
    }
}
