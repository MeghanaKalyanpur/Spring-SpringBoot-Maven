package com.demo.springbootrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springbootrest.model.JobPost;
import com.demo.springbootrest.service.JobService;

//@Controller
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

	@Autowired
	private JobService jobService;
	
//	@GetMapping("jobPosts")
////	@ResponseBody
//	public List<JobPost> getAllJobs() {
//		return jobService.returnAllJobPosts();
//	}
	
	//produces = {"application/json"} represents that the method produces results only in json format
	@GetMapping(path="jobPosts", produces = {"application/json"})
//	@ResponseBody
	public List<JobPost> getAllJobs() {
		return jobService.returnAllJobPosts();
	}
	
//	//Getting data from server
//	@GetMapping("jobPost/{postID}")
//	public JobPost getJob(@PathVariable("postID") int postID) {
//		return jobService.getJob(postID);
//	}
	//spring default jackson lib converts object to json format. jackson-dataformat-xml lib converts object to xml format
	//Getting data from server
		@GetMapping(path="jobPost/{postID}",produces = {"application/json"})
		public JobPost getJob(@PathVariable("postID") int postID) {
			return jobService.getJob(postID);
		}
//		consumes = {"application/json"} represents that the method consumes objects only in json format
	// Sending data to server for a job to be added
	@PostMapping(path="jobPost",consumes= {"application/xml"})
	public JobPost addJob(@RequestBody JobPost jobPost) {
		jobService.addJob(jobPost);
		return jobPost;		
	}
	
	//updating the job data on a server- send data to server
	@PutMapping("jobPost")
	public JobPost updateJob(@RequestBody JobPost jobPost) {
		jobService.updateJob(jobPost);
		return jobPost;
	}
	
	//delete the job data on a server
	@DeleteMapping("jobPost/{post}")
	public String deleteJob(@PathVariable("postID") int post) {
		jobService.deleteJob(post);
		return "deleted";
	}
	
}
