/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**Diseño de mi aplicacion:
 */

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        ArrayList<String> palabras = new ArrayList();
        String palabra;
        Random r = new Random();
        boolean acierto = false;
        char[] Lista;
        int numAciertosJ1=0,numAciertosJ2=0;
        
        palabras.add("Calidad");
        palabras.add("Medicion");
        palabras.add("Software");
        palabras.add("Estimacion");
        palabras.add("Proceso");
        palabras.add("Desarrollo");
        
        int indice;
        while(jugador1.getNumAciertos()<2 && jugador2.getNumAciertos()<2){
            indice = r.nextInt(palabras.size());
            palabra = palabras.get(indice);
            Lista = palabra.toCharArray();
            
            for (int i=0; i<Lista.length; i++) {
                int posAleatoria = r.nextInt(Lista.length);
                char temp = Lista[i];
                Lista[i] = Lista[posAleatoria];
                Lista[posAleatoria] = temp;
            }
            
            System.out.println("Palabra desordenada a adivinar: " + Arrays.toString(Lista) + "\n");
            acierto = false;
            while(!acierto){
                
                System.out.println("Turno de " + jugador1.getNombre() + ": ");
                jugador1.Intento();
                if(jugador1.getPalabra().equals(palabra)){                   
                    numAciertosJ1++;
                    System.out.println(numAciertosJ1);
                    jugador1.setNumAciertos(numAciertosJ1);
                    System.out.println("Acierto");
                    acierto = true;
                }
                else
                    System.out.println("Fallo");
                if(!acierto){
                    System.out.println("Turno de " + jugador2.getNombre() + ": ");
                    jugador2.Intento();
                    if(jugador2.getPalabra().equals(palabra)){              
                        numAciertosJ2++;
                        jugador1.setNumAciertos(numAciertosJ2);
                        System.out.println("Acierto");
                        acierto = true;
                    }
                    else
                        System.out.println("Fallo");  
                }      
            }
        }
       if(jugador1.getNumAciertos()>jugador2.getNumAciertos())
            System.out.println("¡Enhorabuena " + jugador1.getNombre() + ", has ganado!");
       else
           System.out.println("¡Enhorabuena " + jugador2.getNombre() + ", has ganado!");
    }
}
