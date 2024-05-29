package com.example.quizapp1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.quizapp1.model.Question;
import com.example.quizapp1.model.Quiz;
import com.example.quizapp1.model.QuizWrapper;
import com.example.quizapp1.model.Response;
import com.example.quizapp1.repo.QuizRepo;

@Service
public class QuizService {

	@Autowired
	QuizRepo quizRepo;

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
		// TODO Auto-generated method stub
		Quiz quiz = new Quiz();
		quiz.setId(1);
		quiz.setTitle("title");
		List<Question> questions = quizRepo.findRandomQuestionsByCategory(category, numQ, title);
		quiz.setQuestions(questions);
		quizRepo.save(quiz);
		return new ResponseEntity<String>("Success", HttpStatus.CREATED);
	}

	
	public ResponseEntity<List<QuizWrapper>> getQuizQuestions(Integer id) {
		Optional<Quiz> quiz= quizRepo.findById(id);
		List<Question> questions = quiz.get().getQuestions();
		QuizWrapper wrapper = new QuizWrapper();
		
		return new ResponseEntity<>(new ArrayList<QuizWrapper>(),HttpStatus.OK);
	}


	public ResponseEntity<Integer> calculateQuizScore(Integer id, List<Response> response) {
		Optional<Quiz> findById = quizRepo.findById(id);
		Quiz quiz = findById.get();
		List<Question> questions = quiz.getQuestions();
		int count=0;
		for(Response r:response) {			
			if(questions.get(id).getAnswer().equals(r.getResponse())) {
				count++;
			}
		}
		
		return new ResponseEntity<Integer>(count,HttpStatus.OK);
	}

}
