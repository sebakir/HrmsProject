package com.example.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.business.abstracts.CityService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.City;

@RestController
@RequestMapping("/api/city")
public class CityController {

	private CityService cityService;

	@Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody City city) {
		return this.cityService.add(city);
	}

	@PostMapping("/update")
	public Result update(@RequestBody City city) {
		return this.cityService.update(city);
	}

	@PostMapping("/delete")
	public Result delete(@PathVariable("id") int id) {
		return this.cityService.delete(id);
	}

	@GetMapping("/getbyid")
	public DataResult<City> getById(@PathVariable("id") int id) {
		return this.cityService.getById(id);
	}

	@GetMapping("/getall")
	public DataResult<List<City>> getAll() {
		return this.cityService.getAll();
	}
}
