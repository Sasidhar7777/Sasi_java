package com.dl.one;

public class RegisterImpl extends Register {

	public static void main(String[] args) {
		RegisterImpl impl = new RegisterImpl();
		impl.setUserName("sasidhar");
		System.out.println(impl.getUserName());
		impl.setUserEmail("sasi@gmail.com");
		System.out.println(impl.getUserEmail());
		impl.setUserContact(9368527416l);
		System.out.println(impl.getUserContact());
		impl.setUserSalary(800000);
		System.out.println(impl.getUserSalary());
	}

}
