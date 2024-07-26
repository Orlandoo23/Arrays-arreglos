import java.util.Scanner;

public class Invert_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[6];

        System.out.println("Ingrese 6 números :");
        for (int i = 0; i < 6; i++) {
            num[i] = scanner.nextInt();
        }

        System.out.println("Arreglo invertido:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}
