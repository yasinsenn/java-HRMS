package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.concretes.Cv;

public interface CvService {

	Result add(Cv cv);
	
}
