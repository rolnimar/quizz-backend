package cz.quizz.quizz.repositories;

import cz.quizz.quizz.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Long> {
}
