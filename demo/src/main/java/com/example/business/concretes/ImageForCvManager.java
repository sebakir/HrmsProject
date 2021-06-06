package com.example.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.business.abstracts.ImageForCvService;
import com.example.core.utilities.imageUpload.ImageUploadService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.core.utilities.results.SuccessDataResult;
import com.example.core.utilities.results.SuccessResult;
import com.example.dataAccess.abstracts.ImageForCvDao;
import com.example.entities.concretes.ImageForCv;

@Service
public class ImageForCvManager implements ImageForCvService {

	private ImageForCvDao imageForCvDao;
	private ImageUploadService imageUploadService;

	@Autowired
	public ImageForCvManager(ImageForCvDao imageForCvDao, ImageUploadService imageUploadService) {
		super();
		this.imageForCvDao = imageForCvDao;
		this.imageUploadService = imageUploadService;
	}

	@Override
	public Result add(ImageForCv imageForCv, MultipartFile multipartFile) {
		Map<String, String> uplaodImage = this.imageUploadService.uploadImageFile(multipartFile).getData();
		imageForCv.setUrl(uplaodImage.get("url"));
		this.imageForCvDao.save(imageForCv);
		return new SuccessResult("Image has been added");

	}

	@Override
	public Result update(ImageForCv imageForCv) {
		this.imageForCvDao.save(imageForCv);
		return new SuccessResult("Image has been updated");
	}

	@Override
	public Result delete(int id) {
		this.imageForCvDao.deleteById(id);
		return new SuccessResult("Image has been deleted");
	}

	@Override
	public DataResult<ImageForCv> getById(int id) {
		return new SuccessDataResult<ImageForCv>(this.imageForCvDao.getById(id));
	}

	@Override
	public DataResult<List<ImageForCv>> getAll() {
		return new SuccessDataResult<List<ImageForCv>>(this.imageForCvDao.findAll());
	}

	@Override
	public DataResult<ImageForCv> getByJobseekerId(int id) {
	return new SuccessDataResult<ImageForCv>(this.imageForCvDao.getByJobseeker_id(id));
	}

}
