package lab7;

public class AudioBook extends Book  {
    private String narrator;
    private String totalDuration;
    private String currentPositionTime;

    public AudioBook(String title, String authors, int numberOfPages, String publishedDate, String publisher,
                     String narrator, String totalDuration, String currentPositionTime) {
        super(title, authors, numberOfPages, publishedDate, publisher);
        this.narrator = narrator;
        this.totalDuration = totalDuration;
        this.currentPositionTime = currentPositionTime;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "\n" + "Narrator: " + narrator +
                "\n" + "Total Duration: " + totalDuration +
                "\n" + "Current Position: " + currentPositionTime;
    }

    public String getNarrator() {
        return narrator;
    }

    public String getTotalDuration() {
        return totalDuration;
    }

    public String getCurrentPositionTime() {
        return currentPositionTime;
    }

    public void setCurrentPositionTime(String currentPositionTime) {
        this.currentPositionTime = currentPositionTime;
    }
}
