package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobSekeerService;
import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("api/employees")
public class JobSekeerControllers {

	private JobSekeerService jobSekeerService;

	@Autowired
	public JobSekeerControllers(JobSekeerService employeeService) {
		super();
		this.jobSekeerService = employeeService;
	}
	
	@PostMapping("/register")
	public Result register(JobSeeker jobSeeker) {
		
		return this.jobSekeerService.register(jobSeeker);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobSeeker>> getAll(){
		return this.jobSekeerService.getAll();
	}
	
//	@GetMapping("/geyByEmail")
//	public DataResult<List<JobSeeker>> getByEmail (String email){
//		return this.jobSekeerService.getByEmail(email);
//	}
	
	
}
