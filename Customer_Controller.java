package com.Controller;

import com.DAO.CustomerDao;
import com.DAO.CustomerDaoImpl;
import com.Model.Customer;

public class Customer_Controller {

	public static void main(String[] args) {
	CustomerDao customerdaoimpl = new CustomerDaoImpl();
	Customer cc = new Customer();
	cc.setCustName("Shivraj");
	cc.setCustContactNo(4545);
	cc.setCustAddress("China");
	cc.setCustAccountNo(8545);
	//customerdaoimpl.SaveData(cc);
	customerdaoimpl.UpdateData(2, cc);
	
	customerdaoimpl.getData().forEach(System.out::println); 
	

	}

}
