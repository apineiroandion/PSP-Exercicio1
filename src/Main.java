import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    /**
    * Metodo que muestra La memoria total, la memoria libre y
    *  la memoria en uso expresados en MiB.
    */
    public static void mostrarMemoria() {
        Runtime run = Runtime.getRuntime();
        long memoriaTotal = run.totalMemory();
        long memoriaLibre = run.freeMemory();
        long memoriaEnUso = memoriaTotal - memoriaLibre;
        System.out.println("Memoria total: " + memoriaTotal / 1024 / 1024 + " MiB");
        System.out.println("Memoria libre: " + memoriaLibre / 1024 / 1024 + " MiB");
        System.out.println("Memoria en uso: " + memoriaEnUso / 1024 / 1024 + " MiB");
    }
    /**
     * Metodo que muestra El número de procesadores disponibles para la JVM.
     */
    public static void mostrarProcesadores() {
        System.out.println("Numero de procesadores: " + Runtime.getRuntime().availableProcessors());
    }
    /**
     * Metodo que muestra Las propiedades de la clase System y sus valores.
     */
    public static void mostrarPropiedades() {
        System.getProperties().list(System.out);
    }
    /**
     * Menu recursivo que muestra las opciones disponibles y permite al usuario elegir que metodo ejecutar
     */
    public static void menu() {
        System.out.println("1. Mostrar memoria");
        System.out.println("2. Mostrar procesadores");
        System.out.println("3. Mostrar propiedades");
        System.out.println("4. Salir");
        System.out.print("Opcion: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                mostrarMemoria();
                break;
            case 2:
                mostrarProcesadores();
                break;
            case 3:
                mostrarPropiedades();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        menu();
    }
}
