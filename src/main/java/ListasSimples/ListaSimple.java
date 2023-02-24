package ListasSimples;

public class ListaSimple {
    

    Nodo inicio = null;

    public class Nodo {
        int dato;
        Nodo siguiente = null;

        public Nodo(int dato) {
            this.dato = dato;
        }
    }

    public void push(int dato) {
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

    public void unshift(int dato) {
        Nodo nuevoDato = new Nodo(dato);
        Nodo puntero = inicio;
        if(inicio == null) {
            inicio = nuevoDato;
            return;
        }

        nuevoDato.siguiente = puntero;
        inicio = nuevoDato;

    }

    public int pop() {
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

    public int shift() {
        Nodo puntero = inicio;

        if(inicio == null) {
            System.out.println("Debes de ingresar datos para poder extraer!!");
            return -1;
        }

        int datoExtraido = puntero.dato;

        inicio = puntero.siguiente;
        puntero.siguiente = null;
        return datoExtraido;
    }

    public void imprimmir() {
        Nodo puntero = inicio;

        if(inicio == null) {
            System.out.println("Debes de ingresar datos para poder extraer!!");
            return;
        }

        while(puntero != null) {
            puntero = puntero.siguiente;
            System.out.println(puntero.dato);
        }
    }

}
