package com.example.business.abstracts;

import com.example.entities.concretes.User;

public interface ValidateService {
	boolean validate(User user) throws Exception;
}
