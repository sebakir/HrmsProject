package com.example.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.business.abstracts.ImageForCvService;
import com.example.business.abstracts.JobseekerService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.ImageForCv;
import com.example.entities.concretes.Jobseeker;

@RestController
@RequestMapping("/api/images")

public class ImagesController {

	private ImageForCvService imageForCvService;
	private JobseekerService jobseekerService;

	@Autowired
	public ImagesController(ImageForCvService imageForCvService, JobseekerService jobseekerService) {
		super();
		this.imageForCvService = imageForCvService;
		this.jobseekerService = jobseekerService;
	}

	@PostMapping("/add")
	public Result add(@RequestParam(value = "id") int id,
			@RequestParam(value = "imageFile") MultipartFile multipartFile) {
		Jobseeker jobseeker = this.jobseekerService.getById(id).getData();
		ImageForCv imageForCv = new ImageForCv();
		imageForCv.setJobseeker(jobseeker);
		return this.imageForCvService.add(imageForCv, multipartFile);
	}

	@PostMapping("/update")
	public Result update(@RequestBody ImageForCv imageForCv) {
		return this.imageForCvService.update(imageForCv);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.imageForCvService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<ImageForCv> getById(@RequestParam("id") int id){
		return this.imageForCvService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ImageForCv>> getAll(){
		return this.imageForCvService.getAll();
	}
	
	@GetMapping("/getbyjobseekerid")
	public DataResult<ImageForCv> getByJobseekerId(@RequestParam("id") int id){
		return this.imageForCvService.getByJobseekerId(id);
	}
	
	

}
