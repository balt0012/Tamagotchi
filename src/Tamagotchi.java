public class Tamagotchi {
    public String type;
    public String name;
    public int age;
    public int mood;
    public int energy;
    public int hunger;
    public String assciNormal;
    public String assciSleep;
    public String assciEat;
    public String assciPlay;

    public Tamagotchi(String type, String name, int age, int mood, int energy, int hunger, String assciNormal, String assciSleep, String assciEat, String assciPlay) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
        this.hunger = hunger;
        this.assciNormal = assciNormal;
        this.assciSleep = assciSleep;
        this.assciEat = assciEat;
        this.assciPlay = assciPlay;
    }

    @Override
    public String toString() {
        return "Tamagotchi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mood=" + mood +
                ", energy=" + energy +
                ", hunger=" + hunger +
                '}';
    }

    public void play(){
        this.mood += 5;
        this.energy -=3;
        if (this.mood > 10){
            this.mood = 10;
        }
        if (this.energy < 0){
            this.energy = 0;
        }
        System.out.println(this.assciPlay);
        System.out.println(this.name + " is playing");
    }

    public void feed(){
        this.hunger -= 5;
        this.mood -= 3;
        if (this.hunger < 0){
            this.hunger = 0;
        }
        if (this.mood < 0){
            this.mood = 0;
        }
        System.out.println(this.assciEat);
        System.out.println(this.name + " has found something to eat");
    }

    public void sleep(){
        this.energy += 5;
        if (this.energy > 10){
            this.energy = 10;
        }
        System.out.println(this.assciSleep);
        System.out.println(this.name + " is going to sleep for a while");
    }
}
