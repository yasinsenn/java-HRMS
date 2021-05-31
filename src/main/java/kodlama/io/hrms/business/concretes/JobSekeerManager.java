package kodlama.io.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlama.io.hrms.business.abstracts.JobSekeerService;
import kodlama.io.hrms.core.adapters.abstracts.FakeMernisService;
import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.ErrorResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.core.utilities.SuccessDataResult;
import kodlama.io.hrms.core.utilities.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobSekeerDao;
import kodlama.io.hrms.entities.concretes.JobSeeker;

@Service
public class JobSekeerManager implements JobSekeerService {

	private JobSekeerDao jobSekeerDao;
	//private FakeMernisService fakeMernisService;


	@Autowired
	public JobSekeerManager(JobSekeerDao jobSekeerDao) {
		super();
		this.jobSekeerDao = jobSekeerDao;
		//this.fakeMernisService = fakeMernisService;
	}

	@Override
	public Result register(JobSeeker jobSeeker) {
		
		if (!ConfirmedJobSeekerInformation(jobSeeker)) {
			return new ErrorResult("Tüm alanların doldurulması zorunludur!!!");
		}
		
		if (jobSekeerDao.getByEmail(jobSeeker.getEmail()) != null){
			return new ErrorResult("Mail adresi daha önce kullanılmış.");
		}
		
		if (jobSekeerDao.getByIdentityNumber(jobSeeker.getIdentityNumber()) != null) {
			return new ErrorResult("Tc No daha önce kullanılmış");
		}
		
//		else if (fakeMernisService.simulatedMernis(jobSeeker.getFirstName(), jobSeeker.getLastName(), jobSeeker.getIdentityNumber(), jobSeeker.getDateOfBirth()) == false) {
//			return new ErrorResult("Mernis doğrulaması başarısız");
//		}
		
	
		else {
			this.jobSekeerDao.save(jobSeeker);
			return new SuccessResult("Başarıyla eklendi");
		}
	

		
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSekeerDao.findAll(), "Listelendi");
	}

	@Override
	public DataResult<JobSeeker> getByEmail(String email) {
		return new SuccessDataResult<JobSeeker>(this.jobSekeerDao.getByEmail(email));
		
	}

	@Override
	public DataResult<JobSeeker> getByIdentityNumber(String identityNumber) {
		return new SuccessDataResult<JobSeeker>(this.jobSekeerDao.getByIdentityNumber(identityNumber));
	}

	private boolean ConfirmedJobSeekerInformation(JobSeeker jobSeeker) {
		if (jobSeeker.getFirstName().isEmpty() || jobSeeker.getLastName().isEmpty() || jobSeeker.getEmail().isEmpty()
				|| jobSeeker.getIdentityNumber().isEmpty() || jobSeeker.getPassword().isEmpty()
				|| jobSeeker.getPasswordRepeat().isEmpty()) {
				return false;
		}
		return true;
		
	}
	

	

	



	

}
