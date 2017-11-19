import java.util.Date;
public class PrintTime implements Runnable {
	int num; //���� Ƚ�� �ʵ�
	
	public PrintTime(int num){ //������ ����
		this.num = num;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Date now = new Date(); //Date�� ��ü now����
	
		for(num = this.num; num>0; num--) { //���� Ƚ������ -1�� �ϸ鼭 for����
			System.out.println("����: " + Thread.currentThread().getPriority() + " " + now.toString() + " " + Thread.currentThread().getName());
			//������ �ð� ��� ������ �̸� ���
			try { //����ó��
				Thread.sleep(1000);
				now = new Date();
			} 
			catch (InterruptedException e) {
				System.err.println("InterruptedException�� �߻��Ǿ� �����带 �����մϴ�");
			}
		}
	}	
}
