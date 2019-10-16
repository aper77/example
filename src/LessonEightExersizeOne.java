public class LessonEightExersizeOne {
    public static void main(String[] args) {
        try{
           int x = 0;
           int y=10/x;
        }catch (ArithmeticException e){
            System.out.println("dilenie na nol");
        }
    }
}