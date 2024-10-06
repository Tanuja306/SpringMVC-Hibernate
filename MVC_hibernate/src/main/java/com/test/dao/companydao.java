package com.test.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.model.company;

@Repository
@Transactional
public class companydao {

	@Autowired
	SessionFactory sf;
	
	public SessionFactory getSf() {
		return sf;
	}
    public void setSf(SessionFactory sf) {
		this.sf = sf;
	}



	public void register(company cc) {
		
		sf.getCurrentSession().save(cc);
		
	}
	
	
	public List<company> getinfo() {
		
		return sf.getCurrentSession().createQuery("from company").list();
	}
	
	
	public void deletedata(int id) {
		
		sf.getCurrentSession().createQuery("delete from company where cid='"+id+"'").executeUpdate();
		
	}
	
	
	public List<company> editdata(int id) {
		
		return sf.getCurrentSession().createQuery("from company where cid='"+id+"'").list();
	}
	
	
	public void updatadata(company cc) {
		
		sf.getCurrentSession().createQuery("update company set cname='"+cc.getCname()+"',cemail='"+cc.getCemail()+"',cpass='"+cc.getCpass()+"' where cid='"+cc.getCid()+"'").executeUpdate();
		
	}
	

}
