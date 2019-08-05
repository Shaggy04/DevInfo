package com.model;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import com.pojo.Addmember;
import com.pojo.Sponser;

public class BLmanager {
	
	SessionFactory con=new Configuration().configure().buildSessionFactory();


	public void savedata(Addmember add) {
		// TODO Auto-generated method stub
		
		Session s1=con.openSession();
		Transaction t1=s1.beginTransaction();
		s1.save(add);
		t1.commit();
		s1.close();
	}


	public void savesponser(Sponser s) {
		// TODO Auto-generated method stub
		Session s2=con.openSession();
		Transaction t1=s2.beginTransaction();
		s2.save(s);
		t1.commit();
		s2.close();
	}

}
