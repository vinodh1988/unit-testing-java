package com.code;

public class Group {
   private int groupid;  //instance variables
   private static int groupcount;  //class variables
   
   public Group(){
	   groupid=++groupcount;
   }
   public static int getGroupCount() {
	   return groupcount;
   }
   
   public  int getGroupId() {
	   return groupid;
   }
}

/*
 *in a static context we cannot access instance members
 *that is non static members 

  in a non static context can access both static and
  non static members
   
*/

