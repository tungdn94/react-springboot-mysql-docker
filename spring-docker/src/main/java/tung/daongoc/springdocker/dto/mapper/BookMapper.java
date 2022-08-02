package tung.daongoc.springdocker.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import tung.daongoc.springdocker.dto.response.BookResponse;
import tung.daongoc.springdocker.entity.BookEntity;

@Mapper(componentModel = "spring",
		nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface BookMapper {
	BookResponse mappingBookResponse(BookEntity bookEntity);
}
