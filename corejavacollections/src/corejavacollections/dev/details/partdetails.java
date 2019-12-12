package corejavacollections.dev.details;

import java.util.ArrayList;

public class partdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String arr[] = {"abhi","chandhu","anvitha","reddy"};
	
	for(String arr1:arr) {
		
		System.out.print(arr1);
	}
	
	ArrayList<Integer> clist = new ArrayList<>();
	for(int i=0; i<=9; i++ )
	{
       clist.add(i);
       for(int j=0;j<i;j++) {
       System.out.println(j);
       }
       
	}

  }
}
