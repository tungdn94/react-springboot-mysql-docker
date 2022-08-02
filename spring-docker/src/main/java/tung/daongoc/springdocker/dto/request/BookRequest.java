package tung.daongoc.springdocker.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BookRequest {
	private Integer id;
}
