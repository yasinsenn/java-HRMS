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
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity 
@Table(name = "schools_for_cv")
public class SchoolForCv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "id")
	private int id;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "department_name")
	private String departmentName;
	
	
	@Column(name = "start_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date startDate;
	
	
	@Column(name = "finish_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date finishDate;
	
	@ManyToOne
	@JoinColumn(name = "cv_id ")
	private Cv cv;


	public SchoolForCv() {
	
	}

	public SchoolForCv(int id, String schoolName, String departmentName, Date startDate, Date finishDate, Cv cv) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.departmentName = departmentName;
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

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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
