package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.entities.concretes.WorkingTime;

public interface WorkingTimeService {

	DataResult<List<WorkingTime>> getAll();
}
