import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para ver sua tabuada: ");
        int num = sc.nextInt();
        System.out.println("\n"+"Tabuada do " + num + ": ");
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(result);
        }
    }
}
