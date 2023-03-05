package AhorcadoSencillo;

public class ListaChar {
    
    Nodo inicio = null;
    int length = 0;

    public class Nodo {
        char letra;
        Nodo siguiente = null;

        public Nodo(char letra) {
            this.letra = letra;
        }

    }

    public String toString() {
        Nodo puntero = inicio;
        String palabra = "";

        while(puntero != null) {

            palabra += puntero.letra;

            puntero = puntero.siguiente;
        }

        return palabra;
    }

    public void cambiarValorPocision(int posicion, char letra) {
        Nodo puntero = inicio;

        for(int contador = 0; contador < length; contador++){
            if(contador == posicion) {
                puntero.letra = letra;
            }

            puntero = puntero.siguiente;
        }
    }

    public int[] buscarPosicionLetras(char letra) {
        Nodo puntero = inicio;
        int contadorApariciones = 0;
        int[] arregloPosiciones = null;

        // buscar cuantas veces aparece la letra
        while(puntero != null) {
            if(letra == puntero.letra) {
                contadorApariciones++;
            }
            puntero = puntero.siguiente;
        }

        if(contadorApariciones == 0) {
            return arregloPosiciones;
        }

        arregloPosiciones = new int[contadorApariciones];
        contadorApariciones = 0;
        puntero = inicio;


        for(int contador = 0; contador < length; contador++) {
            if(letra == puntero.letra) {
                arregloPosiciones[contadorApariciones] = contador;
            }
            puntero = puntero.siguiente;
        }

        return arregloPosiciones;

    }

    public void push(char letra) {
        Nodo nuevoNodo = new Nodo(letra);
        Nodo puntero = inicio;

        if(inicio == null) {
            inicio = nuevoNodo;
            length++;
            return;
        }

        while(puntero.siguiente != null) {
            puntero = puntero.siguiente;
        }

        length++;
        puntero.siguiente = nuevoNodo;

    }

    public void pop() {

        Nodo puntero = inicio;

        if(inicio == null) {
            System.out.println("Debes de ingresar datos para poder eliminar!!");
            return;
        }else if(length == 1) {
            inicio = null;
            length--;
            return;
        }

        while(puntero.siguiente.siguiente != null) {
            puntero = puntero.siguiente;
        }

        puntero.siguiente = null;
        length--;
        return;
    }

    public void imprimir() {
        Nodo puntero = inicio;
        while(puntero != null){

            System.out.print(puntero.letra + " ");

            puntero = puntero.siguiente;
        }
    }

}
