package com.bank.enitity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "customers")
public class ListOfCustomers {

	@Id
	private int acc_num;
	private String cust_name;
	private double acc_balance;
	
	public ListOfCustomers(int acc_num, String cust_name, double acc_balance, String cust_email) {
		super();
		this.acc_num = acc_num;
		this.cust_name = cust_name;
		this.acc_balance = acc_balance;
		this.cust_email = cust_email;
	}


	private String cust_email;
	
	
	public ListOfCustomers() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAcc_num() {
		return acc_num;
	}


	public void setAcc_num(int acc_num) {
		this.acc_num = acc_num;
	}


	public String getCust_name() {
		return cust_name;
	}


	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}


	public double getAcc_balance() {
		return acc_balance;
	}


	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}


	public String getCust_email() {
		return cust_email;
	}


	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
}
