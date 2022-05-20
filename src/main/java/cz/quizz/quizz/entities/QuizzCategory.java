package cz.quizz.quizz.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = "quizz_category")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuizzCategory {

	@OneToMany(mappedBy = "quizzCategory")
	List<Question> questions;
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "category_name")
	private String categoryName;


}
