public class LessonSevanExersizeTwo {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            System.out.print(i);
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j%2 ==0){
                    System.out.print("*");}
                    else{
                        System.out.print("#");
                }}}
                else{
                    for (int m = 1; m < 9; m++) {
                        if (m%2==0){
                        System.out.print("*");}
                        else{
                            System.out.print("#");
                        }
                    }

            }
            System.out.println();
        }
    }
}