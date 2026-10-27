package src;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args){

      var option = -1;

      do {
          System.out.println("=== Escolha uma das opções ===");
          System.out.println("Dar banho no pet. ");
          System.out.println("Abastecer a máquina com água. ");
          System.out.println("Abastecer a máquina com shampoo. ");
          System.out.println("Verifica nível de água.");
          System.out.println("Verifica nível de shampoo.");
          System.out.println("Verifica se tem pet no banho.");
          System.out.println("Colocar Pet no banho.");
          System.out.println("Retirar Pet na máquina.");
          System.out.println("Limpar a máquina.");
          option = scanner.nextInt();

          switch(option){
              case 7 -> setPetInMachine();
          }
      }while(option != 0);

    }

    public static void setPetInMachine(){
        System.out.println("Informe o nome do pet");
        var name = scanner.next();
        var pet = new Pet(name);
        petMachine.setPet(pet);
    }
}

