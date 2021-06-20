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
@Table(name = "image_for_cv")
public class ImageForCv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "image _url")
	private String imageUrl;
	
	@ManyToOne
	@JoinColumn(name = "cv_id ")
	private Cv cv;
	
	
	public ImageForCv() {
		
	}

	

	public ImageForCv(int id, String imageUrl, Cv cv) {
		super();
		this.id = id;
		this.imageUrl = imageUrl;
		this.cv = cv;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
	
	

}
