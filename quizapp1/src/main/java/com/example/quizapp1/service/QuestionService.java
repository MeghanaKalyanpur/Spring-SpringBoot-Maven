package com.example.quizapp1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.quizapp1.model.Question;
import com.example.quizapp1.repo.QuestionRepo;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepo repo;

	public ResponseEntity<List<Question>> getAllQuestions() {
		try {
			return new ResponseEntity<>(repo.getAllQuestions(),HttpStatus.OK);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(repo.getAllQuestions(),HttpStatus.BAD_REQUEST);
	}
	
	public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
		
		
		try {
			return new ResponseEntity<>(repo.getQuestionsByCategory(category),HttpStatus.OK);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(repo.getAllQuestions(),HttpStatus.BAD_REQUEST);
	}

	public String addQuestion(Question question) {
		// TODO Auto-generated method stub
		return repo.save(question);
	}

	public String deleteQuestion(Question question) {
		// TODO Auto-generated method stub
		return repo.delete(question);
	}
	
}
