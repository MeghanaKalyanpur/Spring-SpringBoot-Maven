package com.example.quizapp1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.quizapp1.model.Question;

import com.example.quizapp1.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {
	
	@Autowired
	private QuestionService service;
	
	@PostMapping("add")//create
	public String addQuestion(@RequestBody Question question) {
		return service.addQuestion(question);
	}
	
	@GetMapping("allQuestions")
	public ResponseEntity<List<Question>> getAllQuestions() {
		
		return service.getAllQuestions();
	}
	
	@GetMapping("category/{category}")//read
	public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
		return service.getQuestionsByCategory(category);
	}
			
	@PutMapping("update")//update
	public String updateQuestion(@RequestBody Question question) {
		return service.addQuestion(question);
	}
	
	@DeleteMapping("delete")//delete
	public String deleteQuestion(@RequestBody Question question) {
		return service.deleteQuestion(question);
	}
}
