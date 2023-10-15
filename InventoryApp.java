import java.util.Scanner;

public class InventoryApp {
    private Scanner scanner;

    public InventoryApp() {
        scanner = new Scanner(System.in);
    }

    private void displayMenu() {
        System.out.println("±----------------------------------------±");
        System.out.println("|   Administrador Mi Tienda de Barrio    |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar producto                      |");
        System.out.println("2. Eliminar producto                     |");
        System.out.println("3. Actualizar producto                   |");
        System.out.println("4. Ver todos los productos               |");
        System.out.println("5. Buscar Producto                       |");
        System.out.println("6. Generar Reporte                       |");
        System.out.println("7. Calcular Estadísticas                 |");
        System.out.println("8. Salir                                  |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 8)  ");
    }


    private void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Opción 1: Agregar Producto");
                break;
            case 2:
                System.out.println("Opción 2: Eliminar Producto");
                break;
            case 3:
                System.out.println("Opción 3: Actualizar Producto");
                break;
            case 4:
                System.out.println("Opción 4: Ver todos los Productos");
                break;
            case 5:
                System.out.println("Opción 5: Buscar producto");
                break;
            case 6:
                System.out.println("Opción 6: Generar reporte");
                break;
            case 7:
                System.out.println("Opción 7: Calcular estadísticas");
                break;
            case 8:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida. Por favor intenta de nuevo.");
        }
    }

    public void runMenu() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            handleUserChoice(choice);
        } while (choice != 8);
    }

}
