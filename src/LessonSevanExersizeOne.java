import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class LessonSevanExersizeOne {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("newFile.txt");
        Scanner scanner = new Scanner(file);
        String input = scanner.nextLine();
        while (scanner.hesNextLine()){
            System.out.print(input);
        }
    }
}

