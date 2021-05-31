package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.SystemPersonel;


public interface SystemPersonelDao extends JpaRepository<SystemPersonel , Integer> {

}
