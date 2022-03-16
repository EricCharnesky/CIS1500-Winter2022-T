package lab7;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Java Programming", "Joel Murach", 777,
                "January 1st, 2017", "Murach");
        System.out.println(book.getInfo());
        EBook ebook = new EBook("Java Programming", "Joel Murach", 777,
                "January 1st, 2017", "Murach", "12", 425);
        System.out.println(ebook.getInfo());

        AudioBook audioBook = new AudioBook("Java Programming", "Joel Murach", 777,
                "January 1st, 2017", "Murach", "Joel", "22 hours",
                "2 minutes");
        System.out.println(audioBook.getInfo());

        Book[] shelf = new Book[3];
        shelf[0] = book;
        shelf[1] = ebook;
        shelf[2] = audioBook;

        for ( Book bookOnShelf : shelf){
            System.out.println(bookOnShelf.getInfo());
        }
    }
}
