package com.example.business.abstracts;

import java.util.List;

import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.User;

public interface UserService {

	Result add(User user);

	//Result update(User user);

	//Result delete(int id);

	//DataResult<User> getById(int id);

	DataResult<List<User>> getAll();
	DataResult<User> getUserByEmail(String email);
}
