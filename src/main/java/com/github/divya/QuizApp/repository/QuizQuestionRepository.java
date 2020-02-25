package com.github.divya.QuizApp.repository;

import com.github.divya.QuizApp.entities.QuizQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizQuestionRepository extends CrudRepository<QuizQuestion, Integer> {
}
