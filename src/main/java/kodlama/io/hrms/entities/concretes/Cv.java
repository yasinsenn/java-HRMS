package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cv_table")
public class Cv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "cover_letter")
	private String coverLetter;
	
	@ManyToOne
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<SchoolForCv> schoolForCv;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<JobExperiencesForCv> jobExperiencesForCv;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<LanguageForCv> languageForCv;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<ImageForCv> ımageForCv;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<SocialMediaForCv> socialMediaForCv;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<SkillsForCv> skillsForCv;

	


	public Cv() {
		
	}


	public Cv(int id, String coverLetter, JobSeeker jobSeeker, List<SchoolForCv> schoolForCv,
			List<JobExperiencesForCv> jobExperiencesForCv, List<LanguageForCv> languageForCv,
			List<ImageForCv> imageForCv, List<SocialMediaForCv> socialMediaForCv, List<SkillsForCv> skillsForCv) {
		super();
		this.id = id;
		this.coverLetter = coverLetter;
		this.jobSeeker = jobSeeker;
		this.schoolForCv = schoolForCv;
		this.jobExperiencesForCv = jobExperiencesForCv;
		this.languageForCv = languageForCv;
		ımageForCv = imageForCv;
		this.socialMediaForCv = socialMediaForCv;
		this.skillsForCv = skillsForCv;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCoverLetter() {
		return coverLetter;
	}


	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}


	public JobSeeker getJobSeekers() {
		return jobSeeker;
	}


	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}


	public List<SchoolForCv> getSchoolForCv() {
		return schoolForCv;
	}


	public void setSchoolForCv(List<SchoolForCv> schoolForCv) {
		this.schoolForCv = schoolForCv;
	}


	public List<JobExperiencesForCv> getJobExperiencesForCv() {
		return jobExperiencesForCv;
	}


	public void setJobExperiencesForCv(List<JobExperiencesForCv> jobExperiencesForCv) {
		this.jobExperiencesForCv = jobExperiencesForCv;
	}


	public List<LanguageForCv> getLanguageForCv() {
		return languageForCv;
	}


	public void setLanguageForCv(List<LanguageForCv> languageForCv) {
		this.languageForCv = languageForCv;
	}


	public List<ImageForCv> getImageForCv() {
		return ımageForCv;
	}


	public void setImageForCv(List<ImageForCv> imageForCv) {
		ımageForCv = imageForCv;
	}


	public List<SocialMediaForCv> getSocialMediaForCv() {
		return socialMediaForCv;
	}


	public void setSocialMediaForCv(List<SocialMediaForCv> socialMediaForCv) {
		this.socialMediaForCv = socialMediaForCv;
	}


	public List<SkillsForCv> getSkillsForCv() {
		return skillsForCv;
	}


	public void setSkillsForCv(List<SkillsForCv> skillsForCv) {
		this.skillsForCv = skillsForCv;
	}




	
}
