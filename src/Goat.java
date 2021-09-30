public class Goat extends Tamagotchi{
    public static String assciNormal = """
                         ,--._,--.
                       ,'  ,'   ,-`.
            (`-.__    /  ,'   /
             `.   `--'        \\__,--'-.
               `--/       ,-.  ______/
                 (o-.     ,o- /
                  `. ;        \\
                   |:          \\
                  ,'`       ,   \\
                 (o o ,  --'     :
                  \\--','.        ;
                   `;;  :       /
                    ;'  ;  ,' ,'
                    ,','  :  '
                    \\ \\   :""";
    public static String assciSleep = """
              .           .
              /|__________/|    (_(
            .// /   bed .//|    /_/'_____/)
            |/_/________|//|    "  |      |
            |_|_________|/         |""\"""\"|
            |           |  \s""";
    public static String assciEat = """
                         ,,~~--___---,
                        /            .~,
                  /  _,~             )
                 (_-(~)   ~, ),,,(  /'
                  Z6  .~`' ||     \\ |
                  /_,/     ||      ||
            ~~~~~~~~~~~~~~~W`~~~~~~W`~~~~~~~~~""";
    public static String assciPlay = """
                               __________________________
                              /  (\\__/)    ===           \\
                        ___  /   |O  O|                   \\  ___
                       |___|/___@@\\__/@@___________________\\|___|          .
                           /________________________________\\                .
                           ||      \\=======*=======/       ||             .    .
                           ##################################           ...
            .... . .  ..   \\____________|BAA 1|_____________/         . ....
                . . . ..   ####         -------          ####     ... .   . .
                   . ..... ####                          ####  .. ... .. .""";

    public Goat(String type, String name, int age, int mood, int energy, int hunger) {
        super(type, name, age, mood, energy, hunger, Goat.assciNormal, Goat.assciSleep,Goat.assciEat,Goat.assciPlay);
    }
    @Override
    public void play() {
        this.mood += 3;
        this.energy -= 1;
        if (this.mood > 10) {
            this.mood = 10;
        }
        if (this.energy < 0) {
            this.energy = 0;
        }
        System.out.println(this.assciPlay);
        System.out.println(this.name + " is going on a drive");
    }
}
