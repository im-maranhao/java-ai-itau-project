package src;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var baseYear = OffsetDateTime.now().getYear();

        var scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        var name = scanner.next();

        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();

        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if (age >= 18) {
            System.out.printf("%s, você tem %s anos e pode dirigir.\n", name, age);
        } else if (age >= 16 && isEmancipated){
            System.out.printf("%s,, apesar de você ter %s anos, você é emancipado e pode dirigir", name, age);
        } else{
            System.out.printf("%s, você não pode dirigir", name);
        }
    }
}

