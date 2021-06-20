package kodlama.io.hrms.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.CvService;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.concretes.Cv;

@RestController
@RequestMapping("api/cv")
public class CvControllers {

	private CvService cvService;

	@Autowired
	public CvControllers(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@PostMapping("/add")
	public Result add(Cv cv) {
		return this.cvService.add(cv);
		
	}
	
	
	
	
	
}
