/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Jugador {
    private String palabra;
    private int numaciertos;
    private String nombre;
    
    public Jugador(String nom){
        this.palabra = "";
        this.numaciertos = 0;
        this.nombre = nom;
    }
    public void setNumAciertos(int numA){
        this.numaciertos = numA;
    }
    public String getPalabra(){
        return this.palabra;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getNumAciertos(){
        return this.numaciertos;
    }
    
    public String Intento(){
        System.out.println("Introduzca una palabra: ");
        Scanner leer = new Scanner(System.in);
        palabra = leer.next();
        return palabra;
    }

}
