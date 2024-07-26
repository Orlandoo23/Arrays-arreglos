import java.util.Scanner;

public class Suma_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;

        System.out.println("Ingrese 5 números :");
        for (int i = 0; i < 5; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        System.out.println("La suma de los numeros es: " + sum);
    }
}
