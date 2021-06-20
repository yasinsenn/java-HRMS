package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.JobExperiencesForCv;


public interface JobExperiencesForCvDao extends JpaRepository<JobExperiencesForCv, Integer> {

}
