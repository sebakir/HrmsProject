package com.example.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.business.abstracts.JobAdvertService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.JobAdvert;

@RestController
@RequestMapping("/api/jobadvert")
public class JobAdvertController {
	private JobAdvertService jobAdvertService;

	@Autowired
	public JobAdvertController(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}

	
	@PostMapping("/add")
	
	public Result add(@RequestBody JobAdvert jobAdvert){
		return this.jobAdvertService.add(jobAdvert);
	}
		
	@PostMapping("/update")
	public Result update(@RequestBody JobAdvert jobAdvert){
		return this.jobAdvertService.update(jobAdvert);
	}
	
	@PostMapping("/delete")
	public Result delete(@PathVariable("id") int id){
		return this.jobAdvertService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<JobAdvert> getById(@PathVariable("id") int id){
		return this.jobAdvertService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvert>> getAll(){		
		return this.jobAdvertService.getAll();
	}
	
	@PostMapping("/changeOpenToClose")
	public Result changeOpenToClose(int id){
		return this.jobAdvertService.changeOpenToClose(id);
	}
	
	@GetMapping("/getAllOpenJobAdvertList")
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertList(){
		return this.jobAdvertService.getAllOpenJobAdvertList();
	}
	
	@GetMapping("/findAllByOrderByPublishedAt")
	public DataResult<List<JobAdvert>> findAllByOrderByPublishedAtDesc(){
		return this.jobAdvertService.findAllByOrderByPublishedAt();
	}
	
	@GetMapping("/getAllOpenJobAdvertByEmployer")
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id){
		return this.jobAdvertService.getAllOpenJobAdvertByEmployer(id);
	}
}
