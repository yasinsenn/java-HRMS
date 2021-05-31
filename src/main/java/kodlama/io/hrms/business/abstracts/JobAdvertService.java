package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {

	Result add(JobAdvert jobAdverts);
	
	DataResult<List<JobAdvert>> getByIsActivated(JobAdvert jobAdvert);
	
	DataResult<List<JobAdvert>> getByIsActivatedTrueOrderByDeadlineDate(JobAdvert jobAdvert);
	
	DataResult<List<JobAdvert>> getByIsActivatedTrueAndEmployer_CompanyName(String companyName);
	
}
