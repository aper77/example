import java.util.Stack;


public class LessonFourExersizeOne {
    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<Integer>();
        for (int i = 0; i < 5; i++) {
            int x = (int) (Math.random() * 10);
            arr.push(x);
        }
        System.out.print(arr);
    }
}