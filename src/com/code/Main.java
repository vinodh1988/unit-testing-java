package com.code;

public class Main {
	
	public static void main(String n[]) {
		Student obj=new Student();
		obj.sno=1;
		obj.city="Bangalore";
		obj.name="Raj"; /* 
		             by using reference it is not
		             recommended to access instance variables*/
		          
		
		obj.display();
	}

}
