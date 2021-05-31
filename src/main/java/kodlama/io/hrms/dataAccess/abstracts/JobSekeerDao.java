package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.JobSeeker;


public interface JobSekeerDao extends JpaRepository<JobSeeker , Integer>{

	JobSeeker getByEmail (String email);
	
	JobSeeker getByIdentityNumber (String identityNumber);
	
}
