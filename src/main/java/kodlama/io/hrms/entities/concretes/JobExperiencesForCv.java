package kodlama.io.hrms.entities.concretes;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "job_experiences_for_cv")
public class JobExperiencesForCv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "workplace_name")
	private String workplaceName;
	
	@Column(name = "job_position")
	private String jobPosition;
	
	
	@Column(name = "start_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date startDate;
	
	
	@Column(name = "finish_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date finishDate;
	
	@ManyToOne
	@JoinColumn(name = "cv_id")
	private Cv cv;
	
	public JobExperiencesForCv() {
		
	}

	public JobExperiencesForCv(int id, String workplaceName, String jobPosition, Date startDate,
			Date finishDate, Cv cv) {
		super();
		this.id = id;
		this.workplaceName = workplaceName;
		this.jobPosition = jobPosition;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.cv = cv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWorkplaceName() {
		return workplaceName;
	}

	public void setWorkplaceName(String workplaceName) {
		this.workplaceName = workplaceName;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	
	
	
	
}
