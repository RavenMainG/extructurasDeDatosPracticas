package Colas;

public class Cola {
    
    Nodo inicio = null;
    int length = 0; 

    public class Nodo{
        int dato;
        Nodo siguiente = null;

        public Nodo(int dato) {
            this.dato = dato;
        }
    }


    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        Nodo puntero = inicio;
        if (inicio == null) {
            inicio = nuevoNodo;
            length ++;
            return;
        }

        // Los elementos ingresados en la cola van hasta el final
        while(puntero.siguiente != null) {
            puntero = puntero.siguiente;
        }
        length++;
        puntero.siguiente = nuevoNodo;
        return;
    }

    // 1, 2, 4, 5, 6

    public int extraer() {
        int datoExtraido = -1;
        Nodo puntero = inicio;
        if(inicio == null) {
            System.out.println("Primero debes de ingresar valores para poder extraer datos!!");
            return datoExtraido;
        }else if(inicio.siguiente == null) {
            datoExtraido = inicio.dato;
            inicio = null;
            return datoExtraido;
        }

        puntero = puntero.siguiente;
        datoExtraido = inicio.dato;
        inicio.siguiente = null;
        inicio = null;
        inicio = puntero;

        return datoExtraido;

    }

    public void imprimir() {
        Nodo puntero = inicio;
        if(inicio == null) {
            System.out.println("No hay datos para imprimir");
            return;
        }
        while(puntero != null) {
            System.out.println("Dato: " + puntero.dato);
            puntero = puntero.siguiente;
        }
    }

}
