package com.example.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.business.abstracts.ExperienceForCvService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.ExperienceForCv;

@RestController
@RequestMapping("/api/experienceforcv")
@CrossOrigin
public class ExperienceForCvsController {
	private ExperienceForCvService cvExperienceForCvService;

	@Autowired
	public ExperienceForCvsController(ExperienceForCvService cvExperienceForCvService) {
		super();
		this.cvExperienceForCvService = cvExperienceForCvService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody ExperienceForCv experienceForCv) {
		return this.cvExperienceForCvService.add(experienceForCv);
	}

	@PostMapping("/update")
	public Result update(@RequestBody ExperienceForCv experienceForCv) {
		return this.cvExperienceForCvService.update(experienceForCv);
	}

	@PostMapping("/delete")
	public Result delete(@PathVariable("id") int id) {
		return this.cvExperienceForCvService.delete(id);
	}

	@GetMapping("/getbyid")
	public DataResult<ExperienceForCv> getById(@PathVariable("id") int id) {
		return this.cvExperienceForCvService.getById(id);
	}

	@GetMapping("/getall")
	public DataResult<List<ExperienceForCv>> getAll() {
		return this.cvExperienceForCvService.getAll();
	}

	@GetMapping("/getallbyjobseekeridorderbyendatdesc")
	public DataResult<List<ExperienceForCv>> getAllByJobseekerIdOrderByEndAtDesc(@PathVariable("id") int id) {
		return this.cvExperienceForCvService.getAllByJobseekerIdOrderByEndAtDesc(id);
	}

	@GetMapping("/getallbyjobseekerid")
	public DataResult<List<ExperienceForCv>> getAllByJobseekerId(@PathVariable("id") int id) {
		return this.cvExperienceForCvService.getAllByJobseekerId(id);
	}

}
