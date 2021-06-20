package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.ImageForCv;


public interface ImageForCvDao extends JpaRepository<ImageForCv, Integer> {

}
