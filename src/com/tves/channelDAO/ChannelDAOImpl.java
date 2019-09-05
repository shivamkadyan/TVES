package com.tves.channelDAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tves.models.Channel;

import util.HibernateUtil;

public class ChannelDAOImpl implements ChannelDAO {

	@Override
	public List<Channel> getAll() {
		List<Channel> list = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		list = session.createQuery("from Channel",Channel.class).list();
		return list;
		
	}

	@Override
	public Channel find(String name) {
		Channel chnl = null;
		Session session = null;
		Transaction tx=null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			tx=session.getTransaction();
			tx.begin();
			chnl=session.get(Channel.class,name);
			tx.commit();
			}catch(HibernateException e){
			System.out.println(e);
			if(tx!=null){
				tx.rollback();
			}
		}
		
		return chnl;
	}
	
	
	

		
	@Override
	public List<Channel> findByCategory(String category) {
		List<Channel> chnl = null;
		
		Session session = null;
		Transaction tx=null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			tx=session.getTransaction();
			tx.begin();
			String hql = "FROM Channel E WHERE E.category = :ctgry";
			Query query = session.createQuery(hql);
			query.setParameter("ctgry",category);
			chnl = query.list();	
			tx.commit();
		
		}catch(HibernateException e){
			System.out.println(e);
			if(tx!=null){
				tx.rollback();
			}
		}
		
		return chnl;
	}

	@Override
	public String Add(Channel c) {
		// TODO Auto-generated method stub
		String res = "FAIL";
		
		Session session = null;
		Transaction tx=null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			tx=session.getTransaction();
			tx.begin();
			session.save(c);
			tx.commit();
			res = "SUCCESS";
		}catch(HibernateException e){
			System.out.println(e);
			if(tx!=null){
				tx.rollback();
			}
		}
		return res;
	}


	@Override
	public String Delete(Channel c) {
	String res = "FAIL";
		
		Session session = null;
		Transaction tx=null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			tx=session.getTransaction();
			tx.begin();
			session.remove(c);
			tx.commit();
			res = "SUCCESS";
		}catch(HibernateException e){
			System.out.println(e);
			if(tx!=null){
				tx.rollback();
			}
		}
		return res;
	}

	@Override
	public String Update(Channel c) {
	String res = "FAIL";
		
		Session session = null;
		Transaction tx=null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			tx=session.getTransaction();
			tx.begin();
			session.update(c);
			tx.commit();
			res = "SUCCESS";
		}catch(HibernateException e){
			System.out.println(e);
			if(tx!=null){
				tx.rollback();
			}
		}
		return res;
	}
	public static void main(String []args){
		//Channel list =new Channel();
		ChannelDAO c = new ChannelDAOImpl();
		Channel ch = new Channel();
		
		ch.setName("Star");
		ch.setCategory("Entertainment");
		System.out.println(c.Add(ch));
	}
	

}


