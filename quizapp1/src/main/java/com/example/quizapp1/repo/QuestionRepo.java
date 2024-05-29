package com.example.quizapp1.repo;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quizapp1.model.Question;

@Repository
//public interface QuestionRepo extends JpaRepository<Question, Integer>{
public class QuestionRepo {
	
	List<Question> questions=new ArrayList<>();
	

	public List<Question> getAllQuestions() {
		questions.add(new Question(1, "Q1",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(2, "Q2",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(3, "Q3",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(4, "Q4",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(5, "Q5",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(6, "Q6",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(7, "Q7",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(8, "Q8",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(9, "Q9",	"O1", "O2", "O3", "O4", "A","Easy","Python"));
		questions.add(new Question(10, "Q10",	"O1", "O2", "O3", "O4", "A","Easy","Python"));
		questions.add(new Question(11, "Q11",	"O1", "O2", "O3", "O4", "A","Easy","Python"));
		questions.add(new Question(12, "Q12",	"O1", "O2", "O3", "O4", "A","Easy","Python"));
		return questions;
	}


	public List<Question> getQuestionsByCategory(String category) {
		// TODO Auto-generated method stub
		questions.add(new Question(1, "Q1",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(2, "Q2",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(3, "Q3",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(4, "Q4",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(5, "Q5",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(6, "Q6",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(7, "Q7",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		questions.add(new Question(8, "Q8",	"O1", "O2", "O3", "O4", "A","Easy","Java"));
		System.out.println("In Questions by category "+category);
		return questions;
	}


	public String save(Question question) {
		// TODO Auto-generated method stub
		return "question Added";
	}


	public String delete(Question question) {
		// TODO Auto-generated method stub
		return "question deleted";
	}
	
}
