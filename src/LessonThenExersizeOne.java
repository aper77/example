import java.util.ArrayList;
import java.util.stream.Stream;


public class LessonThenExersizeOne {
    public class LessonThenExersizeOne {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(22);
            numbers.add(10);
            numbers.add(51);
            Stream<Integer> streamFromCollection = numbers.stream();
            numbers.stream().forEach(x-> System.out.println(x +2));
        }
    }//добавить 2, всех элементов калекшана
}