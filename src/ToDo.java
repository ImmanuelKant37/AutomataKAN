import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class ToDo {
private String palabra;
ArrayList<String> letras = new ArrayList<String>();
int cantidadLetras=0;
public int LetraNumero=0;
	public ToDo(String palabra){
		
		this.palabra= palabra;
		analizaPalabra();
		armaArreglos();
	}
	public void analizaPalabra(){
		cantidadLetras=palabra.length();
		for (int i = 0; i < cantidadLetras; i++) {
			String x=palabra.substring(i,i+1);
			letras.add(x);
			
		}
		for (int i = 0; i < cantidadLetras; i++) {

		}
	}
	 
	public void armaArreglos(){

	
	
		for (int i = 0; i < palabra.length(); i++) {
			
			
		}

	}
	public  void comparaLetras() throws AWTException{
		Robot robot= new Robot();
		LetrasRobot ana = new LetrasRobot();
		for(int i=0; i<cantidadLetras;i++){
			ana.letraT(letras.get(i).intern());
			LetraNumero=ana.letra;
			robot.keyPress(LetraNumero);
			robot.keyRelease(LetraNumero);
		try{
			
			
		}
			catch(Exception e){
				System.out.println(e.getLocalizedMessage());
			}
			
		}
		
	}

	@Override
	public String toString() {
		return palabra;
	}
	
}
