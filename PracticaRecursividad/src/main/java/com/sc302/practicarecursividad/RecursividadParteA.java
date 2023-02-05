/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc302.practicarecursividad;

/**
 *
 * @author valed
 */
class RecursividadParteA {
    public void main() {
        int contador = 5;
        String oracion="hoy toca una practica semanal grupal";
        for (int x = 0; x < contador; x++){
            if (x == 0){
                        System.out.println("La oracion removiendo la vocal: a");
                        String newOracion = oracion.replace("a","");
                        System.out.println(newOracion);
            }else if(x == 1){
                        System.out.println("La oracion removiendo la vocal: e");
                        String newOracion = oracion.replace("a","");
                        String newOracion2 = newOracion.replace("e","");
                        System.out.println(newOracion2);
            }else if(x == 2){
                        System.out.println("La oracion removiendo la vocal: i");
                        String newOracion = oracion.replace("a","");
                        String newOracion2 = newOracion.replace("e","");
                        String newOracion3 = newOracion2.replace("i","");
                        System.out.println(newOracion3);   
            }else if(x == 3){
                        System.out.println("La oracion removiendo la vocal: o");
                        String newOracion = oracion.replace("a","");
                        String newOracion2 = newOracion.replace("e","");
                        String newOracion3 = newOracion2.replace("i","");
                        String newOracion4 = newOracion3.replace("o","");
                        System.out.println(newOracion4);
            }else if(x == 4){
                        System.out.println("La oracion removiendo la vocal: u");
                        String newOracion = oracion.replace("a","");
                        String newOracion2 = newOracion.replace("e","");
                        String newOracion3 = newOracion2.replace("i","");
                        String newOracion4 = newOracion3.replace("o","");
                        String newOracion5 = newOracion4.replace("u","");
                        System.out.println(newOracion5);
            }
        }
    }  
}
