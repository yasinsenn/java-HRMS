package kodlama.io.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.SchoolForCvService;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.core.utilities.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.SchoolForCvDao;
import kodlama.io.hrms.entities.concretes.SchoolForCv;

@Service
public class SchoolForCvManager implements SchoolForCvService {

	private SchoolForCvDao schoolDao;
	
	@Autowired
	public SchoolForCvManager(SchoolForCvDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}


	@Override
	public Result add(SchoolForCv schoolForCv) {
		this.schoolDao.save(schoolForCv);
		return new SuccessResult("Okul bilgileri başarıyla eklendi");
	}

}
