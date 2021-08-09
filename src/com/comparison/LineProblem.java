package com.comparison;

public class LineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Welcome to Line Comparison");
       
       int x1=5,x2=9,y1=5,y2=9;
		double length1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println(length1);
		int a1=12,a2=6,b1=12,b2=5;
		double length2=Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		System.out.println(length2);
		
		Double d1=new Double(length1);
	    Double d2=new Double(length2);
	    String l1=d1.toString();
	    String l2=d1.toString();
	    
		if(l2.equals(l1)) {
			System.out.println("equal");
		}else {
			System.out.println(" not equal");
		}
		
		System.out.println(l1.compareTo(l2));
		if(length1>length2) {
			System.out.println("length1 is greater than length2 ");
		}else if(length1<length2){
			System.out.println("length1 is smaller than length2 ");
		}else {
			System.out.println("length1 equals to length2 ");
		}
		
	}

}
