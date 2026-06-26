import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        String nombre = "";
        double valor1 = 0;
        double valor2 = 0;
        double valorIva = 0;
        double valorTotal = 0;
        double precioBruto = 0;
        System.out.println("Ingrese el nombre de su factura: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese los valores de su factura: ");
        valor1 = scanner.nextDouble();
        valor2 = scanner.nextDouble();

        precioBruto = valor1 + valor2;
        valorIva = precioBruto * 0.19;
        valorTotal = precioBruto + valorIva;

        System.out.println("La factura " + nombre + " tiene un total bruto de " + precioBruto + ", con un impuesto de " + valorIva + " y el monto después de impuesto es de " + valorTotal);
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre para la factura:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese un precio de producto:");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese un segundo precio de producto:");
        double precio2 = scanner.nextDouble();

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String detalle = "La factura " + nombre + " tiene un total bruto de " + totalBruto
                + ", con un impuesto de " + impuesto
                + " y el monto despues de impuesto es de " + totalNeto;

        System.out.println(detalle);
    }

}
