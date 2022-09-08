package bl.com.circleprogram;

import java.util.Scanner;

public class Area {
	void menu() {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		do {
		System.out.println("Welcome to main menu "
				+ "\n1. Area And Perimeter of Circle");
				
		int choice = sc.nextInt();
		switch(choice) {
		case 1: areaAndCirclePriemeter();
		break;
		
		default :System.out.println("Please Enter valid option");
		
		}
		}while(!check);
	}
	
	private void areaAndCirclePriemeter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of Circle");
		double radius = sc.nextDouble();
		
		double area = Math.PI * radius * radius;
		double perimeter = 2 * Math.PI * radius;
		
		System.out.println("This is area of  Circle " + area);
		System.out.println("This id perimeter of Circle " + perimeter);
		
	}
	public static void main(String[] args) {
		Area area = new Area();
		area.menu();
	}
}
