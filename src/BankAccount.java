
public class BankAccount {
	int minBalance;
	int balance;
	public BankAccount() {
		
	}
	public BankAccount(int minBalance){
		this.minBalance = minBalance;
	}
	
	public void deposit(int money){
		balance += money;
		System.out.println("정상 입금처리: 입금금액=" + money + ", 잔금=" + balance);
	}
	public void withdraw(int money) throws InvalidWithdraw { // withdraw()는 새로 만든 InvalidWithdraw를 발생
		if (money < 0)
			throw new InvalidWithdraw("음수 입력 예외처리 발생");
		else if (balance - money < minBalance)
			throw new InvalidWithdraw("최저잔금이하 인출 예외처리 발생");
		else {
			balance -= money;
			System.out.println("정상 출금처리: 인출금액=" + money + ", 잔금=" + balance);
		}
	}
}
