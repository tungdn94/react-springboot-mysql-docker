package tung.daongoc.springdocker.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "Books")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_id_seq")
	@SequenceGenerator(name = "book_id_seq", sequenceName = "book_seq", allocationSize = 1, initialValue = 21)
	private Integer id;
	@Column(name = "Title", length = 50, nullable = false, insertable = false, updatable = false)
	private String title;
	@Column(name = "Author", length = 50, nullable = false, insertable = false, updatable = false)
	private String author;
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		BookEntity that = (BookEntity) o;
		return id != null && Objects.equals(id, that.id);
	}
	
	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
