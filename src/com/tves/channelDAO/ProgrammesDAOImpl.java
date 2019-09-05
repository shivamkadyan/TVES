package com.tves.channelDAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tves.models.Channel;
import com.tves.models.Programmes;

import util.HibernateUtil;

public class ProgrammesDAOImpl implements ProgrammesDAO {

	@Override
	public List<Programmes> getAll() {
		List<Programmes> list = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		list = session.createQuery("from Programmes",Programmes.class).list();
		return list;
		
	}
	public static void main(String []args){
		ProgrammesDAO dao = new ProgrammesDAOImpl();
		List<Programmes> list = new ArrayList<Programmes>();
		list=dao.getByChannel("9xm");
		for(Programmes p:list)
			System.out.println(p.getPname());
	}
	@Override
	public List<Programmes> getByChannel(String channel) {
		List<Programmes> list = null;
		
		Session session = null;
		Transaction tx=null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			tx=session.getTransaction();
			tx.begin();
			String hql = "FROM Programmes P WHERE P.cname = :chnl";
			Query<Programmes> query = session.createQuery(hql);
			query.setParameter("chnl",channel);
			list = query.list();	
			tx.commit();
		
		}catch(HibernateException e){
			System.out.println(e);
			if(tx!=null){
				tx.rollback();
			}
		}
		
		return list;
	}

}
