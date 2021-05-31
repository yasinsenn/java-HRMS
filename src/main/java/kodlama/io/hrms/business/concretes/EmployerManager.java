package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.ErrorResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.core.utilities.SuccessDataResult;
import kodlama.io.hrms.core.utilities.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.EmployerDao;
import kodlama.io.hrms.entities.concretes.Employer;
import kodlama.io.hrms.entities.concretes.JobSeeker;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public Result register(Employer employer) {
		
		if (!ConfirmedJobSeekerInformation(employer)) {
			
			return new ErrorResult("Tüm alanların doldurulması zorunludur!!!");
		}
		
		else if (employerDao.getByEmail(employer.getEmail()) != null) {
			return new ErrorResult("Email adresi daha önce kullanılmış");
		}
		
		else {
			this.employerDao.save(employer);
			return new SuccessResult("Kayıt başarılı");
		}
	}
	
	private boolean ConfirmedJobSeekerInformation(Employer employer) {
		
		if (employer.getCompanyName().isEmpty() || employer.getEmail().isEmpty() || employer.getPhoneNumber().isEmpty() || 
				employer.getWebsite().isEmpty() || employer.getPassword().isEmpty() || employer.getPasswordRepeat().isEmpty()) {
			
			return false;
		}		
		return true;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Data listelendi");
	}

	

}
