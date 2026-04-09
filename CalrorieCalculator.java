package solo_2;

import java.util.Scanner;

public class CalrorieCalculator {

	public static void main(String[] args) {x
		double dis;
		int num;
		double result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("얼마나 뛰셨나요?(km): ");
		dis = sc.nextDouble();
		
		System.out.print("이번 주에 몇 번 뛰셨나요?: ");
		num = sc.nextInt();
		
		result = dis*75.0*num;
		System.out.printf("당신은 이번주에 총 %.1f칼로리를 소모하셨습니다" ,result);
		

	}

}
