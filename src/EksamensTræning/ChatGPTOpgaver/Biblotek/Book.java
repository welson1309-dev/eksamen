package EksamensTræning.ChatGPTOpgaver.Biblotek;

public class Book {
    private String title, author;
    int releaseYear;

    public Book(String title, String author, int releaseYear){
        this.title=title;
        this.author=author;
        this.releaseYear=releaseYear;
    }

    @Override
    public String toString() {
        return title + author + releaseYear;
    }
}
