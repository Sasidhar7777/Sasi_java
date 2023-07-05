package com.dl.one;

public class Profile {
	
	//instace variable
	
	public String userName;
	public String userEmail;
	public long userContact;
	public double userSalary;
	public String userAddress;
	
	public Profile(String userName,String userEmail,long userContact,double userSalary,String userAddress)
	{
	this.userName= userName;
	this.userEmail=userEmail;
		this.userContact=userContact;
		this.userSalary= userSalary;
		this.userAddress=userAddress;
		
	}
	public void display()
	{
		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(userContact);
		System.out.println(userSalary);
		System.out.println(userAddress);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Profile p = new Profile("sasi","sasi@gmail.com",6304838372l,80000.00,"hyd");
		p.display();

	}

}
