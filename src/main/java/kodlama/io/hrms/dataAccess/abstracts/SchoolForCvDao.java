package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.SchoolForCv;

public interface SchoolForCvDao extends JpaRepository<SchoolForCv, Integer> {

}
