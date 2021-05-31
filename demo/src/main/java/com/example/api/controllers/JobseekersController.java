package com.example.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.business.abstracts.JobseekerService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.Jobseeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobseekersController {

	private JobseekerService jobseekerService;

	@Autowired
	public JobseekersController(JobseekerService jobseekerService) {
		super();
		this.jobseekerService = jobseekerService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Jobseeker jobseeker){
		return this.jobseekerService.add(jobseeker);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Jobseeker jobseeker){
		return this.jobseekerService.update(jobseeker);
	}
	
	@PostMapping("/delete")
	public Result delete(@PathVariable("id") int id){
		return this.jobseekerService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<Jobseeker> getById(@PathVariable("id") int id){
		return this.jobseekerService.getById(id);
	}

	@GetMapping("/getall")
	public DataResult<List<Jobseeker>> getAll() {
		return this.jobseekerService.getAll();
	}

}
