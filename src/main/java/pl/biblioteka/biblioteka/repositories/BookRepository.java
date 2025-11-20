package pl.biblioteka.biblioteka.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.biblioteka.biblioteka.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
