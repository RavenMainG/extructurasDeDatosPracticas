package Colas;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("1. Insertar");
        System.out.println("2. Extraer");
        System.out.println("3. Imprimir");
        System.out.println("4. Salir");
        System.out.println("Ingresa una opcion: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cola cola = new Cola();
        int opcionUsuario = 0;

        do {

            menu();
            opcionUsuario = sc.nextInt();

            switch(opcionUsuario) {
                case 1:
                    System.out.println("Ingresa el dato a insertar: ");
                    int dato = sc.nextInt();
                    cola.insertar(dato);
                    break;
                case 2:
                    int datoExtraido = cola.extraer();
                    if(datoExtraido != -1) {
                        System.out.println("El dato extraido es: " + datoExtraido);
                    }
                    break;
                case 3:
                    cola.imprimir();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }while(opcionUsuario != 4);

        sc.close();
        
    }
}
