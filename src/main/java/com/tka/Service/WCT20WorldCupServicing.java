package com.tka.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Entity.CrickStaff;
import com.tka.Dao.WCT20WorldCupDao;

@Service
public class WCT20WorldCupServicing {
	
	@Autowired
	WCT20WorldCupDao cupDao;
	
	public int allIndianCricketStafflistServicing(){
		List<CrickStaff> getstafflist=cupDao.allIndianCricketStafflist();
		
		
		return getstafflist.size();
		
		
	}
	//Path nd ReqParam
	CrickStaff temp=null;
	public ArrayList<CrickStaff> OnlyMedStaff(String deptname){
		ArrayList<CrickStaff> al= new ArrayList<>();
		List<CrickStaff> getstafflist=cupDao.allIndianCricketStafflist();
		for (CrickStaff i : getstafflist) {
			String staffDept = i.getStaffDept();
			if(staffDept.equals(deptname)) {
				temp=i;
				al.add(temp);
			}
		}
	   return al;
	}

	
   public HashMap<String, Integer> getNamewithExp(){
		HashMap<String, Integer> mp= new HashMap<>();
		List<CrickStaff> getstafflist=cupDao.allIndianCricketStafflist();
		for (CrickStaff i : getstafflist) {
			mp.put(i.getStaffname(), i.getStaffNoOfYearstoBCCI());
		}
	   return mp;
	}
   
   int max=Integer.MIN_VALUE;
   String Staffname=" ";
   public String MaxYearsStafftoBCCI(){
		List<CrickStaff> getstafflist=cupDao.allIndianCricketStafflist();
		for (CrickStaff i : getstafflist) {
			int staffNoOfYearstoBCCI = i.getStaffNoOfYearstoBCCI();
			String staffname= i.getStaffname();
			if(staffNoOfYearstoBCCI>max) {
				max=staffNoOfYearstoBCCI;
				Staffname=staffname;
			}
		}
	   return Staffname;
	}
   
   String staffname2="";
   public ArrayList<String> getDataMorethan10yrs(){
		ArrayList<String> al= new ArrayList<>();
		List<CrickStaff> getstafflist=cupDao.allIndianCricketStafflist();
		for (CrickStaff i : getstafflist) {
			int staffNoOfYearstoBCCI = i.getStaffNoOfYearstoBCCI();
			if(staffNoOfYearstoBCCI>=10) {
				al.add(i.getStaffname());
			}
		}
	  return al;
	}
	
   public ArrayList<String> startswithletterS(){
		ArrayList<String> al1= new ArrayList<>();
		List<CrickStaff> getstafflist=cupDao.allIndianCricketStafflist();
		
		for (CrickStaff i : getstafflist) {
			String staffname= i.getStaffname();
			if(staffname.startsWith("S")) {
				al1.add(staffname);
			}
		}
	  return al1;
	}
   
   public ArrayList<String> Agebelow55(){
		ArrayList<String> al2= new ArrayList<>();
		List<CrickStaff> getstafflist=cupDao.allIndianCricketStafflist();
		
		for (CrickStaff i : getstafflist) {
			int staffage= i.getStaffage();
			if(staffage<55) {
				al2.add(i.getStaffname());
			}
		}
	  return al2;
	}
   
   public ArrayList<String> getnameofmedicalStaffOnly(){
		ArrayList<String> al3= new ArrayList<>();
		List<CrickStaff> getstafflist=cupDao.allIndianCricketStafflist();
		
		for (CrickStaff i : getstafflist) {
			
			if(i.getStaffDept().equals("Med")) {
				al3.add(i.getStaffname());
			}
		}
	  return al3;
	}
   
   int sum=0;
   public ArrayList<Integer>   addofexpyrsOfMedStaff(){
		ArrayList<Integer> al4= new ArrayList<>();
		List<CrickStaff> getstafflist=cupDao.allIndianCricketStafflist();
		
		for (CrickStaff i : getstafflist) {
			
			if(i.getStaffDept().equals("Med")) {
				sum=sum+i.getStaffNoOfYearstoBCCI();
				
			}
		}
		al4.add(sum);
		
	  return al4;
	}
   
  
   public ArrayList<String>   staffnameOnlywithCapital(){
		ArrayList<String> al6= new ArrayList<>();
		List<CrickStaff> getstafflist=cupDao.allIndianCricketStafflist();
		
		for (CrickStaff i : getstafflist) {
			String staffname3 = i.getStaffname().toUpperCase();
			al6.add(staffname3);
		}
		
		
	  return al6;
	}


    public CrickStaff getSingleStafflist() {
	  CrickStaff list=cupDao.getSinglestafflist();
	  
	   return list;
    }


	public void insertData(CrickStaff crickStaff) {
		cupDao.ShowinsertedData(crickStaff);
	}


	public void updatedata(CrickStaff crickStaff) {
		cupDao.udatedata(crickStaff);
		
	}

}
