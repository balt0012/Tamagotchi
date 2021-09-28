public class Cat extends Tamagotchi{
    public static String assciNormal = "           __..--''``\\--....___   _..,_\n" +
            "       _.-'    .-/\";  `        ``<._  ``-+'~=.\n" +
            "   _.-' _..--.'_    \\                    `(^) )\n" +
            "  ((..-'    (< _     ;_..__               ; `'\n" +
            "             `-._,_)'      ``--...____..-'";
    public static String assciSleep = "      |\\      _,,,---,,_\n" +
            "ZZZzz /,`.-'`'    -.  ;-;;,_\n" +
            "     |,4-  ) )-,_. ,\\ (  `'-'\n" +
            "    '---''(_/--'  `-'\\_)";
    public static String assciEat = "               )\\._.,--....,'``.      \n" +
            " .b--.        /;   _.. \\   _\\  (`._ ,.\n" +
            "`=,-,-'~~~   `----(,_..'--(,_..'`-.;.'";
    public static String assciPlay = "                _                       \n" +
            "                \\`*-.                   \n" +
            "                 )  _`-.                \n" +
            "                .  : `. .               \n" +
            "                : _   '  \\              \n" +
            "                ; *` _.   `*-._         \n" +
            "                `-.-'          `-.      \n" +
            "                  ;       `       `.    \n" +
            "                  :.       .        \\   \n" +
            "                  . \\  .   :   .-'   .  \n" +
            "                  '  `+.;  ;  '      :  \n" +
            "                  :  '  |    ;       ;-.\n" +
            "                  ; '   : :`-:     _.`* ;\n" +
            "        [ball] .*' /  .*' ; .*`- +'  `*'\n" +
            "               `*-*   `*-*  `*-*'       \n";

    public Cat(String type, String name, int age, int mood, int energy, int hunger) {
        super(type, name, age, mood, energy, hunger, Cat.assciNormal, Cat.assciSleep,Cat.assciEat,Cat.assciPlay);
    }
}
