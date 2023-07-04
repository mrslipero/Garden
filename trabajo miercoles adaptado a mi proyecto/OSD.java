import java.util.Scanner;

public class OSD {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int numeroPlantas;
      Planta[] lasPlantas = new Planta[50];
      String identificacion, nombre, especie;
      double precio;
      int stock;
      double totalVentas = 0;

      System.out.println("Digite la cantidad de plantas: ");
      numeroPlantas = sc.nextInt();

      for (int i = 0; i < numeroPlantas; i++) {
         System.out.println("Digite la identificacion de la planta: ");
         identificacion = sc.next();
         System.out.println("Digite el nombre de la planta: ");
         nombre = sc.next();
         System.out.println("Digite la especie de la planta: ");
         especie = sc.next();
         System.out.println("Digite el precio de la planta: ");
         precio = sc.nextDouble();
         System.out.println("Digite el stock de la planta: ");
         stock = sc.nextInt();
         Planta unaPlanta = new Planta();
         unaPlanta.identificacion = identificacion;
         unaPlanta.nombre = nombre;
         unaPlanta.especie = especie;
         unaPlanta.precio = precio;
         unaPlanta.stock = stock;
         lasPlantas[i] = unaPlanta;
      }

      for (int i = 0; i < numeroPlantas; i++) {
         totalVentas += lasPlantas[i].precio * lasPlantas[i].stock;
      }

      System.out.println("El total de ventas es: " + totalVentas);
   }
}

