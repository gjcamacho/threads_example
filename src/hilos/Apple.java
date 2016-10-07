package hilos;

public class Apple {
	
	public int qty=0;
	private boolean occupied;

	public Numeros increment(Hilo hilo)  {
		int contador=0;
		
		while(this.occupied){
			try {
				
				Thread.sleep(1);
				//System.out.println(hilo.id + ": Estoy bloqueado");
				contador++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(contador>50){
				Numeros nums=new Numeros();
				nums.bloqueo=true;
				System.out.println(hilo.id + ": Ya pasaron " + contador + " millisegundos y no me he ido!");
				return nums;
			}
		}
		
		this.occupied=true;
		
		Numeros nums=new Numeros();
		nums.cantidad=this.qty;
		
		this.qty++;
		
		nums.nuevaCantidad=this.qty;
		
		this.occupied=true;
		
		return nums;
		
	}
	
	

}
