public class LessonMethodExersizeFoure {
    public static void main(String[] args) {
    int x = charNumber('b');
        System.out.println(x);
    }
    public static int charNumber(char x){
        int num = Character.getNumericValue(x);
        return num;
    }
}