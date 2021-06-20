package kodlama.io.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.SchoolForCvService;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.concretes.SchoolForCv;

@RestController
@RequestMapping("api/schoolForCvs")
public class SchoolForCvControllers {

	private SchoolForCvService schoolForCvService;

	@Autowired
	public SchoolForCvControllers(SchoolForCvService schoolForCvService) {
		super();
		this.schoolForCvService = schoolForCvService;
	}
	
	@PostMapping("/add")
	public Result add(SchoolForCv schoolForCv){
		
		return this.schoolForCvService.add(schoolForCv);

	}
	
	
	
}
