package ListasDobles;

public class ListaDoble {
    
    Nodo inicio = null;
    int length = 0;

    public class Nodo {
        
        int dato;
        Nodo siguiente = null;
        Nodo anterior = null;
    
        public Nodo(int dato) {
            this.dato = dato;
        }
    }

    public void push(int dato) {

        Nodo puntero = inicio;
        Nodo nuevoNodo = new Nodo(dato);
        length++;

        if(inicio == null) {
            inicio = nuevoNodo;
            return;
        }

        while(puntero.siguiente != null) {
            puntero = puntero.siguiente;
        }

        nuevoNodo.anterior = puntero;
        puntero.siguiente = nuevoNodo;
    }

    public void unshift(int dato) {
        Nodo puntero = inicio;
        Nodo nuevoNodo = new Nodo(dato);
        length++;
        
        if(inicio == null) {
            inicio = nuevoNodo;
            return;
        }

        puntero.anterior = nuevoNodo;
        nuevoNodo.siguiente = puntero;
        inicio = puntero.anterior;
    }

    public int pop() {
        Nodo puntero = inicio;
        int datoRetornado = -1;
        
        if(inicio == null) {
            System.out.println("No puedes extraer elemento de una lista vacia, ingresa datos!!");
            return datoRetornado;
        }else if(length == 1) {
            datoRetornado = inicio.dato;
            inicio = null;
            length--;
            return datoRetornado;
        }

        while(puntero.siguiente != null) {
            puntero = puntero.siguiente;
        }

        datoRetornado = puntero.dato;

        puntero = puntero.anterior;
        puntero.siguiente = null;

        length--;
        return datoRetornado;
    }

    public int shift() {
        Nodo puntero = inicio;
        int datoRetornado = -1;

        if(inicio == null) {
            System.out.println("No puedes extraer elemento de una lista vacia, ingresa datos!!");
            return datoRetornado;
        }else if(length == 1) {
            datoRetornado = inicio.dato;
            inicio = null;
            length--;
            return datoRetornado;
        }

        datoRetornado = inicio.dato;

        puntero = inicio.siguiente;
        puntero.anterior = null;
        
        inicio.siguiente = null;
        inicio = puntero;

        length--;
        return datoRetornado;
    }

    public void insert(int dato, int posicion) {
        Nodo nuevoNodo = new Nodo(dato);
        Nodo puntero = inicio;

        if(inicio == null) {
            inicio = nuevoNodo;
            return;
        }else if(posicion <= 0) {
            unshift(dato);
            return;
        }else if(posicion >= length-1) {
            push(dato);
            return;
        }

        for(int contador = 1; contador < length-1; contador++){
            puntero = puntero.siguiente;
            if(contador == posicion) {

                nuevoNodo.siguiente = puntero;
                nuevoNodo.anterior = puntero.anterior;

                puntero.anterior.siguiente = nuevoNodo;

                puntero.anterior = nuevoNodo;
                length++;
                return;
            }
        }
    }

    public int delete(int posicion) {
        Nodo puntero = inicio;
        int datoRetornado = -1;
        if(inicio == null) {
            System.out.println("No puedes eliminar elemento de una lista vacia, ingresa datos!!");
            return datoRetornado;
        }else if(posicion <= 0) {
            datoRetornado = shift();
            return datoRetornado;
        }else if(posicion >= length-1) {
            datoRetornado = pop();
            return datoRetornado;
        }

        for(int contador = 0; contador < length-1; contador++){
            puntero = puntero.siguiente;
            if(contador == posicion) {

                datoRetornado = puntero.dato;

                puntero.anterior.siguiente = puntero.siguiente;
                puntero.siguiente.anterior = puntero.anterior;

                puntero.siguiente = null;
                puntero.anterior = null;
                length--;
                return datoRetornado;
            }
        }

        return datoRetornado;
    }

    public void imprimir() {
        Nodo puntero = inicio;
        if(inicio == null) {
            System.out.println("No hay elementos en la lista");
            return;
        }

        while(puntero != null) {
            System.out.print(puntero.dato + " -> ");
            puntero = puntero.siguiente;
        }
        System.out.println();
    }

}
