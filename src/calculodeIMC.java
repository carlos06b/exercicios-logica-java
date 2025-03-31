import java.util.Scanner;

public class calculodeIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual sua altura? ");
        double altura = sc.nextDouble();
        System.out.println("Qual seu peso? ");
        double peso = sc.nextDouble();
        double IMC = (peso / (altura * altura));
        if (IMC < 18.5) {
            System.out.println("Seu IMC é igual a " + IMC + "você é magro");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Seu IMC é igual a " + IMC + ", seu peso é ideal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Seu IMC é igual a " + IMC + "você está com sobrepeso");
        } else if (IMC > 30) {
            System.out.println("Seu IMC é igual a " + IMC + "você está obeso");
        }
    }
}

