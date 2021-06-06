package com.example.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.business.abstracts.CoverLetterForCvService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.CoverLetterForCv;

@RestController
@RequestMapping("/api/coverletter")
public class CoverLettersController {

	private CoverLetterForCvService coverLetterForCvService;

	@Autowired
	public CoverLettersController(CoverLetterForCvService coverLetterForCvService) {
		super();
		this.coverLetterForCvService = coverLetterForCvService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody CoverLetterForCv coverLetterForCv) {
		return this.coverLetterForCvService.add(coverLetterForCv);
	}

	@PostMapping("/update")
	public Result update(@RequestBody CoverLetterForCv coverLetterForCv) {
		return this.coverLetterForCvService.update(coverLetterForCv);
	}

	@PostMapping("/delete")
	public Result delete(@PathVariable("id") int id) {
		return this.coverLetterForCvService.delete(id);
	}

	@GetMapping("/getbyid")
	public DataResult<CoverLetterForCv> getById(@PathVariable("id") int id) {
		return this.coverLetterForCvService.getById(id);
	}

	@GetMapping("/getall")
	public DataResult<List<CoverLetterForCv>> getAll() {
		return this.coverLetterForCvService.getAll();
	}

}
