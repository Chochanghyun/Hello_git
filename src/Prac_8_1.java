import java.util.*;

public class Prac_8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 0, z = 0;
		Scanner input = new Scanner(System.in); //입력받기
		try {//try문 
			System.out.println("정수 두 개 입력 : ");
			x = input.nextInt();
			y = input.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d %n", x, y, z);
		}
		catch(Exception e) { //예외가 발생하면 예외처리 발생 출력
			System.out.println("예외처리 발생");
		}
	}
}

