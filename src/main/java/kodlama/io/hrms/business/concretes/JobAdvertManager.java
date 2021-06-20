package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobAdvertService;
import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.ErrorResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.core.utilities.SuccessDataResult;
import kodlama.io.hrms.core.utilities.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobAdvertsDao;
import kodlama.io.hrms.entities.concretes.Employer;
import kodlama.io.hrms.entities.concretes.JobAdvert;
import net.bytebuddy.asm.Advice.This;

@Service
public class JobAdvertManager implements JobAdvertService {

	private JobAdvertsDao jobAdvertsDao;

	public JobAdvertManager(JobAdvertsDao jobAdvertsDao) {
		super();
		this.jobAdvertsDao = jobAdvertsDao;
	}


	@Override
	public Result add(JobAdvert jobAdvert) {
		if (!CheckEmpty(jobAdvert)) {
			return new ErrorResult("Tüm alanların doldurulması zorunludur");
		}
		else {
			this.jobAdvertsDao.save(jobAdvert);
			return new SuccessResult("İş ilanı başarıyla eklendi");
		}
	}

	
	
	private boolean CheckEmpty(JobAdvert jobAdvert) {
		
		if (jobAdvert.getDescription() == null && jobAdvert.getOpenPositions() != 0 && jobAdvert.getJobPosition() == null 
				&& jobAdvert.getCity() == null) {
			
			return false;
		}
		
		return true;
	}


	@Override
	public DataResult<List<JobAdvert>> getByIsActivated(JobAdvert jobAdvert) {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertsDao.getByIsActivatedTrue(), "Data listelendi");
	}


	@Override
	public DataResult<List<JobAdvert>> getByIsActivatedTrueOrderByDeadlineDate(JobAdvert jobAdvert) {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertsDao.getByIsActivatedTrueOrderByDeadlineDate(), "Data listelendi");
	}


	@Override
	public DataResult<List<JobAdvert>> getByIsActivatedTrueAndEmployer_CompanyName(String companyName) {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertsDao.getByIsActivatedTrueAndEmployer_CompanyName(companyName));
	}


	@Override
	public DataResult<List<JobAdvert>> getAll() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertsDao.findAll(), "Data listelendi");
	}
	
	
}
