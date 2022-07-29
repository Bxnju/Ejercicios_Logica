package logica_programacion;

import java.util.Scanner;
    /******************************************************************************
EJERCICIO N°8 - LOGICA DE PROGRAMACION
ANDRES BENJUMEA REINOSO
000491320
*******************************************************************************/
public class Ejercicio_8 {
    
    public static void main(String[] args) {
        try {
            
            Scanner in = new Scanner(System.in);
            String letra, letraM;
            
            System.out.println("Bienvenido al sistema de notas hecho por Andres Benjumea. \n Por favor, ingrese la letra correspondiente a la calificacion cualitativa del estudiante. \n Recuerde que: \n'E' es para Excelente, como la nota mas alta. \n'B' es para Bueno.  \n'R' es para Regular. \n'M' es para Malo. \n'D' es para deficiente, como la nota mas baja. ");
            letra = in.nextLine();
            letraM = letra.toUpperCase();
            
            if("E".equals(letraM) || "B".equals(letraM) || "R".equals(letraM) || "M".equals(letraM) || "D".equals(letraM)){
                System.out.println(Calificacion(letraM));
            }else{
                System.out.println("Ingresaste un numero o letra erronea");
            }
            
            
        } catch (Exception e) {
            
            System.out.println("Error.");
            
        }
    }
    
    static String Calificacion(String letra){
        try {
            
            String calificacion = "";
            float nota1 = 3, nota2 = 5, nota3 = 2, notaC = 0, promedio;
            
            switch(letra){
                case "E":
                case "e":
                    calificacion = "Excelente";
                    notaC = 5;
                    break;
                case "B":
                case "b":
                    calificacion = "Buena";
                    notaC = 4;
                    break;
                case "R":
                case "r":
                    calificacion = "Regular";
                    notaC = 3;
                    break;
                case "M":
                case "m":
                    calificacion = "Mala";
                    notaC = 2;
                    break;
                case "D":
                case "d":
                    calificacion = "Deficiente";
                    notaC = 1;
                    break;
                default: System.out.println("No se que letra ingreso.");
            }
            
            promedio = (nota1 + nota2 + nota3 + notaC) / 4;
            
            return "Entendido, su promedio final es de: " + promedio + " con una " + calificacion + " nota en la calificacion cualitativa.";
            
        } catch (Exception e) {
            
            return "Error Fatal en el Sistema.";
            
        }
    }
    
}
