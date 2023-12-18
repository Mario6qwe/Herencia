/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

import java.util.Scanner;
/**
 *
 * @author labctr
 */
public class Herencia {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese el valor del radio");
        double radio;
        radio=leer.nextDouble();
        Circulo circulo1=new Circulo(radio);
        System.out.println("El area del circulo es: "+circulo1.CalcularArea());
        
        System.out.println("Ingrese el valor de la altura: ");
        double altura;
        altura=leer.nextDouble();
        System.out.println("Ingrese valor de la base: ");
        double base;
        base=leer.nextDouble();
        Triangulo triangulo1=new Triangulo(base,altura);
        System.out.println("El aréa del trinagulo es: "+triangulo1.CalcularArea());
        
    }
}