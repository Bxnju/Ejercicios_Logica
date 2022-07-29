package logica_programacion;
import java.util.Scanner;
/******************************************************************************
EJERCICIO N°9 - LOGICA DE PROGRAMACION
ANDRES BENJUMEA REINOSO
000491320
*******************************************************************************/
public class Ejercicio_9 {
    public static void main(String[] args) {
        
        try {
            
            Scanner in = new Scanner(System.in);
            String nombre;
            int puntos;
            
            System.out.println("Bienvenido al sistema de premios realizado por Andres Benjumea. \n Para conocer que premios puede reclamar por favor, ingrese su nombre a continuacion:");
            nombre = in.nextLine();
            System.out.println("Perfecto " + nombre.toUpperCase() + ", ahora ingrese por favor la cantidad de puntos que posee:");
            puntos = in.nextInt();
            
            Premios(nombre, puntos);
            
            
        } catch (Exception e) {
            
            System.out.println("-----------Ha ocurido un error.-----------");
            
        }
        
    }
    
    static void Premios( String nombre, int puntos){
        try {
            
            if(puntos < 10000){
                System.out.println("Ups," + nombre.toUpperCase() + ", aun no tienes ningun premio por reclamar.");
            }else if(puntos >= 10000 && puntos < 20000){
                System.out.println(nombre.toUpperCase() + ", en el momento puedes reclamar solo la Gorra.");
            }else if(puntos >= 20000 && puntos < 30000){
                System.out.println(nombre.toUpperCase() + ", puedes reclamar en el momento: \n 1.Gorra \n 2.Morral o varios.");
            }else if(puntos >= 30000 && puntos < 40000){
                System.out.println(nombre.toUpperCase() + ", puedes reclamar en el momento: \n 1.Gorra \n 2.Morral \n 3.Camiseta o varios.");
            }else if(puntos >= 40000 && puntos < 50000){
                System.out.println(nombre.toUpperCase() + ", puedes reclamar en el momento: \n 1.Gorra \n 2.Morral \n 3.Camiseta \n 4.Sudadera o varios.");
            }else if(puntos >=50000){
                System.out.println(nombre.toUpperCase() + ", puedes reclamar cualquiera de los premios: \n 1.Gorra \n 2.Morral \n 3.Camiseta \n 4.Sudadera \n 5.Tennis o varios de ellos.");
            }
                    
        } catch (Exception e) {
            System.out.println("-----------Ha ocurido un error.-----------");
        }
    }
}
