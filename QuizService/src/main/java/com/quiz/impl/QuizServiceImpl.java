package com.quiz.impl;

import com.quiz.entities.Quiz;
import com.quiz.repo.QuizRepo;
import com.quiz.service.QuestionClient;
import com.quiz.service.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepo quizRepo;
    private QuestionClient questionClient;

    public QuizServiceImpl(QuizRepo quizRepo, QuestionClient questionClient) {
        this.quizRepo = quizRepo;
        this.questionClient = questionClient;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public List<Quiz> findAll() {
        List<Quiz> quizzes = quizRepo.findAll();
        List<Quiz> newQuizList = quizzes.stream().map(quiz->{
            quiz.setQuestions(questionClient.getQuestionOfQuiz((long) quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());

        return newQuizList;
    }

    @Override
    public Quiz findById(long id) {
        Quiz quiz = quizRepo.findById(id).orElseThrow(()-> new RuntimeException("Quiz Not Found!"));
        quiz.setQuestions(questionClient.getQuestionOfQuiz((long) quiz.getId()));
        return quiz;
    }
}
