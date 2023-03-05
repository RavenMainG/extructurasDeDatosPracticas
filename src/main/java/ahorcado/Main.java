package ahorcado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaPolimorfismo listaPalabras = new ListaPolimorfismo();

        ListaPolimorfismo listaPalabra = new ListaPolimorfismo();

        ListaPolimorfismo listaPalabraJugador = new ListaPolimorfismo();

        String palabraFinalJugador;

        ListaPolimorfismo index;

        int contadorOportunidades = 4;

        String letra;

        listaPalabras.push("politecnica");
        listaPalabras.push("gato");
        listaPalabras.push("mozart");
        listaPalabras.push("bethoven");

        String[] palabra = listaPalabras.get(3).toString().split("");
        String palabraFinal = listaPalabras.get(3).toString();

        for(int iterador = 0; iterador < palabra.length; iterador++) {
            listaPalabra.push(palabra[iterador]);
            listaPalabraJugador.push("_");
        }

        System.out.println("*********Bienvenido al juego del ahorcado*********");
        System.out.println("Reglas:\n1.- Tienes 3 oportunidades para introducir letra\n2.- Si no adivinas en esas tres oportunidades tienes una 4 oportunidad donde debes de adivinar la palabra completa\n3.- Si no logras adivinar en la 4 oportunidad pierdes");


        while(contadorOportunidades != 0) {
            System.out.println("Tienes " + contadorOportunidades + " oportunidades!!");

            listaPalabraJugador.print();

            System.out.println();
            System.out.println("Ingresa una letra: (a-z): ");
            letra = sc.nextLine();

            index = listaPalabra.find(letra);

            if(index.length == 0) {
                System.out.println("Upps, no hay ninguna letra \"" + letra + "\" en la palabra");
                contadorOportunidades--;
            }else {
                for(int contador = 0; contador < index.length; contador++) {
                    listaPalabraJugador.changueValue(letra, Integer.parseInt(index.get(contador).toString()));
                }
                System.out.println("Wow, has encontrado la letra \"" + letra + "\" en la palabra");
            }

            if(contadorOportunidades == 1) {
                System.out.println("Esta es tu oportunidad final, intenta adivinar la palabra completa: ");
                palabraFinalJugador = sc.nextLine();
                if(palabraFinalJugador.equals(palabraFinal)){
                    System.out.println("Felicidades has ganado!!");
                    return;
                }else {
                    System.out.println("Has perdido!!");
                }

            }

            if(palabraFinal.equals(listaPalabraJugador.toStrig())) {
                System.out.println("Felicidades has ganado!!");
                return;
            }
            
        }


        System.out.println("Has perdido!!");

        sc.close();
    }
}
