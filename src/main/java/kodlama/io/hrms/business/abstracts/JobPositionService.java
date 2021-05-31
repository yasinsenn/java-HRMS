package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	Result add(JobPosition jobPosition);
	
	DataResult<List<JobPosition>> getAll();
}
