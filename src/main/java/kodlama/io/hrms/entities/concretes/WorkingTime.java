package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "working_time")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvert"})
public class WorkingTime {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "working_time")
	private String workingTime;
	
	@OneToMany(mappedBy =   "workingTime")
	private List<JobAdvert> jobAdvert;

	public WorkingTime() { 
		
	} 
	
	public WorkingTime(int id, String workingTime, List<JobAdvert> jobAdvert) {
		super();
		this.id = id;
		this.workingTime = workingTime;
		this.jobAdvert = jobAdvert;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(String workingTime) {
		this.workingTime = workingTime;
	}

	public List<JobAdvert> getJobAdvert() {
		return jobAdvert;
	}

	public void setJobAdvert(List<JobAdvert> jobAdvert) {
		this.jobAdvert = jobAdvert;
	}
}
	
	
	
	
	
	
	
	
