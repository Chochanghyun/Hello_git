
public class Ex03 {

	public static void main(String[] args) throws InvalidWithdraw {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount(-100000); // 최저 잔고가 -100000인 은행계좌 생성
		ba.deposit(100000);
		ba.withdraw(100000);
		ba.withdraw(200000); // 500000원을 인출
	}

}
