public class Cat extends Tamagotchi{
    public static String assciNormal = """
                     __..--''``\\--....___   _..,_
                 _.-'    .-/";  `        ``<._  ``-+'~=.
             _.-' _..--.'_    \\                    `(^) )
            ((..-'    (< _     ;_..__               ; `'
                       `-._,_)'      ``--...____..-'""".indent(2);
    public static String assciSleep = """
                  |\\      _,,,---,,_
            ZZZzz /,`.-'`'    -.  ;-;;,_
                 |,4-  ) )-,_. ,\\ (  `'-'
                '---''(_/--'  `-'\\_)""";
    public static String assciEat = """
                           )\\._.,--....,'``.     \s
             .b--.        /;   _.. \\   _\\  (`._ ,.
            `=,-,-'~~~   `----(,_..'--(,_..'`-.;.'""";
    public static String assciPlay = """
                            _                      \s
                            \\`*-.                  \s
                             )  _`-.               \s
                            .  : `. .              \s
                            : _   '  \\             \s
                            ; *` _.   `*-._        \s
                            `-.-'          `-.     \s
                              ;       `       `.   \s
                              :.       .        \\  \s
                              . \\  .   :   .-'   . \s
                              '  `+.;  ;  '      : \s
                              :  '  |    ;       ;-.
                              ; '   : :`-:     _.`* ;
                    [ball] .*' /  .*' ; .*`- +'  `*'
                           `*-*   `*-*  `*-*'      \s
            """;

    public Cat(String type, String name, int age, int mood, int energy, int hunger) {
        super(type, name, age, mood, energy, hunger, Cat.assciNormal, Cat.assciSleep,Cat.assciEat,Cat.assciPlay);
    }
    @Override
    public void feed() {
        this.hunger -= 7;
        this.energy-= 2;
        this.mood -= 3;
        if (this.hunger < 0) {
            this.hunger = 0;
        }
        if (this.mood < 0) {
            this.mood = 0;
        }
        System.out.println(this.assciEat);
        System.out.println(this.name + " is going to hunt for a mouse");
    }
}
