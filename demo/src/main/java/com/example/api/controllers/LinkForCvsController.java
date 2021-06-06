package com.example.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.business.abstracts.LinkForCvService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.LinkForCv;

@RestController
@RequestMapping("/api/linkforcv")
@CrossOrigin
public class LinkForCvsController {

	private LinkForCvService linkForCvService;

	@Autowired
	public LinkForCvsController(LinkForCvService linkForCvService) {
		super();
		this.linkForCvService = linkForCvService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody LinkForCv linkForCv) {
		return this.linkForCvService.add(linkForCv);
	}

	@PostMapping("/update")
	public Result update(@RequestBody LinkForCv linkForCv) {
		return this.linkForCvService.update(linkForCv);
	}

	@PostMapping("/delete")
	public Result delete(@PathVariable("id") int id) {
		return this.linkForCvService.delete(id);
	}

	@GetMapping("/getbyid")
	public DataResult<LinkForCv> getById(@PathVariable("id") int id) {
		return this.linkForCvService.getById(id);
	}

	@GetMapping("/getall")
	public DataResult<List<LinkForCv>> getAll() {
		return this.linkForCvService.getAll();
	}

	@GetMapping("/getallbyjobseekerid")
	public DataResult<List<LinkForCv>> getAllByJobseekerId(int id) {
		return this.getAllByJobseekerId(id);
	}
}
