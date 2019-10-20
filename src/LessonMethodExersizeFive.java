import java.util.ArrayList;
import java.util.Collections;

public class LessonMethodExersizeFive {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(30);
        ArrayList<Integer> listone = new ArrayList<Integer>( arrayRevers(list));
        System.out.println(listone);

    }
    public static ArrayList<Integer> arrayRevers(ArrayList<Integer> x){
        Collections.reverse(x);
        return x;
    }
}
