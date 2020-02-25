package com.github.divya.QuizApp.repository;

import com.github.divya.QuizApp.entities.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("QuestionRepository")
public interface QuestionRepository extends CrudRepository<Question,Integer> {
}
