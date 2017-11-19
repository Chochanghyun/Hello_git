
public class PrimeNumber03 implements Runnable {
	int number; // 몇 번까지 소수 출력할지 필드
	String name; // 스레드 이름 필드
	
	public PrimeNumber03(int number, String name) { //생성자 구현
		this.number = number;
		this.name = name;
	}

	@Override
	public void run() { //run재정의 오버라이딩 해야함
		// TODO Auto-generated method stub
		int j;
		System.out.println(this.name + ":");
		for(int i = 2; i <= this.number; i++) { //2부터 number까지 반복
			for(j = 2; j < i; j++) {//2부터 i까지 반복하면서 소수 찾아내기
				if(i % j == 0) // 나누어 떨어지면 소수 x
					break;
			}
			if(j == i)
				System.out.print(j + " ");
		}
		
	}

}


