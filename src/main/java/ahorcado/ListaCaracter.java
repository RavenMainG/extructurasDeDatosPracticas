package ahorcado;

public class ListaCaracter {
    
    Nodo inicio = null;
    int length = 0;

    public class Nodo {
        char dato;

        Nodo siguiente = null;

        public Nodo(char dato) {
            this.dato = dato;
        }

    }

    public void push(char dato) {
        Nodo nuevoDato = new Nodo(dato);


        if(inicio == null) {
            inicio = nuevoDato;
            length++;
            return;
        }

        Nodo puntero = inicio;

        while(puntero.siguiente != null) {
            puntero = puntero.siguiente;
        }

        puntero.siguiente = nuevoDato;
        length++;
        return;
    }

    public int pop() {

        char datoEliminado = '.';
        Nodo puntero = inicio;

        if(inicio == null) {
            System.out.println("Nececitas ingresar datos para poder eliminar elementos de la lista!!");
            return datoEliminado;
        }

        if(length == 1) {
            datoEliminado = inicio.dato;
            inicio = null;
            length--;
            return datoEliminado;
        }

        while( puntero.siguiente.siguiente != null) {
            puntero = puntero.siguiente;
        }

        datoEliminado = puntero.siguiente.dato;

        puntero.siguiente = null;

        length--;

        return datoEliminado;
    }

    public void vaciar() {
        inicio = null;
        return;
    }

}
