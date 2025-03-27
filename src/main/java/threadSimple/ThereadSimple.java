/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadSimple;

/**
 *
 * @author ricar
 */
public class ThereadSimple extends Thread{

    @Override
    public void run() {
        System.out.println("Se inicia el metodo run del Hilo  :" + getName());
        for (int i = 0; i < 100; i++) {
            
           
            System.out.println("Hilo:"+ getName());
            
        }
        System.out.println("hilo finalizado" + getName());
    }

    public ThereadSimple(String name) {
        super(name);
    }
    
}
