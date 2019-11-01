package objectoutput;
import java.io.*;
import java.util.Date;

public class Student implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int id;
	private Date dob;
	private SchoolType schoolType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public SchoolType getSchoolType() {
		return schoolType;
	}
	public void setSchoolType(SchoolType schoolType) {
		this.schoolType = schoolType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		SchoolType schoolType = (SchoolType) student.getSchoolType().clone();
		student.setSchoolType(schoolType);
		return student;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dob=" + dob + ", schoolType=" + schoolType + "]";
	}
	

}
