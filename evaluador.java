import java.util.Scanner; 
 
public class Evaluador { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        int cantidadProductos; 
        int productosCategoriaAlta = 0; 
 
        final double LIMITE_CATEGORIA_BAJA = 10000; 
        final double LIMITE_CATEGORIA_MEDIA = 50000; 
 
        System.out.print("¿Cuántos productos desea evaluar? "); 
        cantidadProductos = scanner.nextInt(); 
 
        for (int indice = 1; indice <= cantidadProductos; indice++) { 
            System.out.print("Digite el precio del producto " + indice + ": "); 
            double precio = scanner.nextDouble(); 
 
            if (precio <= LIMITE_CATEGORIA_BAJA) { 
                System.out.println("Categoría baja"); 
            } else if (precio <= LIMITE_CATEGORIA_MEDIA) { 
                System.out.println("Categoría media"); 
            } else { 
                System.out.println("Categoría alta"); 
                productosCategoriaAlta++; 
            } 
        } 
 
        System.out.println( 
            "Cantidad de productos de categoría alta: " 
            + productosCategoriaAlta 
        ); 
 
        scanner.close(); 
    } 
} 