public class JavaFasad {
    public static void main(String[] args) {
Fasad fasad = new Fasad();
fasad.copy();
    }
}
class Fasad{
    Power p1 = new Power();
    DVDRom dvd = new DVDRom();
    HDD hdd = new HDD();

    void copy(){
        p1.on();
        dvd.load();
    }
}

class Power{
    void on(){
        System.out.println("Turn On");
    }
    void off(){
        System.out.println("Turn Off");
    }
        }

class DVDRom{
    private boolean data = false;
    public boolean hasData(){
        return data;
    }
    void load(){
        data = true;
    }
    void  unload(){
        data = false;
    }
}
class HDD{
    void copyFromDvd(DVDRom dvd){
        if(dvd.hasData()){
            System.out.println("Going to copy the file");
        }else{
            System.out.println("Put the CD on ");
        }
    }
        }