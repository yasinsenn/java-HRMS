package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlama.io.hrms.entities.concretes.SkillsForCv;

public interface SkillsForCvDao  extends JpaRepository<SkillsForCv, Integer>{

}
