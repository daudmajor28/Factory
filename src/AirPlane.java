public class AirPlane {

    int capacity;
    String name;
     String model;
     boolean isDoubleDeacker;
     int length;

     //contructor
     public AirPlane(){
         capacity=250;
         name="Jacob 6";
         model= "boeing 737";
         length=157;

     }
     public AirPlane(int pCapacity){
         capacity=pCapacity;
         name="Jacob 6";
         model= "boeing 737";
         length=157;

     }
     //todo: make a method called printInfo() that prints the airplanes instance variables

    public void printInfo (){
        System.out.println(capacity);
        System.out.println(model;
        System.out.println(isDoubleDeacker);
        System.out.println();


    }
}
