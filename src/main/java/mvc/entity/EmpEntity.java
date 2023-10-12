package mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmpEntity {
	
	@Id
	@Column(name="Empid")
	int Empid;
	@Column(name="FName")
	String FName;	
	@Column(name="LName")
	String LName;
	@Column(name="DoB")
	String DoB;
	@Column(name="Ssn")
	int Ssn;
	
	
	public EmpEntity() {
	}
	
	
	public EmpEntity(int empid, String fName, String lName, String doB, int ssn) {
		super();
		Empid = empid;
		FName = fName;
		LName = lName;
		DoB = doB;
		Ssn = ssn;
	}


	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getDoB() {
		return DoB;
	}
	public void setDoB(String doB) {
		DoB = doB;
	}
	public int getSsn() {
		return Ssn;
	}
	public void setSsn(int ssn) {
		Ssn = ssn;
	}
	
	
	
}
