package j26_쓰레드;

public class LoopThread extends Thread{

	private String threadName;
	
	public LoopThread(String threadName) {
		this.threadName = threadName;
	}
	
	// run 메소드가 꼭 있어야 함!
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(threadName + ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
