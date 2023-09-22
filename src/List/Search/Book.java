package List.Search;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Livro{" +
            "titulo='" + title + '\'' +
            ", autor='" + author + '\'' +
            ", anoPublicacao=" + publicationYear +
            '}';
  }

    
    
}
