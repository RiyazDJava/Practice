package com.app;

public class Polyndrom {
	public static void main(String[] args) {
		String orginal="riyaz";
		String rev="";
		for(int i=orginal.length()-1;i>=0;i--) {
			rev=rev+orginal.charAt(i);

		}if(orginal.equals(rev)) {
			System.out.println("polyndrom");

		}else {
			System.out.println("not polyndrom");
		}
	}

}
