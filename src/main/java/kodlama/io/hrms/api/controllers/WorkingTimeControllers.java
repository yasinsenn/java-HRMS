package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.WorkingTimeService;
import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.entities.concretes.WorkingTime;

@RestController
@RequestMapping("api/workingtimes")
@CrossOrigin
public class WorkingTimeControllers {
	
	private WorkingTimeService workingTimeService;

	@Autowired
	public WorkingTimeControllers(WorkingTimeService workingTimeService) {
		super();
		this.workingTimeService = workingTimeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<WorkingTime>> getAll() {
		return this.workingTimeService.getAll();
	}
	

}
