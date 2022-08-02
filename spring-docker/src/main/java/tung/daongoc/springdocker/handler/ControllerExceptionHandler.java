package tung.daongoc.springdocker.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tung.daongoc.springdocker.dto.response.ErrorResponse;

@RestControllerAdvice
public class ControllerExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> genericExceptionHandler(Exception exception){
		return ResponseEntity
				.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(ErrorResponse.builder()
						.errorCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
						.errorMessage("Internal Server Error")
						.build());
	}
}
