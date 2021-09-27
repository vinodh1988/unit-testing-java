package com.code;

public class Main {

	public static void main(String n[]) {
		Student obj=new Student();
		Student obj2=new Student();
		obj.setSno(1);
		obj2.setName("Lokesh");
		obj.display();
		obj2.display();
		/*obj.sno=1;
		obj.city="Bangalore";
		obj.name="Raj"; /*
		             by using reference it is not
		             recommended to access instance variables*/



	}

}

/* Any oop should support four features
   
   Encapsulation - Wrapping functions and data together as one unit
   Data abstraction/hiding
      - only the essential features should be allowed for access
      background implementation must be hidden
   
*/