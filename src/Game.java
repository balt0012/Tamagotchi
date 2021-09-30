import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Tamagotchi pet;
        int action;
        pet = chooseTamagotchi();
        System.out.println(pet);
        System.out.println(pet.assciNormal);
        do {
            action = chooseAction();
            if (action == 1){
                pet.feed();
            } else if (action == 2){
                pet.sleep();
            } else if (action == 3){
                pet.play();
            }
            System.out.println(pet);
        } while (action != 4);
    }

    public static int chooseAction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                what would you like to do?\s
                1 - eat
                2 - sleep
                3 - play
                4 - exit""");
        return scanner.nextInt();
    }

    public static Tamagotchi chooseTamagotchi(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String tamagotchiType;
        Tamagotchi pet = new Tamagotchi("","",0,0,0,0,"","","","");
        do {
            System.out.println("do you want a cat,dog,goat?");
            tamagotchiType = scanner.nextLine();
        } while(!tamagotchiType.equals("dog") && !tamagotchiType.equals("cat") && !tamagotchiType.equals("goat"));
        System.out.println("what would you like to name your new " + tamagotchiType);
        String name = scanner.nextLine();
        if (tamagotchiType.equals("cat")){
            pet = new Cat("cat", name,0, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1);
            return pet;
        }
        else if (tamagotchiType.equals("dog")) {
            pet = new Dog("dog", name,0, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1);
            return pet;
        }
        else if (tamagotchiType.equals("goat")) {
            pet = new Goat("goat", name,0, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1);
            return pet;
        }
        return pet;
    }
}
