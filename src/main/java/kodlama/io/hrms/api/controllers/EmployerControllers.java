package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("api/employers")
public class EmployerControllers {

	private EmployerService employerService;

	public EmployerControllers(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@PostMapping("/register")
	public Result register(Employer employer) {
		return this.employerService.register(employer);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
	
}
