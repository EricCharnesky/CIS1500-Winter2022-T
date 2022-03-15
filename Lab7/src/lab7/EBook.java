package lab7;

public class EBook extends Book {
    private String fontSize;
    private int currentPage;

    public EBook(String title, String authors, int numberOfPages, String publishedDate, String publisher,
                 String fontSize, int currentPage) {
        super(title, authors, numberOfPages, publishedDate, publisher);
        this.fontSize = fontSize;
        this.currentPage = currentPage;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "\n" + "Font size: " + fontSize +
                "\n" + "Current Page: " + currentPage;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
