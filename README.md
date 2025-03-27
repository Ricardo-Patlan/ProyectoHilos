Este proyecto de Java demuestra el uso de hilos (threads) para ejecutar tareas concurrentes. A continuación te dare una explicacion de su funcionamiento de una manera que lo puedas entender 

Clases:

1. Hilos: Esta clase contiene el método main que crea y ejecuta dos instancias de la clase ThereadSimple, cada una con un nombre diferente ("juan" y "jose").
2. HilosR: Esta clase contiene el método main que crea y ejecuta cinco instancias de la clase RunnableSimple, cada una con un nombre diferente ("carrerfa de caballos 1" a "5").
3. RunnableSimple: Esta clase implementa la interfaz Runnable y define el método run() que se ejecuta cuando se crea un hilo. El método imprime mensajes en la consola y simula una tarea que dura un tiempo aleatorio.
4. ThereadSimple: Esta clase extiende la clase Thread y define el método run() que se ejecuta cuando se crea un hilo. El método imprime mensajes en la consola y simula una tarea que dura un tiempo determinado.

Funcionalidad:

 Las clases Hilos y HilosR demuestran cómo crear y ejecutar hilos utilizando las clases ThereadSimple y RunnableSimple, respectivamente.
 Las clases RunnableSimple y ThereadSimple definen tareas que se ejecutan de manera concurrente cuando se crean hilos.
 El proyecto muestra cómo utilizar la interfaz *Runnable* y la clase Thread para crear y ejecutar hilos en Java.

En resumen, este proyecto de Java demuestra el uso de hilos para ejecutar tareas concurrentes utilizando las clases RunnableSimple y ThereadSimple.
