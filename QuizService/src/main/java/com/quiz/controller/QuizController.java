package com.quiz.controller;

import com.quiz.entities.Quiz;
import com.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz) {
        return quizService.add(quiz);
    }

    @GetMapping
    public List<Quiz> get(){
        return quizService.findAll();
    }

    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable long id){
        return quizService.findById(id);
    }

}
