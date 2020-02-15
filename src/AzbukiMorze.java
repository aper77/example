import java.util.Arrays;

public class AzbukiMorze {
    public static void main(String[] args) {
        char [] regenglish = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3',
                '4', '5', '6', '7', '8', '9', '!', '?', '.', ',', '/', ':', ';',
                '-', '"', '\'', '(', ')', ' '};

        String[] regmorse = { ".- ", "-... ", "-.-. ", "-.. ",
                ". ", "..-. ", "--. ", ".... ", ".. ", ".--- ", "-.- ", ".-.. ", "-- ", "-.",
                "--- ", ".--. ", "--.- ", ".-. ", "... ", "- ", "..- ", "...- ", ".-- ",
                "-..- ", "-.-- ", "--.. ", "----- ", ".---- ", "..--- ",
                "...-- ", "....- ", "..... ", "-.... ", "--... ", "---.. ",
                "----. ", "-.-.-- ", "..--.. ", ".-.-.- ", "--..-- ", "-..-. ", "-- -... ",
                "-.-.- ", "-....- ", ".----. ", "-.--. ", "-.--.- ",
                "| "};

        String[] morseChars = r.split(" ");

        char[] chars = Arrays.toString(morseChars).toCharArray();
        boolean endsWithWordSeparator = Arrays.toString(chars).endsWith("| ");
        String st = "";
        for (int j = 0; j < chars.length; j++)
        {
            for (int i = 0; i < regmorse.length; i++)
            {
                if (regmorse[i].equals(Character.toString(chars[j])))

                {
                    st = st + regenglish[i];
                }
            }
        }
        System.out.println(st);
    }

}
