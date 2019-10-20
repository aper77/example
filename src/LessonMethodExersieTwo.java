public class LessonMethodExersieTwo {
    public static void main(String[] args) {
        Boolean b3 = negativeNumbers(-10);
        System.out.println(b3);

    }
    public static <bulean> bulean negativeNumbers(int i){
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
        if (i<0){
            return (bulean) b1;
        }else{
            return (bulean) b2;
        }
    }
}
