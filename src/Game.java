import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Tamagotchi pet;
        String tamagotchiType;
        do {
            System.out.println("do you want a cat or a dog?");
            tamagotchiType = scanner.nextLine();
        } while(!tamagotchiType.equals("dog") && !tamagotchiType.equals("cat"));
        System.out.println("what would you like to name your new " + tamagotchiType);
        String name = scanner.nextLine();
        if (tamagotchiType.equals("cat")){
            pet = new Cat(name,0, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1);
        }
        else {
            pet = new Dog(name,0, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1);
        }
        System.out.println(pet);

    }
}
