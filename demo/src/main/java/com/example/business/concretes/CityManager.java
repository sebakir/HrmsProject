package com.example.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.business.abstracts.CityService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.core.utilities.results.SuccessDataResult;
import com.example.core.utilities.results.SuccessResult;
import com.example.dataAccess.abstracts.CityDao;
import com.example.entities.concretes.City;

@Service
public class CityManager implements CityService {

	private CityDao cityDao;

	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult("City has been added.");
	}

	@Override
	public Result update(City city) {
		this.cityDao.save(city);
		return new SuccessResult("City has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.cityDao.deleteById(id);
		return new SuccessResult("City has been deleted.");
	}

	@Override
	public DataResult<City> getById(int id) {
		return new SuccessDataResult<City>(this.cityDao.getOne(id));
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll());
	}
}
