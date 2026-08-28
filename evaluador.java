import java.util.Scanner;

public class Evaluador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double LIMITE_CATEGORIA_BAJA = 10000;
        final double LIMITE_CATEGORIA_MEDIA = 50000;

        double costoTotal = 0;
        int productosCategoriaAlta = 0;

        System.out.print("¿Cuántos productos ingresarán al lote? ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine();

        while (cantidadProductos < 0) {
            System.out.print("La cantidad no puede ser negativa. Ingrese una cantidad válida: ");
            cantidadProductos = scanner.nextInt();
            scanner.nextLine();
        }

        for (int indice = 1; indice <= cantidadProductos; indice++) {
            System.out.println("Producto " + indice);

            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = scanner.nextLine();

            System.out.print("Ingrese el costo base de " + nombreProducto + ": ");
            double costoBase = scanner.nextDouble();
            scanner.nextLine();

            costoTotal += costoBase;

            if (costoBase < LIMITE_CATEGORIA_BAJA) {
                System.out.println(nombreProducto + ": Categoría Baja");
            } else if (costoBase <= LIMITE_CATEGORIA_MEDIA) {
                System.out.println(nombreProducto + ": Categoría Media");
            } else {
                System.out.println(nombreProducto + ": Categoría Alta");
                productosCategoriaAlta++;
            }
        }

        if (cantidadProductos > 0) {
            double costoPromedio = costoTotal / cantidadProductos;

            System.out.println("\n--- Resumen del lote ---");
            System.out.println("Costo promedio del lote: $" + costoPromedio);
            System.out.println(
                "Cantidad de productos en Categoría Alta: "
                + productosCategoriaAlta
            );
        } else {
            System.out.println("No se ingresaron productos al lote.");
        }

        scanner.close();
    
    }
}
