package com.tka.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CrickStaff {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int staffId;
	String staffname;
	String StaffDept;
	int staffage;
	int staffNoOfYearstoBCCI;

	public CrickStaff(String staffname, String staffDept, int staffage, int staffNoOfYearstoBCCI) {
		super();
		this.staffname = staffname;
		StaffDept = staffDept;
		this.staffage = staffage;
		this.staffNoOfYearstoBCCI = staffNoOfYearstoBCCI;
	}

	public CrickStaff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CrickStaff(int staffId, String staffname, String staffDept, int staffage, int staffNoOfYearstoBCCI) {
		super();
		this.staffId = staffId;
		this.staffname = staffname;
		StaffDept = staffDept;
		this.staffage = staffage;
		this.staffNoOfYearstoBCCI = staffNoOfYearstoBCCI;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public String getStaffDept() {
		return StaffDept;
	}

	public void setStaffDept(String staffDept) {
		StaffDept = staffDept;
	}

	public int getStaffage() {
		return staffage;
	}

	public void setStaffage(int staffage) {
		this.staffage = staffage;
	}

	public int getStaffNoOfYearstoBCCI() {
		return staffNoOfYearstoBCCI;
	}

	public void setStaffNoOfYearstoBCCI(int staffNoOfYearstoBCCI) {
		this.staffNoOfYearstoBCCI = staffNoOfYearstoBCCI;
	}

	@Override
	public String toString() {
		return "CrickStaff [staffId=" + staffId + ", staffname=" + staffname + ", StaffDept=" + StaffDept
				+ ", staffage=" + staffage + ", staffNoOfYearstoBCCI=" + staffNoOfYearstoBCCI + "]";
	}

}
