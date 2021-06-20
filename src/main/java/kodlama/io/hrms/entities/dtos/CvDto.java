package kodlama.io.hrms.entities.dtos;

import java.util.List;

import kodlama.io.hrms.entities.concretes.ImageForCv;
import kodlama.io.hrms.entities.concretes.JobExperiencesForCv;
import kodlama.io.hrms.entities.concretes.LanguageForCv;
import kodlama.io.hrms.entities.concretes.SchoolForCv;
import kodlama.io.hrms.entities.concretes.SkillsForCv;
import kodlama.io.hrms.entities.concretes.SocialMediaForCv;

public class CvDto {
	
	private int cvId;
	private int jobseekerId;
	private List<SchoolForCv> schoolForCvs;
	private List<JobExperiencesForCv> jobExperiencesForCvs;
	private List<LanguageForCv> languageForCvs;
	private List<ImageForCv> imageForCvs;
	private List<SocialMediaForCv> socialMediaForCvs;
	private List<SkillsForCv> skillsForCvs;

	
}
