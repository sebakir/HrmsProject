package com.example.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.business.abstracts.SchoolForCvService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.SchoolForCv;

@RestController
@RequestMapping("/api/schoolforcv")
public class SchoolForCvsController {

	private SchoolForCvService schoolForCvService;

	@Autowired
	public SchoolForCvsController(SchoolForCvService schoolForCvService) {
		super();
		this.schoolForCvService = schoolForCvService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody SchoolForCv schoolForCv) {
		return this.schoolForCvService.add(schoolForCv);
	}

	@PostMapping("/update")
	public Result update(@RequestBody SchoolForCv schoolForCv) {
		return this.schoolForCvService.update(schoolForCv);
	}

	@PostMapping("/delete")
	public Result delete(@PathVariable("id") int id) {
		return this.schoolForCvService.delete(id);
	}

	@GetMapping("/getbyid")
	public DataResult<SchoolForCv> getById(@PathVariable("id") int id) {
		return this.schoolForCvService.getById(id);
	}

	@GetMapping("/getall")
	public DataResult<List<SchoolForCv>> getAll() {
		return this.schoolForCvService.getAll();
	}

	@GetMapping("/getallbyjobseekeridorderbyendatdesc")
	public DataResult<List<SchoolForCv>> getAllByJobseekerIdOrderByEndAtDesc(@PathVariable("id") int id) {
		return this.schoolForCvService.getAllByJobseekerIdOrderByEndAtDesc(id);
	}

	@GetMapping("/getallbyjobseekerid")
	public DataResult<List<SchoolForCv>> getAllByJobseekerId(@PathVariable("id") int id) {
		return this.schoolForCvService.getAllByJobseekerId(id);
	}

}
