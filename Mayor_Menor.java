import java.util.Scanner;

public class Mayor_Menor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[8];
        int mayor, menor;

        System.out.println("Ingrese 8 números:");
        for (int i = 0; i < 8; i++) {
            num[i] = scanner.nextInt();
        }

        mayor = menor = num[0];
        for (int i = 1; i < 8; i++) {
            if (num[i] > mayor) {
                mayor = num[i];
            }
            if (num[i] < menor) {
                menor = num[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
