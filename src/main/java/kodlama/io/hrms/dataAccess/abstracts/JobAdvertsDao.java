package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.JobAdvert;

public interface JobAdvertsDao extends JpaRepository<JobAdvert, Integer>{

	List<JobAdvert> getByIsActivatedTrue();
	
	List<JobAdvert> getByIsActivatedTrueOrderByDeadlineDate();
	
	List<JobAdvert> getByIsActivatedTrueAndEmployer_CompanyName(String companyName);
	
	
}
