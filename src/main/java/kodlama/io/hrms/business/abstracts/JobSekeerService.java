package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.concretes.JobSeeker;

public interface JobSekeerService {

	Result register(JobSeeker jobSeeker);
	DataResult<List<JobSeeker>> getAll();
	
	DataResult<JobSeeker> getByEmail (String email);
	
	DataResult<JobSeeker> getByIdentityNumber (String identityNumber);
}
