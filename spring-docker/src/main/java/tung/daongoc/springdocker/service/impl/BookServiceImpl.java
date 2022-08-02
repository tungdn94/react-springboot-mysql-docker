package tung.daongoc.springdocker.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tung.daongoc.springdocker.dto.mapper.BookMapper;
import tung.daongoc.springdocker.dto.response.ListBookResponse;
import tung.daongoc.springdocker.repository.BookRepository;
import tung.daongoc.springdocker.service.BookService;

import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {
	private BookRepository bookRepository;
	private BookMapper bookMapper;
	
	@Override
	public ListBookResponse getAllBook() {
		var listBook = bookRepository.findAll()
				.stream().map(book -> bookMapper.mappingBookResponse(book))
				.collect(Collectors.toList());
		return ListBookResponse.builder().bookResponses(listBook).build();
	}
}
