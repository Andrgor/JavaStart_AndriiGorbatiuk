package lesson2homework;

import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please input a value of a circle radius and press Enter");
		
		int radius = sc.nextInt();
		
		double s = 2 * Math.PI * radius; 
		
		System.out.println(s);
	
	}

}
