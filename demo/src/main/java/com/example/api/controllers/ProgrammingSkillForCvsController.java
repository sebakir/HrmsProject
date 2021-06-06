package com.example.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.business.abstracts.ProgrammingSkillForCvService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.ProgrammingSkillForCv;

@RestController
@RequestMapping("/api/programmingskill")
public class ProgrammingSkillForCvsController {

	private ProgrammingSkillForCvService programmingSkillForCvService;

	@Autowired
	public ProgrammingSkillForCvsController(ProgrammingSkillForCvService programmingSkillForCvService) {
		super();
		this.programmingSkillForCvService = programmingSkillForCvService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody ProgrammingSkillForCv programmingSkillForCv) {
		return this.programmingSkillForCvService.add(programmingSkillForCv);
	}

	@PostMapping("/update")
	public Result update(@RequestBody ProgrammingSkillForCv programmingSkillForCv) {
		return this.programmingSkillForCvService.add(programmingSkillForCv);
	}

	@PostMapping("/delete")
	public Result delete(@PathVariable("id") int id) {
		return this.programmingSkillForCvService.delete(id);
	}

	@GetMapping("/getbyid")
	public DataResult<ProgrammingSkillForCv> getById(@PathVariable("id") int id) {
		return this.programmingSkillForCvService.getById(id);
	}

	@GetMapping("/getall")
	public DataResult<List<ProgrammingSkillForCv>> getAll() {
		return this.programmingSkillForCvService.getAll();
	}

	@GetMapping("/getallbyjobseekerid")
	public DataResult<List<ProgrammingSkillForCv>> getAllByJobseekerId(int id) {
		return this.programmingSkillForCvService.getAllByJobseekerId(id);
	}

}
