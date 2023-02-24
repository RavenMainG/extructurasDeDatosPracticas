package ListasDobles;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("1.- Agregar elemento al final de la lista");
        System.out.println("2.- Agregar elemento al inicio de la lista");
        System.out.println("3.- Extraer elemento del final de la lista");
        System.out.println("4.- Extraer elemento del inicio de la lista");
        System.out.println("5.- Agregar elementos en una posicion especifica");
        System.out.println("6.- Eliminar elementos en una posicion especifica");
        System.out.println("7.- Imprimir lista");
        System.out.println("8.- Salir");
        System.out.println("Ingresa una opcion: ");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaDoble lista = new ListaDoble();
        int opcionUsuario = 0;

        int dato, posicion, elementoExtraido;

        do{

            menu();
            opcionUsuario = sc.nextInt();

            switch(opcionUsuario) {
                case 1:
                    System.out.println("Ingresa el elemento a agregar: ");
                    dato = sc.nextInt();
                    lista.push(dato);
                    break;
                case 2:
                    System.out.println("Ingresa el elemento a agregar: ");
                    dato = sc.nextInt();
                    lista.unshift(dato);
                    break;
                case 3:
                    elementoExtraido = lista.pop();
                    if(elementoExtraido != -1) {
                        System.out.println("El elemento extraido es: " + elementoExtraido);
                    }
                    break;
                case 4:
                    elementoExtraido = lista.shift();
                    if(elementoExtraido != -1) {
                        System.out.println("El elemento extraido es: " + elementoExtraido);
                    }
                    break;
                case 5:
                    System.out.println("Ingresa el elemento a agregar: ");
                    dato = sc.nextInt();
                    System.out.println("Ingresa la posicion donde se agregara el elemento: ");
                    posicion = sc.nextInt();
                    lista.insert(dato, posicion);
                    break;
                case 6:
                    System.out.println("Ingresa la posicion del elemento a eliminar: ");
                    posicion = sc.nextInt();
                    int elementoEliminado = lista.delete(posicion);
                    if(elementoEliminado != -1) {
                        System.out.println("El elemento eliminado es: " + elementoEliminado);
                    }
                    break;
                case 7:
                    lista.imprimir();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcionUsuario != 8);

        sc.close();
    }
}
