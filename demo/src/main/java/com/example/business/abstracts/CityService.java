package com.example.business.abstracts;

import java.util.List;

import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.City;

public interface CityService {
	
	Result add(City city);

	Result update(City city);

	Result delete(int id);

	DataResult<City> getById(int id);

	DataResult<List<City>> getAll();
}
