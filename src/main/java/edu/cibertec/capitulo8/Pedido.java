package edu.cibertec.capitulo8;

import java.util.Scanner;

public class Pedido {

    public static void main(String[] args) throws InterruptedException {
        ColaCocina cola = new ColaCocina();
        cola.start();
        
        System.out.println("Ingrese el plato a preparar");
        System.out.println("1 - Lomo Saltado");
        System.out.println("2 - Aji de Gallina");
        System.out.println("3 - Frejol con seco");
        
        int numPlato = 1;
        while (numPlato > 0){
            Scanner consola = new Scanner(System.in);
            numPlato = consola.nextInt();
            switch (numPlato)
            {
                case 1:
                    cola.atencion.add(new Plato("Lomo Saltado", 5));
                    break;
                case 2:
                    cola.atencion.add(new Plato("Aji de gallina", 3));
                    break;
                case 3:
                    cola.atencion.add(new Plato("Frejol con seco", 2));
                    break;
            }
        }
        System.out.println("Ya no se reciben más pedidos !!!");
        //Esperamos 2 segundos para cerrar la cocina
        Thread.sleep(2000); //
        ColaCocina.cocinaAbierta = false;
    }
}
