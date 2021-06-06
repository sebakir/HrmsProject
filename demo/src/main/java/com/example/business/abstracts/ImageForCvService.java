package com.example.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.ImageForCv;

public interface ImageForCvService {

	Result add(ImageForCv imageForCv , MultipartFile multipartFile);

	Result update(ImageForCv imageForCv);

	Result delete(int id);

	DataResult<ImageForCv> getById(int id);

	DataResult<List<ImageForCv>> getAll();

	DataResult<ImageForCv> getByJobseekerId(int id);
}
