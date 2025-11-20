package pl.biblioteka.biblioteka.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.biblioteka.biblioteka.domain.Author;
import pl.biblioteka.biblioteka.domain.Book;
import pl.biblioteka.biblioteka.repositories.AuthorRepository;
import pl.biblioteka.biblioteka.repositories.BookRepository;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Driven design");
        ddd.setIsbn("123123");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author artur = new Author();
        artur.setFirstName("Artur");
        artur.setLastName("Rz");

        Book xxx = new Book();
        xxx.setTitle("Work life balance");
        xxx.setIsbn("321321");

        artur.getBooks().add(xxx);
        xxx.getAuthors().add(artur);

        authorRepository.save(artur);
        bookRepository.save(xxx);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books in the database: " + bookRepository.count());
    }
}
