import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.time.Clock;
import java.time.Duration;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tamagotchiType;
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
            tick();
        } while (action != 4);
    }

    public static int chooseAction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what would you like to do? \n" +
                "1 - eat\n" +
                "2 - sleep\n" +
                "3 - play\n" +
                "4 - exit");
        return scanner.nextInt();
    }

    public static Tamagotchi chooseTamagotchi(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String tamagotchiType;
        Tamagotchi pet = new Tamagotchi("","",0,0,0,0,"","","","");
        do {
            System.out.println("do you want a cat or a dog?");
            tamagotchiType = scanner.nextLine();
        } while(!tamagotchiType.equals("dog") && !tamagotchiType.equals("cat"));
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
        return pet;
    }

    public static void tick(){
        Clock clock = Clock.systemUTC();
        Duration tickDuration = Duration.ofSeconds(1);
        String[] tickSplit = clock.instant().toString().split("T", 2);
        String tick = tickSplit[1];
        System.out.println(tick);
    }
}
