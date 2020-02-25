package com.github.divya.QuizApp.service;

import com.github.divya.QuizApp.entities.Question;

public interface QuestionService {
    public Iterable<Question> findAll();
    public int findAnswerIdConnect(int questionId);

}
