package j26_쓰레드;

public class ThreadTest {

	public static void main(String[] args) {
		LoopThread loopThread1 = new LoopThread("김삼겹");
		LoopThread loopThread2 = new LoopThread("박김치");
		LoopThread loopThread3 = new LoopThread("이무쇠");
		LoopThread loopThread4 = new LoopThread("홍길동");
		
		loopThread1.setPriority(6);
		loopThread4.setPriority(Thread.MAX_PRIORITY);
		System.out.println(loopThread1.getPriority()); // 출력값: 6
		System.out.println(loopThread2.getPriority()); // 출력값: 5
		System.out.println(loopThread3.getPriority()); // 출력값: 5
		System.out.println(loopThread4.getPriority()); // 출력값: 10
		
		loopThread1.start();
		loopThread2.start();
		loopThread3.start();
		loopThread4.start();
	}
}
