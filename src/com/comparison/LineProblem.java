package com.comparison;

public class LineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Welcome to Line Comparison");
       
       int x1=5,x2=9,y1=5,y2=9;
		double length1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println(length1);
		int a1=5,a2=9,b1=5,b2=9;
		double length2=Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		System.out.println(length2);
		
		 Double d1=new Double(length1);
		    Double d2=new Double(length2);
		    String l1=d1.toString();
		    String l2=d2.toString();
		    
		    if(l2.equals(l1)) {
				System.out.println("equal");
			}else {
				System.out.println(" not equal");
			}
		
	}

}
