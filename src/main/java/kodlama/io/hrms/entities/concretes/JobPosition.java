package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "job_positions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvert"})
public class JobPosition {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "position_name")
	private String positionName;
	
	@OneToMany(mappedBy = "jobPosition")
	private List<JobAdvert> jobAdvert;
	
	public JobPosition() {
		
	}

	public JobPosition(int id, String positionName, String positionInformation) {
		super();
		this.id = id;
		this.positionName = positionName;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}


	
}
