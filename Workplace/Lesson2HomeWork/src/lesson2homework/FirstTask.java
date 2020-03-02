package lesson2homework;

import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please input five numbers and press Enter");
		int number = sc.nextInt();
		
		int number_first  = number%100000/10000;
		int number_second = number%10000/1000;
		int number_third  = number%1000/100;
		int number_fourth = number%100/10;
		int number_fifth  = number%10;
		
		System.out.println(number_first);
		System.out.println(number_second);
		System.out.println(number_third);
		System.out.println(number_fourth);
		System.out.println(number_fifth);
	}
}

