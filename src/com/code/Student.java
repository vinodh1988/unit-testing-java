package com.code;

public class Student {
 private  int sno;
 private  String name;
 private  String city; //instance variables
 public Student() {
	 
 }
 public Student(int sno,String name,String city) {
	 this.sno=sno;
	 this.name=name;
	 this.city=city;
 }

  void display() {
	  System.out.println("sno:"+sno+" name "+name+" city "
    +city);
  }

public int getSno() {
	return sno;
}

public void setSno(int sno) {
	this.sno = sno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
  
 
}

/*

there are four access specifiers in java

private -not accesible outside the class
public - accessible everywhere
default - behaves as public for the members of same package
          behaves as private for the members of different package
protected -
*/