package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "skills_for_cv")
public class SkillsForCv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "skills_description")
	private String skillsDescription;
	
	@ManyToOne
	@JoinColumn(name = "cv_id ")
	private Cv cv;
	
	public SkillsForCv() {
		
	}

	public SkillsForCv(int id, String skillsDescription, Cv cv) {
		super();
		this.id = id;
		this.skillsDescription = skillsDescription;
		this.cv= cv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkillsDescription() {
		return skillsDescription;
	}

	public void setSkillsDescription(String skillsDescription) {
		this.skillsDescription = skillsDescription;
	}
	
	
}
