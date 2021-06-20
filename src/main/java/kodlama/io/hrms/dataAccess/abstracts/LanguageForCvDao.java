package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.LanguageForCv;

public interface LanguageForCvDao extends JpaRepository<LanguageForCv, Integer> {

}
