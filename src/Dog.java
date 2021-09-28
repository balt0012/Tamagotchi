public class Dog extends Tamagotchi{
    public static String assciNormal = "                            __\n" +
            "     ,                    ,\" e`--o\n" +
            "    ((                   (  | __,'\n" +
            "     \\\\~----------------' \\_;/\n" +
            "     (                      /\n" +
            "     /) ._______________.  )\n" +
            "    (( (               (( (\n" +
            "     ``-'               ``-'";
    public static String assciSleep = "   .-------------.       .    .   *       *   \n" +
            "  /_/_/_/_/_/_/_/ \\         *       .   )    .\n" +
            " //_/_/_/_/_/_// _ \\ __          .        .   \n" +
            "/_/_/_/_/_/_/_/|/ \\.' .`-o                    \n" +
            " |             ||-'(/ ,--'                    \n" +
            " |             ||  _ |                        \n" +
            " |             ||'' ||                        \n" +
            " |_____________|| |_|L";
    public static String assciEat = "     ________________\n" +
            "    '------._.------'\\\n" +
            "      \\_______________\\\n" +
            "     .'|            .'|\n" +
            "   .'_____________.' .|\n" +
            "   |              |   |\n" +
            "   |     Dog _.-. | . |\n" +
            "   |  *     (_.-' |   |\n" +
            "   |    Snacks    |  .|\n" +
            "   | *          * |  .'\n" +
            "   |______________|.' ";
    public static String assciPlay = "                                   _\n" +
            "                                (\\ \\)\n" +
            "                              o__^\\/     ,\n" +
            "                               \\ ' \\    <   _  _\n" +
            "' '  .                          `|  \\____\\   -   -\n" +
            "       '      . .      ()        |        )  _   _\n" +
            "         `.'       `.'         .//---_/-_/ _  _";

    public Dog(String type, String name, int age, int mood, int energy, int hunger) {
        super(type, name, age, mood, energy, hunger, Dog.assciNormal, Dog.assciSleep, Dog.assciEat, Dog.assciPlay);
    }
}
