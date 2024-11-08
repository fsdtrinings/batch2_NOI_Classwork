package p1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	private int cid;
	private String courseName;
	private int duration;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String courseName, int duration) {
		super();
		this.cid = cid;
		this.courseName = courseName;
		this.duration = duration;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", courseName=" + courseName + ", duration=" + duration + "]";
	}
	
	
	
}
