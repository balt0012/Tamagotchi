public class Tamagotchi {
    public String name;
    public int age;
    public int mood;
    public int energy;
    public int hunger;


    public Tamagotchi(String name, int age, int mood, int energy, int hunger) {
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
        this.hunger = hunger;
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

    }
    public void feed(){

    }
    public void sleep(){

    }
}
