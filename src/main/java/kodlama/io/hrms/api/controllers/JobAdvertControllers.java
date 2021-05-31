package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobAdvertService;
import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.core.utilities.SuccessDataResult;
import kodlama.io.hrms.entities.concretes.JobAdvert;



@RestController
@RequestMapping("api/jobadverts")
public class JobAdvertControllers {
	
	private JobAdvertService jobAdvertService;

	@Autowired
	public JobAdvertControllers(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}
	
	@PostMapping("/add")
	public Result add( JobAdvert jobAdvert) {
		return this.jobAdvertService.add(jobAdvert);
	}
	
	@GetMapping("/getByIsActivated")
	public DataResult<List<JobAdvert>> getByIs_Activated(JobAdvert jobAdvert) {
		return this.jobAdvertService.getByIsActivated(jobAdvert);
	}
	
	@GetMapping("/getByIsActivatedOrderByDeadlineDate")
	public DataResult<List<JobAdvert>> getByIsActivatedTrueOrderByDeadlineDate(JobAdvert jobAdvert){
		return this.jobAdvertService.getByIsActivatedTrueOrderByDeadlineDate(jobAdvert);
	}
	
	@GetMapping("/getByIsActivatedTrueAndEmployerCompanyName")
	public DataResult<List<JobAdvert>> getByIsActivatedTrueAndEmployer_CompanyName(String companyName){
		return this.jobAdvertService.getByIsActivatedTrueAndEmployer_CompanyName(companyName);
	}

}
