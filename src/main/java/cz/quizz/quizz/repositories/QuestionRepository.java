package cz.quizz.quizz.repositories;

import cz.quizz.quizz.entities.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question,Long> {
}
