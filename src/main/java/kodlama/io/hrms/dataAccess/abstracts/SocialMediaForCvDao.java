package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlama.io.hrms.entities.concretes.SocialMediaForCv;

public interface SocialMediaForCvDao  extends JpaRepository<SocialMediaForCv, Integer>{

}
