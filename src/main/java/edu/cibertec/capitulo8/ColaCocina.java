package edu.cibertec.capitulo8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColaCocina extends Thread {

    public static List<Plato> atencion = new ArrayList<>();
    public static boolean cocinaAbierta = true; 

    @Override
    public void run() {
        while (cocinaAbierta)
        {
            try {
                System.out.println("----- Se están procesando los "
                        + "siguientes platos");
                atencion.stream().forEach(System.out::println);
                sleep(1000);
                
                Iterator<Plato> recorrer = atencion.iterator();
                while (recorrer.hasNext()) {
                    Plato plato = recorrer.next();
                    plato.setContadorSegundos(plato.getContadorSegundos()+1);
                    if (plato.getContadorSegundos()==plato.getDuracion())
                        recorrer.remove();
                }
            } catch (InterruptedException ex) {
                System.out.println("Algún problema con la cola");
            }
        }
    }
}
