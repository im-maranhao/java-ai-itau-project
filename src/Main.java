package src;

public class Main {
    public static void main(String[] args){

        var male = new Pet();
        male.name = "João";
        male.age = 12;
        var female = new Pet();
        female.name = "Maria";
        female.age = 10;
        System.out.println("Male name: " + male.name + " age: " + male.age);
        System.out.println("Female name: " + female.name + " age: " + female.age);

    }

}

