public class LessonFiveExersizeTree {
    public static void main(String[] args) {
        String str = "Hellow";
        String str1 = "Aloo";
        char arr1[] = str1.toCharArray();
        char arr[] = str.toCharArray();
        for (char c : arr) {
            for (char b : arr1) {
                if (c == b) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}

