package com.DAO;
import com.Model.Customer;
import java.util.List;



public interface CustomerDao {
	
	public List<Customer>getData();
	
	public void SaveData(Customer customer);
	
	public void UpdateData(int custId , Customer customer);
	
	public void DeletData(int custId); 
	
	

}
