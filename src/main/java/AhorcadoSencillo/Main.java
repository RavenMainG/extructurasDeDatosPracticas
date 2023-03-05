package AhorcadoSencillo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Declaracion de la estructura de datos
        ListaChar listaLetras = new ListaChar();
        ListaChar listaLetrasEncontradas = new ListaChar();

        int contadorIntentos = 4;
        String letraAdivinar;
        char letraBuscar;

        // Recibira las posiciones que van a cambiar
        int[] arregloPosiciones;
        
        System.out.println("Ingresa la palabra a adivinar:");
        letraAdivinar = leer.nextLine();

        for(int iterador = 0; iterador < letraAdivinar.length(); iterador++) {
            listaLetras.push(letraAdivinar.charAt(iterador));
            listaLetrasEncontradas.push('_');
        }

        System.out.println("Bienvenido a el ahorcado de daniel");
        System.out.println("solo tienes 4 oportunidades, en la ultima oportunidad puedes adivinar la palabra completa");

        while(contadorIntentos != 0) {

            if( contadorIntentos == 1) {
                System.out.println("Hija te queda solo un intento, puedes intentar adivinar la palabra completa, ingresa la palabra: ");
                String letraFinal = leer.nextLine();
                if(letraAdivinar.equals(letraFinal)) {
                    System.out.println("Has ganado hija!!");
                    return;
                }else {
                    System.out.println("Ala hija has perdido!!");
                    return;
                }
            }else if(listaLetrasEncontradas.toString().equals(letraAdivinar)) {
                System.out.println("Ala hija, ganaste!!");
                return;
            }else {
                System.out.println("Ingresa una letra para buscar:");
                letraBuscar = leer.nextLine().charAt(0);
    
                arregloPosiciones = listaLetras.buscarPosicionLetras(letraBuscar);
    
                if(arregloPosiciones == null) {
                    System.out.println("Chale esa letra no esta dentro de la palabra!!");
                    System.out.println();
                    listaLetrasEncontradas.imprimir();
                    System.out.println();
                    contadorIntentos --;
                }else {
    
                    System.out.println("Ala hija, la letra si estaba en la palabra!!");
    
                    for(int iterador = 0; iterador < arregloPosiciones.length; iterador++) {
                        listaLetrasEncontradas.cambiarValorPocision(arregloPosiciones[iterador], letraBuscar);
                    }
                    System.out.println();
                    listaLetrasEncontradas.imprimir();
                    System.out.println();
                }
            }






        }


        leer.close();
    }

}
