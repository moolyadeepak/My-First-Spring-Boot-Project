package com.tka.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tka.Entity.CrickStaff;

@Repository
public class WCT20WorldCupDao {

	@Autowired
	SessionFactory factory;

	public List<CrickStaff> allIndianCricketStafflist() {

		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CrickStaff.class);
		List<CrickStaff> crickStaffs = criteria.list();

		return crickStaffs;

	}
    //GetMapping
	public CrickStaff getSinglestafflist() {
		Session session = factory.openSession();
		CrickStaff load = session.load(CrickStaff.class, 1);

		return load;
	}
	//PostMapping
	public void ShowinsertedData(CrickStaff crickStaff) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("crickStaff> "+ crickStaff);
		session.save(crickStaff);
		transaction.commit();
	}
	//PutMapping
	public void udatedata(CrickStaff crickStaff) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(crickStaff);
		transaction.commit();
	}

}
