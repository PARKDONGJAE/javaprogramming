package javastudy200;

public class Myrun implements Runnable{
	public void run() {
		show();
	}
	public void show() {
		for(int i =0;i<500;i++) {
			System.out.println("S");
		}
	}
}
