import java.util.*;

public class Prac_8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 0, z = 0;
		Scanner input = new Scanner(System.in); //�Է¹ޱ�
		try {//try�� 
			System.out.println("���� �� �� �Է� : ");
			x = input.nextInt();
			y = input.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d %n", x, y, z);
		}
		catch(Exception e) { //���ܰ� �߻��ϸ� ����ó�� �߻� ���
			System.out.println("����ó�� �߻�");
		}
	}
}

