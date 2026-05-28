package com.question.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.entities.Question;
import com.question.repo.QuestionRepo;
import com.question.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{

	private QuestionRepo questionRepo;
	
	public QuestionServiceImpl(QuestionRepo questionRepo) {
		super();
		this.questionRepo = questionRepo;
	}

	@Override
	public Question create(Question question) {
		return questionRepo.save(question);
	}

	@Override
	public List<Question> get() {
		return questionRepo.findAll();
	}

	@Override
	public Question getOne(long id) {
		return questionRepo.findById(id).orElseThrow(()-> new RuntimeException("Question Not Found!!"));
	}

	@Override
	public List<Question> getQuestionOfQuiz(Long quizId) {
		return questionRepo.findByQuizId(quizId);
	}

}
