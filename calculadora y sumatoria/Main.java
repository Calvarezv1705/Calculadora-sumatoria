import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Calculadora calculadora = new Calculadora(0);

        System.out.print("Ingresa el primer número: ");
        float a = teclado.nextFloat();

        System.out.print("Ingresa el segundo número: ");
        float b = teclado.nextFloat();

        System.out.println("suma: " + calculadora.sumar(a, b));
        System.out.println("Memoria actual: " + calculadora.obtenerMemoria());

        System.out.println("multiplicacion: " + calculadora.multiplicar(a, b));
        System.out.println("Memoria actual: " + calculadora.obtenerMemoria());

        System.out.println("division: " + calculadora.dividir(a, b));
        System.out.println("Memoria actual: " + calculadora.obtenerMemoria());

        System.out.println("restar: " + calculadora.restar(a, b));
        System.out.println("Memoria actual: " + calculadora.obtenerMemoria());
    }
}
