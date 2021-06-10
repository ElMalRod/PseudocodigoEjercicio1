import java.util.Random;
import java.util.Scanner;

public class Ejercicio1J2{

    public static void main(String[] args) {
        int N;
        int valorDado;
        Scanner sc = new Scanner(System.in);
        Random Aleatoreo = new Random();
        System.out.print("Introduce un número: ");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            valorDado = Aleatoreo.nextInt(100) + 1;
            if (valorDado % 2 == 0) {
                System.out.println(valorDado + " El numero es par");

            } else {
                System.out.println(valorDado + " El numero es impar");
            }
        }

    }
}