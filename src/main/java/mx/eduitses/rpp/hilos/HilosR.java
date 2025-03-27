/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.eduitses.rpp.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import mx.eduitses.rpp.hilos.Runnable.RunnableSimple;
import threadSimple.ThereadSimple;

/**
 *
 * @author ricar
 */
public class HilosR {
    
    public static void main(String[] args) {
        Runnable hilo = new Runnable(){
         @Override
    public void run() {
       System.out.println("Se inicia el metodo :" + Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
             try {
                Thread.sleep((long) (Math.random()*1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(ThereadSimple.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Hilo:"+ Thread.currentThread().getName());
            
        }
        System.out.println("hilo finalizado" + Thread.currentThread().getName());
    }
        };
        new Thread(new RunnableSimple("carrerfa de caballos 1")).start();
        new Thread(new RunnableSimple("carrerfa de caballos 2")).start();
        new Thread(new RunnableSimple("carrerfa de caballos 3")).start();
        new Thread(new RunnableSimple("carrerfa de caballos 4")).start();
        new Thread(new RunnableSimple("carrerfa de caballos 5")).start();

    }
    
}
