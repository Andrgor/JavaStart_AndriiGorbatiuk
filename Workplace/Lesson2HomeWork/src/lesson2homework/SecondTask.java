package lesson2homework;

import java.lang.Math;

public class SecondTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 30;
		int c = 40;
		
		int p = (a + b + c) / 2;
		
		float s = (p * (p - a) * (p - b) * (p - c)); 
				
		System.out.println(Math.sqrt(s));
		
	}

}
