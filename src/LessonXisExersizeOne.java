import java.util.ArrayList;
public class LessonXisExersizeOne {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;
        numbers.add(1);
        numbers.add(2);
        numbers.add(15);
        for (int i : numbers) {
            sum +=i;
            System.out.print(sum);
        }

    }
}
