import java.util.ArrayList;

public class LessonMethodExersizeSix {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(25);
        list.add(7);
        ArrayList<Integer> listone = new ArrayList<Integer>(multiplication(list));
        System.out.println(listone);
    }

    public static ArrayList<Integer> multiplication(ArrayList<Integer> x){
       ArrayList<Integer> listExample = new ArrayList<Integer>();
        for (int i : x){
           int a = i *2;
           listExample.add(a);
        }
        return listExample;
    }
}