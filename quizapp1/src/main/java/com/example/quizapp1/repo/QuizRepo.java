package com.example.quizapp1.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.example.quizapp1.model.Question;
import com.example.quizapp1.model.Quiz;

@Repository
//public interface QuestionRepo extends JpaRepository<Question, Integer>{
public class QuizRepo {

//	@Query(value = "Select * from question q where q.category=:category order by random() LIMIT :numQ",nativeQuery = true)
	public List<Question> findRandomQuestionsByCategory(String category, int numQ, String title) {
		// TODO Auto-generated method stub
		List<Question> questions= new ArrayList<>();
		questions.add(new Question(1, "Q1",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(2, "Q2",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(3, "Q3",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(4, "Q4",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(5, "Q5",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		return questions;
	}

	public void save(Quiz quiz) {
		// TODO Auto-generated method stub
		
	}

	public Optional<Quiz> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
