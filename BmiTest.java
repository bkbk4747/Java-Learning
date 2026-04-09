package solo_1;
import java.util.Scanner;
public class BmiTest {

	public static void main(String[] args) {
		float hei;
		float wei;
		float result;
		float height;
		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("키(cm)를 입력하시오: ");	
		hei = sc.nextFloat();
		
		
		System.out.print("몸무게(Kg)를 입력하시오: ");
		wei = sc.nextFloat();

		height = (hei/100)*(hei/100);
		
		result = wei/height;
		
		System.out.printf("당신의 bmi는 %.2f입니다\n" , result);
		if (result < 18.5) {
			System.out.println("당신은 저체중 입니다. 밥을 잘 챙겨드세요!");
		} else if (result < 23) {
			System.out.println("당신은 정상 입니다. 유지하세요!");
		} else if (result < 25) {
			System.out.println("당신은 과체중입니다. 근육량을 확인하고 운동을 하세요!");
		} else {
			System.out.println("당신은 비만입니다. 살을 빼세요!");
		}
		
	}

}
