import java.util.Scanner;

public class EjerciciosRecursivos {

    // EJERCICIO 1
    public static int sumaConsecutivos(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumaConsecutivos(n - 1);
    }

    // EJERCICIO 2
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
     }

    // EJERCICIO 3
    public static int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        }
        return numero % 10 + sumaDigitos(numero / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
    
        do {
            System.out.println("Menú:");
            System.out.println("1. Sumar números consecutivos");
            System.out.println("2. Calcular potencia de un número");
            System.out.println("3. Sumar los dígitos de un número");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción (1-4): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número para calcular la suma de consecutivos: ");
                    int n = scanner.nextInt();
                    System.out.println("La suma de los números consecutivos desde 1 hasta " + n + " es: " + sumaConsecutivos(n));
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Ingrese la base: ");
                    int base = scanner.nextInt();
                    System.out.print("Ingrese el exponente: ");
                    int exponente = scanner.nextInt();
                    System.out.println("El resultado de " + base + " elevado a la potencia de " + exponente + " es: " + potencia(base, exponente));
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Ingrese un número para calcular la suma de sus dígitos: ");
                    int numero = scanner.nextInt();
                    System.out.println("La suma de los dígitos de " + numero + " es: " + sumaDigitos(numero));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Saliste");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
