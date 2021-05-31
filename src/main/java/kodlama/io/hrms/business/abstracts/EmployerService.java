package kodlama.io.hrms.business.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.concretes.Employer;

public interface EmployerService {

	Result register(Employer employer);
	
	DataResult<List<Employer>> getAll();
	
	
}
