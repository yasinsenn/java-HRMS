package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.entities.concretes.TypeOfWork;

public interface TypeOfWorkService {

	DataResult<List<TypeOfWork>> getAll();
}
