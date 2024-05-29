package com.example.quizapp1.model;

import java.util.List;

//import jakarta.persistence.Entity;
//import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
//@Entity
public class Quiz {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
//	@ManyToMany
	private List<Question> questions;
	
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quiz(int id, String title, List<Question> questions) {
		super();
		this.id = id;
		this.title = title;
		this.questions = questions;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	

}
