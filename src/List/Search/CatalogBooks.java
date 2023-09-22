package List.Search;

import java.util.ArrayList;
import java.util.List;

public class CatalogBooks {
    
    private List<Book> listBook;
    private String msg = "A lista está vazia!";

    public CatalogBooks() {
        this.listBook = new ArrayList<>();
    }  

    public void addBook(String title, String author, int year) {
        listBook.add(new Book(title, author, year));
    }

    public List<Book> getByAuthor(String author) {
        List<Book> AuthorBooks = new ArrayList<>();
        if (!listBook.isEmpty()) {
            for (Book l : listBook) {
                if (l.getAuthor().equalsIgnoreCase(author)) {
                    AuthorBooks.add(l);
                }
            }
            return AuthorBooks;
        } else {
            throw new RuntimeException(msg);
        }
    }

    public List<Book> getByYearInterval(int year1, int year2){
        List<Book> YearIntervalBooks = new ArrayList<>(); 
        if (!listBook.isEmpty()) {
            for (Book l : listBook) {
                if (l.getPublicationYear() >= year1 && l.getPublicationYear() <= year2) {
                    YearIntervalBooks.add(l);
                }
            }
            return YearIntervalBooks;
        } else {
            throw new RuntimeException(msg);
        }
    }

    public Book getByTitle(String title) {
        Book bk = null;
        if (!listBook.isEmpty()) {
            for (Book l : listBook) {
                if (l.getTitle().equalsIgnoreCase(title)) {
                    bk = l;
                    break;
                }
            }
            return bk;
        } else {
            throw new RuntimeException(msg);
        }
    }


    public static void main(String[] args) {

        CatalogBooks catalogBooks = new CatalogBooks();

        catalogBooks.addBook("Fundation", "Isaac Asimov", 1951);
        catalogBooks.addBook("I-Robot", "Isaac Asimov", 1950);
        catalogBooks.addBook("Three Muskiteers", "Alexandre Dumas", 1844);
        catalogBooks.addBook("Le Comte de Monte-Cristo", "Alexandre Dumas", 1844);
        catalogBooks.addBook("Frankenstein", "Mary Shelley", 1818);

        System.out.println(catalogBooks.getByAuthor("Isaac Asimov"));

        System.out.println(catalogBooks.getByAuthor("Autor Inexistente"));

        System.out.println(catalogBooks.getByYearInterval(1950, 2022));

        System.out.println(catalogBooks.getByYearInterval(2025, 2030));

        System.out.println(catalogBooks.getByTitle("I-Robot"));

        System.out.println(catalogBooks.getByTitle("Título Inexistente"));
        

    }



    
}
