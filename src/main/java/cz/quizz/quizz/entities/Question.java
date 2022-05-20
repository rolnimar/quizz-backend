package cz.quizz.quizz.entities;

import cz.quizz.quizz.enums.QuestionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "question")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Question {
	@Id
	@GeneratedValue
	Long id;

	@ManyToOne
	@JoinColumn(name="quizz_category_id")
	QuizzCategory quizzCategory;

	@Enumerated(EnumType.STRING)
	@Column(name = "question_type")
	QuestionType questionType;
}
