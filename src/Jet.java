public class Jet {
    int speed;
    String name;
    boolean KilometersPerSeconds;


    public void printInfo() {
        System.out.println(speed);
        System.out.println(KilometersPerSeconds);
        System.out.println("this plane is named" + name);
    }
//contructor
     public Jet(){
            speed=250;
            name=" Kampala6";
            KilometersPerSeconds= false;

    }
}