public class PatternOne {

    public interface FillStrategy{
        public void fill();
    }

    public class HybridFillStrategy implements FillStrategy {

        @Override
        public void fill() {
            System.out.println("Заправляем бензином или электричеством на выбор!");
        }
    }

    public class F1PitstopStrategy implements FillStrategy {

        @Override
        public void fill() {
            System.out.println("Заправляем бензин только после всех остальных процедур пит-стопа!");
        }
    }

    public class StandartFillStrategy implements FillStrategy {
        @Override
        public void fill() {
            System.out.println("Просто заправляем бензин!");
        }
    }

    public class Auto{
        FillStrategy fillStrategy;

        public void fill(){
            fillStrategy.fill();
        }
        public void gas(){
            System.out.println("Gnum enq araj");
        }
        public void stop(){
            System.out.println("Kangnel");
        }

    }

    public class F1Car extends Auto{

        public F1Car(){
            this.fillStrategy = new F1PitstopStrategy();
        }
    }
    public class HybridAuto extends Auto {

        public HybridAuto() {
            this.fillStrategy = new HybridFillStrategy();
        }
    }

    public class Sedan extends Auto {

        public Sedan() {
            this.fillStrategy = new StandartFillStrategy();
        }
    }

    public void main(String[] args) {
        Auto sedan = new Sedan();
        sedan.fill();
    }
    }
