package com.infosys.ipts.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infosys.ipts.dao.InputParamaterDAO;
import com.infosys.ipts.entity.InputParameters;

@Repository
public class InputParameterDAOImpl implements InputParamaterDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int add(InputParameters inputParameters) {
		Session session = sessionFactory.openSession();
		int paramId = (int) session.save(inputParameters);
		session.flush();
		session.close();
		return paramId;
	}

	@Override
	public void delete(InputParameters inputParameters) {
		Session session = sessionFactory.openSession();
		session.delete(inputParameters);
		session.flush();
		session.close();
	}

	@Override
	public void update(InputParameters inputParameters) {
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(inputParameters);
		session.flush();
		session.close();
	}

	@Override
	public InputParameters get(int paramId) {
		Session session = sessionFactory.openSession();
		InputParameters inputParameters = (InputParameters) session.createCriteria(InputParameters.class)
				.add(Restrictions.eq("paramId", paramId)).uniqueResult();
		session.flush();
		session.close();
		return inputParameters;
	}

}
