package logger;

import java.util.concurrent.TimeUnit;

public class TestOperation {

	static logger log = new logger();
	
	public static void main(String[] args) throws InterruptedException {
		
		log.setLogLevel(4);
		
		TimeUnit.SECONDS.sleep(1);
		moveForward();
		TimeUnit.SECONDS.sleep(1);
		turn();
		TimeUnit.SECONDS.sleep(2);
		shoot();
		
		log.write();


	}
	
	public static void moveForward() {
		 
		int opLevel = 4;
		String name = "moveForward";
		double time = System.currentTimeMillis();
		
		//does da thing
		
		log.add(name, opLevel, time);
		
	}
	
	public static void turn() {
		 
		int opLevel = 3;
		String name = "turn";
		double time = System.currentTimeMillis();
		
		//does da thing
		
		log.add(name, opLevel, time);
		
	}
	
	public static void shoot() {
		 
		int opLevel = 1;
		String name = "shoot";
		double time = System.currentTimeMillis();
		
		//does da thing
		
		log.add(name, opLevel, time);
		
	}

}
