package src;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

        var option = -1;

        do {
            System.out.println("\n### Escolha uma das opções ###");
            System.out.println("1 - Dar banho no pet.");
            System.out.println("2 - Abastecer a máquina com água.");
            System.out.println("3 - Abastecer a máquina com shampoo.");
            System.out.println("4 - Verificar nível de água.");
            System.out.println("5 - Verificar nível de shampoo.");
            System.out.println("6 - Verificar se tem pet no banho.");
            System.out.println("7 - Colocar pet no banho.");
            System.out.println("8 - Retirar pet da máquina.");
            System.out.println("9 - Limpar a máquina.");
            System.out.println("0 - Sair.");
            System.out.print("Escolha: ");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();

                case 7 -> setPetInMachine();

                case 8 -> petMachine.removePet();

                case 0 -> System.out.println("Saindo do sistema...");

                default -> System.out.println("Opção inválida.");
            }

        } while (option != 0);

        scanner.close();
    }

    public static void setPetInMachine(){
        System.out.println("Informe o nome do pet");
        var name = scanner.next();
        var pet = new Pet(name);
        petMachine.setPet(pet);
    }
}

