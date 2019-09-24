public class LessonOneExersizeTwo {
    public static void main(String[] args) {
        int x = f(0);
        System.out.print(x);
    }

    private static int f(int i) {
        int y;
        y = 2 * i - 10;
        if (i > 0){
            y = 0;
            return y;
        }else if (i == 0){
            y = 2 * i - 1;
            return y;
        }else{
            return y;
        }
    }
}
