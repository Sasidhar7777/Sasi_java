package com.dl.four;

//method over riding

class RBI
{
	public int getrateofin()
	{
		return 0;
	}
}
class SBI extends RBI
{
	public int getrateofin()
	{
		return 2;
	}
}
class AXIS extends RBI
{
	public int getrateofin()
	{
		return 3;
	}
}
class ICICI extends SBI
{
	public int getrateofin()
	{
		return 4;
	}
}


public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi = new SBI();
		System.out.println(sbi.getrateofin());
		AXIS axis = new AXIS();
		System.out.println(axis.getrateofin());
		ICICI icici = new ICICI();
		System.out.println(icici.getrateofin());

	}

}
