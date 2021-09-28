public class Dog extends Tamagotchi{
    public static String assciNormal = """
                                    __
             ,                    ," e`--o
            ((                   (  | __,'
             \\\\~----------------' \\_;/
             (                      /
             /) ._______________.  )
            (( (               (( (
             ``-'               ``-'""".indent(4);
    public static String assciSleep = """
               .-------------.       .    .   *       *  \s
              /_/_/_/_/_/_/_/ \\         *       .   )    .
             //_/_/_/_/_/_// _ \\ __          .        .  \s
            /_/_/_/_/_/_/_/|/ \\.' .`-o                   \s
             |             ||-'(/ ,--'                   \s
             |             ||  _ |                       \s
             |             ||'' ||                       \s
             |_____________|| |_|L""";
    public static String assciEat = """
              ________________
             '------._.------'\\
               \\_______________\\
              .'|            .'|
            .'_____________.' .|
            |              |   |
            |     Dog _.-. | . |
            |  *     (_.-' |   |
            |    Snacks    |  .|
            | *          * |  .'
            |______________|.'\s""".indent(3);
    public static String assciPlay = """
                                               _
                                            (\\ \\)
                                          o__^\\/     ,
                                           \\ ' \\    <   _  _
            ' '  .                          `|  \\____\\   -   -
                   '      . .      ()        |        )  _   _
                     `.'       `.'         .//---_/-_/ _  _""";

    public Dog(String type, String name, int age, int mood, int energy, int hunger) {
        super(type, name, age, mood, energy, hunger, Dog.assciNormal, Dog.assciSleep, Dog.assciEat, Dog.assciPlay);
    }
}
