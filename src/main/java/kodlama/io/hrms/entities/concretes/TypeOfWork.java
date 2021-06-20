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
@Table(name = "type_of_work")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvert"})
public class TypeOfWork {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "type")
	private String typeOfWork;
	
	@OneToMany(mappedBy =   "typeOfWork")
	private List<JobAdvert> jobAdvert;

	public TypeOfWork() {
		
	}
	
	public TypeOfWork(int id, String workingTime, List<JobAdvert> jobAdvert) {
		super();
		this.id = id;
		this.typeOfWork = workingTime;
		this.jobAdvert = jobAdvert;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeOfWork() {
		return typeOfWork;
	}

	public void setTypeOfWork(String typeOfWork) {
		this.typeOfWork = typeOfWork;
	}

	public List<JobAdvert> getJobAdvert() {
		return jobAdvert;
	}

	public void setJobAdvert(List<JobAdvert> jobAdvert) {
		this.jobAdvert = jobAdvert;
	}
	
	
}













