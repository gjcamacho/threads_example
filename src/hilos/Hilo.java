package hilos;

public class Hilo extends Thread {
	
	private String id;
	private boolean isAlive;

	public boolean getAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public Hilo(String id){
		this.id=id;
	}
	
	public void run(){
		
		while(isAlive){
			System.out.println(id + ": Estoy vivo!!!!!!");
			try {
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(id + ": I'm dying!!!!!!");
		
	}

}
