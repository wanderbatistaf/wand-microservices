package br.com.wand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wand.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
