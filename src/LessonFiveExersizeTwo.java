public class LessonFiveExersizeTwo {
    public static void main(String[] args) {
        String str = "Hellow World 2019";
        char arr[] = str.toCharArray();
        for (char c : arr) {
            int a = Character.getNumericValue(c);
            if (Character.isLetter(c)) {
            } else {
                System.out.print(c);
            }
        }
    }
}
