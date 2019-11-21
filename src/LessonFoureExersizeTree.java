import jdk.nashorn.internal.objects.NativeUint8Array;

public class LessonFoureExersizeTree {
    public static void main(String[] args) {
        int[] num = {1, 2,58, 3, 4, 5, 6, 7, 2, 8, 9, 10};
    for (int i = 0;i<num.length;i++){
       if (num[i]+1 != num[i+1]){
           if (num[i]+1 != num[i+2]){
               System.out.println(num[i]);
           }
       }
    }
  }
}