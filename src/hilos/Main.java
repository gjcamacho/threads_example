package hilos;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args){
		Hilo hilo1 = new Hilo("1");
		Hilo hilo2 = new Hilo("2");
		
		Scanner sc=new Scanner(System.in);
		
		sc.nextLine();
		
		hilo1.setAlive(true);
		hilo1.start();
		
		sc.nextLine();
		
		hilo2.setAlive(true);
		hilo2.start();
		
		sc.nextLine();
		
		hilo1.setAlive(false);
		
		sc.nextLine();
		
		hilo2.setAlive(false);
		
		
	}

}
