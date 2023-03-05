package ahorcado;

public class ListaPolimorfismo {

    // Una nueva lista siempre tendra el inicio apuntando a null ya que nunca se a ingresado elementos o nodos
    Nodo inicio = null;
    int length = 0;

    public class Nodo {
        // declaracion de un dato tipo object, este permite almacenar cualquier tipo de dato en java ya sea primitivo o complejo
        Object dato;

        // Cuando se instancia un nuevo nodo el puntero siguiente no deberia de apuntar a algo, por lo que se asigna null a el puntero
        Nodo siguiente = null;

        // Constructior del nodo
        public Nodo(Object dato) {
            this.dato = dato;
        }

    }


    public void push(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);
        Nodo puntero = inicio;

        if(inicio == null) {
            inicio = nuevoNodo;
            length++;
            return;
        }

        while(puntero.siguiente != null) {
            puntero = puntero.siguiente;
        }

        puntero.siguiente = nuevoNodo;

        length++;

    }

    public String toStrig() {
        String string = "";

        Nodo puntero = inicio;

        while(puntero != null){
            string += puntero.dato.toString();
            // System.out.print(puntero.dato + " -> ");
            puntero = puntero.siguiente;
        }

        return string;

    }

    public void changueValue(Object nuevoDato, int posicion) {
        Nodo puntero = inicio;

        if(inicio == null) {
            System.out.println("Primero debes de ingresar elementos para poder obtener");
        }else if(posicion == 0) {
            inicio.dato = nuevoDato;
        }

        for(int contador = 0; contador < length; contador ++) {
            if(contador == posicion) {
                puntero.dato = nuevoDato;
                break;
            }
            puntero = puntero.siguiente;
        }
    }

    public ListaPolimorfismo find(Object dato) {
        Nodo puntero = inicio;
        ListaPolimorfismo index = new ListaPolimorfismo();

        if(inicio == null) {
            System.out.println("Primero debes de ingresar elementos para poder buscarlos");
            return index;
        }

        for(int contador = 0; contador < length; contador++) {
            if(dato.equals(puntero.dato)) {
                index.push(contador);
            }
            puntero = puntero.siguiente;
        }

        return index;

    }

    public Object get(int posicion) {
        Object datoObtenido = null;
        Nodo puntero = inicio;

        if(posicion > length - 1 || posicion < 0) {
            return datoObtenido;
        }

        if(inicio == null) {
            System.out.println("Primero debes de ingresar elementos para poder obtener");
            return datoObtenido;
        }else if(posicion == 0) {
            datoObtenido = inicio.dato;
            return datoObtenido;
        }

        for(int contador = 0; contador < length; contador ++) {
            if(contador == posicion) {
                datoObtenido = puntero.dato;
            }
            puntero = puntero.siguiente;
        }

        return datoObtenido;

    }

    public void print() {
        Nodo puntero = inicio;

        while(puntero != null){
            // System.out.print(puntero.dato + " -> ");
            System.out.print(puntero.dato +  " ");
            puntero = puntero.siguiente;
        }
    }

    public Object pop() {
        Object datoExtraido = null;
        Nodo puntero = inicio;

        if(inicio == null){
            System.out.println("Primero debes de ingresar elementos para poder extraer");
            return datoExtraido;
        }else if(length == 1) {
            datoExtraido = inicio.dato;
            inicio = null;
            length--;
            return datoExtraido;
        }

        while(puntero.siguiente.siguiente != null) {
            puntero = puntero.siguiente;
        }

        datoExtraido = puntero.siguiente.dato;
        puntero.siguiente = null;

        length--;

        return datoExtraido;
    }

}
