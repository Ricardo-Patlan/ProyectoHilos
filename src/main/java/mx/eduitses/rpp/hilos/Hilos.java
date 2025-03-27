/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.eduitses.rpp.hilos;

import threadSimple.ThereadSimple;

/**
 *
 * @author ricar
 */
public class Hilos {

    
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new ThereadSimple("juan");
        hilo.start();
        System.out.println(hilo.getState());

        
        Thread hilo2 = new ThereadSimple("jose");
        hilo2.start();

    }
}
