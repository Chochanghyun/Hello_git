
public class PrimeNumber03 implements Runnable {
	int number; // �� ������ �Ҽ� ������� �ʵ�
	String name; // ������ �̸� �ʵ�
	
	public PrimeNumber03(int number, String name) { //������ ����
		this.number = number;
		this.name = name;
	}

	@Override
	public void run() { //run������ �������̵� �ؾ���
		// TODO Auto-generated method stub
		int j;
		System.out.println(this.name + ":");
		for(int i = 2; i <= this.number; i++) { //2���� number���� �ݺ�
			for(j = 2; j < i; j++) {//2���� i���� �ݺ��ϸ鼭 �Ҽ� ã�Ƴ���
				if(i % j == 0) // ������ �������� �Ҽ� x
					break;
			}
			if(j == i)
				System.out.print(j + " ");
		}
		
	}

}


