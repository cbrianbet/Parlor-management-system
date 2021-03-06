package com.board.model;

import java.util.ArrayList;

import org.hibernate.Session;

import com.hibernate.HibernateUtil;

public class DeseaseList extends ArrayList<Desease>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean add(Desease desease) {
		//ensure the database is updated after any of these two operations
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.save(desease);
		session.getTransaction().commit();
		return super.add(desease);
	}
	
	public boolean remove(Desease desease) {
		Session session = HibernateUtil.getSession();
		session.getTransaction().begin();
		session.delete(desease);
		session.getTransaction().commit();
		return super.remove(desease);
	}
	
	public boolean addInit(Desease d) {
		return super.add(d);
	}
}
