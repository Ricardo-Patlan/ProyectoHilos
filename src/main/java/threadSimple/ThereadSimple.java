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

    public ThereadSimple(String Name) {
        super(Name);
    }

  
    @Override
    public void run() {
        System.out.println("Se inicia el metodo Run del Hilo" + getName());
        for(int i = 0; i < 100; i++){
            System.out.println("hILO" + getName());
        }
        System.out.println("Hilo finalizado");
    }
    
    
}
