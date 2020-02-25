package com.github.divya.QuizApp.service;

import com.github.divya.QuizApp.entities.QuizQuestion;

public interface QuestionService {
    public Iterable<QuizQuestion> findAll();
    public int findAnswerIdConnect(int questionId);

}
