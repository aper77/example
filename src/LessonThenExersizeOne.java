import java.util.ArrayList;
import java.util.stream.Stream;

public class LessonThenExersizeOne {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("He");
        str.add("nam");
        str.add("p");
        str.add("jav");
       // System.out.println(str);
        Stream<String> strim = str.stream();
        str.stream().filter(s -> s.length()  ==3).forEach(System.out::println);
        //оставить только те слава у которых количество букв ровно 3;

    }
}
