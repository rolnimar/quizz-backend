package cz.quizz.quizz.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "picture")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Picture {
	@Id
	@GeneratedValue
	private Long id;

}
