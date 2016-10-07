package hilos;

public class Hilo extends Thread {
	
	public String id;
	private boolean isAlive;
	private Apple apple;

	public boolean getAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public Hilo(String id, Apple discordApple){
		this.id=id;
		this.apple=discordApple;
	}
	
	public void run(){
		Numeros nums=new Numeros();
		
		while(isAlive && !nums.bloqueo){
			System.out.println(id + ": Estoy vivo!!!!!!");
			
			nums=apple.increment(this);
			
			
			
			System.out.println(id + ": cantidad= "+nums.cantidad);
			System.out.println(id + ": nuevaCantidad= "+nums.nuevaCantidad);
			
			if(nums.nuevaCantidad-nums.cantidad>2){
				System.out.println(id + ": Condicion de carrera!!");
			}
			
			/*try {
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		
		if(nums.bloqueo){
			System.out.println(id + ": Se tarda mucho... me voy!");
		}
		
		System.out.println(id + ": I'm dying!!!!!!");
	
	}

}
