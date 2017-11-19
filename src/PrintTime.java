import java.util.Date;
public class PrintTime implements Runnable {
	int num; //생성 횟수 필드
	
	public PrintTime(int num){ //생성자 생성
		this.num = num;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Date now = new Date(); //Date형 객체 now생성
	
		for(num = this.num; num>0; num--) { //생성 횟수에서 -1을 하면서 for루프
			System.out.println("순위: " + Thread.currentThread().getPriority() + " " + now.toString() + " " + Thread.currentThread().getName());
			//순위와 시간 출력 스레드 이름 출력
			try { //예외처리
				Thread.sleep(1000);
				now = new Date();
			} 
			catch (InterruptedException e) {
				System.err.println("InterruptedException이 발생되어 스레드를 종료합니다");
			}
		}
	}	
}
