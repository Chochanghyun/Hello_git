
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
		System.out.println("���� �Ա�ó��: �Աݱݾ�=" + money + ", �ܱ�=" + balance);
	}
	public void withdraw(int money) throws InvalidWithdraw { // withdraw()�� ���� ���� InvalidWithdraw�� �߻�
		if (money < 0)
			throw new InvalidWithdraw("���� �Է� ����ó�� �߻�");
		else if (balance - money < minBalance)
			throw new InvalidWithdraw("�����ܱ����� ���� ����ó�� �߻�");
		else {
			balance -= money;
			System.out.println("���� ���ó��: ����ݾ�=" + money + ", �ܱ�=" + balance);
		}
	}
}
