package tung.daongoc.springdocker.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tung.daongoc.springdocker.dto.response.ListBookResponse;
import tung.daongoc.springdocker.service.BookService;

@RequestMapping("api/book")
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class BookController {
	private BookService bookService;
	
	@GetMapping("/all")
	public ResponseEntity<ListBookResponse> listBookResponseEntity(){
		return ResponseEntity.status(HttpStatus.OK).body(bookService.getAllBook());
	}
	
}
