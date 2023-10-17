package src.products;
import java.util.Arrays;

public class ProductsArray {
    public void mostrarProductos() {
        String[] products = new String[20];

        //Productos
        products[0] = "Colgate";
        products[1] = "Leche entera";
        products[2] = "Leche deslactosada";
        products[3] = "Papel higiénico";
        products[4] = "Arroz";
        products[5] = "Aceite vegetal";
        products[6] = "Panela";
        products[7] = "Arepas de maíz";
        products[8] = "Mantequilla";
        products[9] = "Queso";
        products[10] = "Jamón";
        products[11] = "Espaguetis";
        products[12] = "Carne";
        products[13] = "Pollo";
        products[14] = "Shampoo";
        products[15] = "Jabón";
        products[16] = "Detergente";
        products[17] = "Atún";
        products[18] = "Tomates";
        products[19] = "Cebollas";

        //Método para mostrar los productos enumerados
        System.out.println("Lista de Productos:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }

        //Espacio en blanco
        System.out.println();

        //Muestra los productos ordenados alfabéticamente
        System.out.print("Lista de productos ordenados alfabéticamente: ");
        System.out.println();
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print("Productos que empiezan con '" + letter + "': ");
            for (String productsListAlphabetic : products) {
                if (productsListAlphabetic.toUpperCase().startsWith(String.valueOf(letter))) {
                    System.out.print(productsListAlphabetic + " ");
                }
            }

        }
    }
}
