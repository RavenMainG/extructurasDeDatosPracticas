package ListasSimples;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("1. Agregar dato al inicio");
        System.out.println("2. Agregar dato al final");
        System.out.println("3. Extraer dato del inicio");
        System.out.println("4. Extraer dato del final");
        System.out.println("5. Mostrar datos");
        System.out.println("6. Salir");
        System.out.println("Ingresa una opcion: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaSimple lista = new ListaSimple();

        int opcionUsuario = 0;

        do {
            menu();
            opcionUsuario = sc.nextInt();
            switch(opcionUsuario) {
                case 1:
                    System.out.println("Ingresa el dato a agregar");
                    int dato = sc.nextInt();
                    lista.unshift(dato);
                    break;
                case 2:
                    System.out.println("Ingresa el dato a agregar");
                    dato = sc.nextInt();
                    lista.push(dato);
                    break;
                case 3:
                    int datoExtraido = lista.shift();
                    if(datoExtraido != -1) {
                        System.out.println("El dato extraido es: " + datoExtraido);
                    }
                    break;
                case 4:
                    datoExtraido = lista.pop();
                    if(datoExtraido != -1) {
                        System.out.println("El dato extraido es: " + datoExtraido);
                    }
                    break;
                case 5:
                    lista.imprimmir();
                    break;
                case 6:
                    System.out.println("saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
        }while(opcionUsuario != 6);
        sc.close();
    }
}
