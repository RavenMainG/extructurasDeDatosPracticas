package Pilas;

public class Pilas {
    

    Nodo inicio = null;

    public class Nodo{
        int dato;
        Nodo siguiente = null;

        public Nodo(int dato) {
            this.dato = dato;
        }
    }

    public void insertar(int dato) {
        Nodo nuevoDato = new Nodo(dato);
        Nodo puntero = inicio;
        if(inicio == null) {
            inicio = nuevoDato;
            return;
        }

        while(puntero.siguiente != null) {
            puntero = puntero.siguiente;
        }

        puntero.siguiente = nuevoDato;

    }


    public int extraer() {
        Nodo puntero = inicio;
        int datoExtraido = -1;

        if(inicio == null) {
            System.out.println("Debes de ingresar datos para poder extraer!!");
            return datoExtraido;
        }

        while(puntero.siguiente.siguiente != null) {
            puntero = puntero.siguiente;

        }

        datoExtraido = puntero.siguiente.dato;
        puntero.siguiente = null;

        return datoExtraido;
    }

    public void imprimir() {
        Nodo puntero = inicio;

        if(inicio == null) {
            System.out.println("Debes de ingresar datos para poder imprimir!!");
            return;
        }

        while(puntero != null) {
            System.out.println(puntero.dato);
            puntero = puntero.siguiente;
        }

    }


}
