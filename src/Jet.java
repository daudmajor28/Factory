public class Jet {
    int speed;
    String name;
    boolean KilometersPerSeconds;


//contructor
     public Jet(){
            speed=250;
            name=" Kampala6";
            KilometersPerSeconds= false;

    }
    public Jet(int pSpeed, String kName, boolean pKilometersPerSeconds) {
        speed=pSpeed;
        name=kName;
        KilometersPerSeconds=pKilometersPerSeconds;
    }

    public void printInfo() {
        System.out.println(speed);
        System.out.println(KilometersPerSeconds);
        System.out.println("this plane is named" + name);
    }}