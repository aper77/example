public class LessonMethodExersizeSeven {
    public static void main(String[] args) {
    int sum = multiplicate(2,3);
    int sumOne = squareDegree(sum);
        System.out.println(sumOne);

    }

    public static int multiplicate(int x,int y){
        int sum = x*y;
        return sum;
    }

    public static int squareDegree(int x){
       int sum = x*x;
       return sum;
    }
}
