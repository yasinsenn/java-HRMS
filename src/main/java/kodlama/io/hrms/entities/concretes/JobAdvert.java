package kodlama.io.hrms.entities.concretes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "job_adverts")
public class JobAdvert {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
//	@Column(name = "job_position_id")
//	private int jobPositionId;
//	
//	@Column(name = "employer_id")
//	private int employerId;
//	
//	@Column(name ="city_id")
//	private int cityId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "salary_min")
	private String salaryMin;
	
	@Column(name = "salary_max")
	private String salaryMax;
	
	@Column(name = "open_positions")
	private int openPositions;
	
	@Column(name = "deadline_date")
	private String deadlineDate ;
	
	@Column(name = "is_activated")
	private boolean isActivated;
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne
	@JoinColumn(name = "work_time_id")
	private WorkingTime workingTime;
	
	@ManyToOne
	@JoinColumn(name = "work_type_id")
	private TypeOfWork typeOfWork;
	
	public JobAdvert() {
		
	}

	public JobAdvert(int id, int jobPositionId, int employerId, int cityId, String description, String salaryMin,
			String salaryMax, int openPositions, String deadlineDate, boolean isActivated) {
		super();
		this.id = id;
		this.description = description;
		this.salaryMin = salaryMin;
		this.salaryMax = salaryMax;
		this.openPositions = openPositions;
		this.deadlineDate = deadlineDate;
		this.isActivated = isActivated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSalaryMin() {
		return salaryMin;
	}

	public void setSalaryMin(String salaryMin) {
		this.salaryMin = salaryMin;
	}

	public String getSalaryMax() {
		return salaryMax;
	}

	public void setSalaryMax(String salaryMax) {
		this.salaryMax = salaryMax;
	}

	public int getOpenPositions() {
		return openPositions;
	}

	public void setOpenPositions(int openPositions) {
		this.openPositions = openPositions;
	}

	public String getDeadlineDate() {
		return deadlineDate;
	}

	public void setDeadlineDate(String deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public JobPosition getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(JobPosition jobPosition) {
		this.jobPosition = jobPosition;
	}
	
	
	
	

}
