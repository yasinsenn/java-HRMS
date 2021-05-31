package kodlama.io.hrms.business.concretes;

import java.nio.channels.NonWritableChannelException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobPositionService;
import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.ErrorResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.core.utilities.SuccessDataResult;
import kodlama.io.hrms.core.utilities.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobPositionDao;
import kodlama.io.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}



	@Override
	public Result add(JobPosition jobPosition) {
		
		if (jobPositionDao.getByPositionName(jobPosition.getPositionName()) != null) {
			return new ErrorResult("Bu iş pozisyonu daha önce eklenmiş");
		}
		else {
			this.jobPositionDao.save(jobPosition);
			return new SuccessResult("İş pozisyonu başarıyla eklendi");
		}
		
	}



	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(), "Data listelendi");
	}

}
