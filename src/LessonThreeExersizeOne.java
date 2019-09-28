public class LessonThreeExersizeOne {
    public static void main(String[] args) {
        int line_segment = 10;
        int value = 4;

        switch (value) {
           case 1:
               int decimetr_metr = 1;
               int sum1 = line_segment * decimetr_metr/10;
               System.out.println(line_segment + " decimetr " + "= " + sum1 + " metr");
            break;
           case 2:
               int kilometr_metr = 1000;
               int sum2 = kilometr_metr * line_segment;
               System.out.println(line_segment + " kilometr " + "= " + sum2 + " metr");
            break;
            case 3:
                int metr = 1;
                int sum3 = metr * line_segment;
                System.out.println(line_segment + " metr " + "= " + sum3 + " metr");
            break;
            case 4:
                int millimetr_metr = 1;
                double sum4 = (double)millimetr_metr*line_segment/1000;
                System.out.println(line_segment + " millimetr " + "= " + sum4 + " metr");
            break;
            case 5:
                int santimetr_metr = 1;
                double sum5 = (double)santimetr_metr * line_segment/100;
                System.out.println(line_segment + " santimetr " + "= " + sum5 + " metr");
            break;
        }
    }
}