package org.cg.com;

import java.util.Scanner;

public class SumOfTwoNumbers {
	              static int Array(int a[],int tar) {
	              int sum=0;
	
		          for(int i=0;i<a.length;i++) {
			          sum =a[i]+a[i+1];
			           if(sum==tar) {
				          System.out.println(a[i]+","+a[i+1]);
				          System.out.println(i+","+(i+1));
			            }
			
		      }
		
		         return sum;
	
	
	}

		
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		int i = 0;
		try {
	      for( i=0;i<=a.length-1;i++) {
		      System.out.println("Enter Array Elements:");
		      a[i]=sc.nextInt();
		
	       }
	     for(i=0;i<=a.length;i++) {
		 System.out.print(" "+a[i]);
	      }
	}
		catch(Exception e) {
			
	
		}
		System.out.println();
		System.out.println("Enter the target:");
		int tar=sc.nextInt();
		
		int res=Array(a,tar);
		
	
	
		
		

	}

	

}
