package com.github.divya.QuizApp.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "question")
public class QuizQuestion implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer quizId;
        private Integer questionId;
        private Integer questionNumber;
        private boolean isCorrect;
        private String userAnswer;

    public QuizQuestion() {
    }

    public QuizQuestion(int quizId, int questionId, int questionNumber, boolean isCorrect, String userAnswer) {
        this.quizId = quizId;
        this.questionId = questionId;
        this.questionNumber = questionNumber;
        this.isCorrect = isCorrect;
        this.userAnswer = userAnswer;
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }
}

    /*private static final long serialVersionUID = 1L;
    private Integer id;
    private String content;
    private Set<Answer> answers = new HashSet<Answer>(0);

    public Question() {
    }

    public Question(String content){
        this.content = content;
    }

    public Question  (String content, Set<Answer> answers){
        this.content = content;
        this.answers = answers;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    @Column(name = "content", nullable = false, length = 65535)
    public String getContent(){
        return  this.content;
    }

    public void setContent(String content){
        this.content = content;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
    public Set<Answer> getAnswers(){
        return this.answers;
    }

}*/
