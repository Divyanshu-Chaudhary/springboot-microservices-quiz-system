package com.quiz.service;

import com.quiz.entities.Quiz;

import java.util.List;

public interface QuizService {
    Quiz add(Quiz quiz);
    List<Quiz> findAll();
    Quiz findById(long id);
}
