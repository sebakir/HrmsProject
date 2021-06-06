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

import com.example.business.abstracts.ForeignLanguageForCvService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.ForeignLanguageForCv;

@RestController
@RequestMapping("/api/foreignlanguageforcv")
@CrossOrigin
public class ForeignLanguageForCvsController {

	private ForeignLanguageForCvService foreignLanguageForCvService;

	@Autowired
	public ForeignLanguageForCvsController(ForeignLanguageForCvService foreignLanguageForCvService) {
		super();
		this.foreignLanguageForCvService = foreignLanguageForCvService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody ForeignLanguageForCv foreignLanguageForCv) {
		return this.foreignLanguageForCvService.add(foreignLanguageForCv);
	}

	@PostMapping("/update")
	public Result update(@RequestBody ForeignLanguageForCv foreignLanguageForCv) {
		return this.foreignLanguageForCvService.update(foreignLanguageForCv);
	}

	@PostMapping("/delete")
	public Result delete(@PathVariable("id") int id) {
		return this.delete(id);
	}

	@GetMapping("/getbyid")
	public DataResult<ForeignLanguageForCv> getById(@PathVariable("id") int id) {
		return this.foreignLanguageForCvService.getById(id);
	}

	@GetMapping("/getall")
	public DataResult<List<ForeignLanguageForCv>> getAll() {
		return this.foreignLanguageForCvService.getAll();
	}

	@GetMapping("/")
	public DataResult<List<ForeignLanguageForCv>> getAllByJobseekerId(@PathVariable("id") int id) {
		return this.foreignLanguageForCvService.getAllByJobseekerId(id);
	}

}
