package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.TypeOfWorkService;
import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.entities.concretes.TypeOfWork;

@RestController
@RequestMapping("api/typeofworks")
@CrossOrigin
public class TypeOfWorkControllers {
	
	private TypeOfWorkService typeOfWorkService;
	
	@Autowired
	public TypeOfWorkControllers(TypeOfWorkService typeOfWorkService) {
		super();
		this.typeOfWorkService = typeOfWorkService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<TypeOfWork>> getAll() {
		return this.typeOfWorkService.getAll();
	}

}
