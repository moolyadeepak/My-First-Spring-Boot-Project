package com.tka.Controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.tka.Entity.CrickStaff;
import com.tka.Service.WCT20WorldCupServicing;

@RestController
public class WCT20WorldCupController {

	@Autowired
	WCT20WorldCupServicing cupService;

	@GetMapping("allIndianCricketStafflistController")
	public ArrayList<String> allIndianCricketStafflist() {
		ArrayList<String> allIndianCricket = cupService.staffnameOnlywithCapital();
		return allIndianCricket;

	}

	@GetMapping("staffnameOnlywithCapital")
	public ArrayList<String> staffnameCapital() {
		ArrayList<String> staff = cupService.staffnameOnlywithCapital();

		return staff;

	}

	@GetMapping("addofexpyrsOfMedStaff")
	public ArrayList<Integer> ExpYrs() {
		ArrayList<Integer> expyrs = cupService.addofexpyrsOfMedStaff();

		return expyrs;

	}

	@GetMapping("getnameofmedicalStaffOnly")
	public ArrayList<String> MedStaff() {
		ArrayList<String> medstaff = cupService.getnameofmedicalStaffOnly();

		return medstaff;

	}

	@GetMapping("Agebelow55")
	public ArrayList<String> BelowAge() {
		ArrayList<String> agebelow = cupService.Agebelow55();

		return agebelow;

	}

	@GetMapping("SinigleStaffList")
	public CrickStaff getSingleStafflist() {
		CrickStaff staff = cupService.getSingleStafflist();
		return staff;
	}

	@PostMapping("InsertDataInCrickStaff")
	public void Insertdata(@RequestBody CrickStaff crickStaff) {
		System.err.println("In controller - Insertdata");
		System.out.println("Crick Staff Data From Postman -->" + crickStaff);
		cupService.insertData(crickStaff);
		System.err.println("out controller - Insertdata");
	}
	
	@PutMapping("UpdatedataincrickStaff")
	public void Updatedata(@RequestBody CrickStaff crickStaff) {
		System.err.println("In controller - Insertdata");
		System.out.println("Crick Staff Data From Postman -->" + crickStaff);
		cupService.updatedata(crickStaff);
		System.err.println("out controller - Insertdata");
	}
	
	@GetMapping("totalcricstaffperdept/{deptname}")
	public ArrayList<CrickStaff> deptName(@PathVariable String deptname){
	     ArrayList<CrickStaff> onlyMedStaff = cupService.OnlyMedStaff(deptname);
		return onlyMedStaff;
	}
	
	@GetMapping("totalcricstaffperdeptreqparam")
	public ArrayList<CrickStaff> deptNameReqParam(@RequestParam String deptname){
	     ArrayList<CrickStaff> onlyMedStaff = cupService.OnlyMedStaff(deptname);
	     System.err.println(onlyMedStaff);
		return onlyMedStaff;
	}

}
