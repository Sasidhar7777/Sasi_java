package com.dl.three;

 interface Parent {
	//static variables
	
	int a = 10;
	int b =20;
	public static final int c = 30;

}
 class Child implements Parent
{
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(Child.a);
		System.out.println(Child.b);
		System.out.println(Child.c);
		System.out.println(Parent.a);
		System.out.println(Parent.b);
		System.out.println(Parent.c);
	}
}
