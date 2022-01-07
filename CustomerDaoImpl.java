package com.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Model.Customer;


public class CustomerDaoImpl implements CustomerDao {

private static SessionFactory factory = new Configuration().configure().buildSessionFactory(); 

@Override
public List<Customer> getData() {
	Session session = factory.openSession();
	List<Customer> custlist = session.createQuery("from Customer").list();
	return custlist;
}

@Override
public void SaveData(Customer customer) {
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	session.save(customer);
	transaction.commit();

}

@Override
public void UpdateData(int custId, Customer customer) {
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	List<Customer> custlist = session.createQuery("from customer").list();
	for (Customer c : custlist) {
		if (c.getCustId() == custId)
			c.setCustName(customer.getCustName());
		c.setCustContactNo(customer.getCustContactNo());
		c.setCustAddress(customer.getCustAddress());
		c.setCustAccountNo(customer.getCustAccountNo());
		session.update(c);
		transaction.commit();
	}
}

@Override
public void DeletData(int custId) 
{
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	List<Customer> custlist = session.createQuery("from customer").list();
	for (Customer c : custlist)
	{
		if (c.getCustId() == custId)
			session.delete(c);
		transaction.commit();
	}

}
}



	