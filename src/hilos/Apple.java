package hilos;

public class Apple {
	
	public int qty=0;
	private boolean occupied;

	public Numeros increment(Hilo hilo)  {
		
		while(this.occupied){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.occupied=true;
		
		Numeros nums=new Numeros();
		nums.cantidad=this.qty;
		
		this.qty++;
		
		nums.nuevaCantidad=this.qty;
		
		this.occupied=false;
		
		return nums;
		
	}
	
	

}
