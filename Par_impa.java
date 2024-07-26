import java.util.Scanner;

public class Par_impa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        int Par = 0;
        int Impar = 0;

        System.out.println("Ingrese 10 numeros :");
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (num[i] % 2 == 0) {
                Par++;
            } else {
                Impar++;
            }
        }

        System.out.println("Los numeros pares fueron: " + Par);
        System.out.println("Los numeros impares fueron: " + Impar);
    }
}
