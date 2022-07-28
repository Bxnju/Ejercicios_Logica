package logica_programacion;
import java.util.Scanner;
    /******************************************************************************
EJERCICIO N°7 - LOGICA DE PROGRAMACION
ANDRES BENJUMEA REINOSO
000491320
*******************************************************************************/

public class Ejercicio_7 {
	public static void main(String[] args) {
	    
	    try {
	        
	        Scanner in = new Scanner(System.in);
	        byte entrada, plato, bebida;
	        
	        System.out.println("Bienvenido al restaurante Benjumea. Elija su comida ingresando el numero de lo que desea.");
	      	
	      	System.out.println("Entradas: \n 1. Ceviche \n 2. Crema \n 3. Patacon");
	        entrada = in.nextByte();
	        
	        while(entrada <= 0 || entrada > 3){
	            System.out.println("Opcion invalida. Has ingresado " + entrada + " en vez de las opciones disponibles.\n Por favor, vuelva a ingresar la opcion");
	            entrada = in.nextByte();
	        }
	        
	        System.out.println("Platos Fuertes: \n 1. Pollo \n 2. Carne \n 3. Pescado");
	        plato = in.nextByte();
	        
	        while(plato <= 0 || plato > 3){
	            System.out.println("Opcion invalida. Has ingresado " + plato + " en vez de las opciones disponibles.\n Por favor, vuelva a ingresar la opcion");
	            plato = in.nextByte();
	        }
	        
	        System.out.println("Bebidas: \n 1. Cerveza \n 2. Jugo \n 3. Gaseosa");
	        bebida = in.nextByte();
	        
	        while(bebida <= 0 || bebida > 3){
	            System.out.println("Opcion invalida. Has ingresado " + bebida + " en vez de las opciones disponibles.\n Por favor, vuelva a ingresar la opcion");
	            bebida = in.nextByte();
	        }
	        
	        System.out.println(Menu(entrada, plato, bebida));
	        
	    } catch(Exception e) {
	        System.out.println("Wow, ha ocurrido un error.");
	    }
	}

	
	static String Menu(byte entrada, byte plato, byte bebida){
	    
	    try {
	        
	        String entradaT, platoT, bebidaT;
	    
    	    switch(entrada){
    	        case 1: entradaT = "Ceviche"; break;
    	        case 2: entradaT = "Crema"; break;
    	        case 3: entradaT = "Patacon"; break;
    	        default: entradaT = "Al parecer ingresaste un dato erroneo";
    	    }
    	    
    	    switch(plato){
    	        case 1: platoT = "Pollo"; break;
    	        case 2: platoT = "Carne"; break;
    	        case 3: platoT = "Pescado"; break;
    	        default: platoT = "Al parecer ingresaste un dato erroneo";
    	    }
    	    
    	    switch(bebida){
    	        case 1: bebidaT = "Cerveza"; break;
    	        case 2: bebidaT = "Jugo"; break;
    	        case 3: bebidaT = "Gaseosa"; break;
    	        default: bebidaT = "Al parecer ingresaste un dato erroneo";
    	    }
    	    
    	    return "Todo ha salido bien! \n El menu elegido por ti fue: \n 1. Entrada: " + entradaT + "\n 2. Plato Fuerte: " + platoT + " \n 3. Bebida: " + bebidaT;
	        
	    } catch(Exception e) {
	        return "Error";
	    }
	    
	}
}

