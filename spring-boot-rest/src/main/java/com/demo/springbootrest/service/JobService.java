package com.demo.springbootrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springbootrest.model.JobPost;
import com.demo.springbootrest.repo.JobRepo;

@Service
public class JobService {
	@Autowired
	public JobRepo repo;
	
	
	
	//method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		return repo.returnAllJobPosts();

		
	}
	
	
	
	

	// ***************************************************************************


	
	
	
	// method to add a jobPost
	public void addJobPost(JobPost jobPost) {
		 repo.addJobPost(jobPost);
	
	}





	public JobPost getJob(int i) {
		// TODO Auto-generated method stub
		return repo.getJob(i);
	}





	public void addJob(JobPost jobPost) {
		// TODO Auto-generated method stub
		repo.addJob(jobPost);
	}





	public void updateJob(JobPost jobPost) {
		// TODO Auto-generated method stub
		repo.updateJob(jobPost);
	}





	public void deleteJob(int post) {
		// TODO Auto-generated method stub
		repo.deleteJob(post);
	}

	
}
