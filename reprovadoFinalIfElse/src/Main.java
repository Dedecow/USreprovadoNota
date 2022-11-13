import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double nota1, nota2, soma;
        System.out.println("Digite a nota 1 ?");
        nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2 ?");
        nota2 = sc.nextDouble();
        soma = nota1+ nota2;
        System.out.printf(" Nota Final =  %.1f%n", soma);

        if ((nota1 + nota2) < 60.0) {
            System.out.println(" REPROVADO ");
        }

        sc.close();
    }
}