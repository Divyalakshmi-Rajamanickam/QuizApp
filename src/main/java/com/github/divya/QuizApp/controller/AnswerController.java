package com.github.divya.QuizApp.controller;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "answer")
public class AnswerController implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private QuestionController question;
    private String content;
    private boolean correct;

    public AnswerController() {
    }

    public AnswerController(QuestionController question,String content, boolean correct){
        this.question = question;
        this.content = content;
        this.correct = correct ;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question id", nullable = false)

    public QuestionController getQuestion(){
        return this.question;
    }

    public void setQuestion(QuestionController question) {
        this.question = question;
    }

    @Column(name = "content", nullable = false, length = 65535)
    public String getContent(){
        return this.content;
    }

    public void setContent(String content){
        this.content = content;
    }

    @Column(name = "content", nullable = false)
    public boolean isCorrect(){
        return this.correct;
    }



}
