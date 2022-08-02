package tung.daongoc.springdocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tung.daongoc.springdocker.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {
}
