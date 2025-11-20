package pl.biblioteka.biblioteka.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.biblioteka.biblioteka.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
