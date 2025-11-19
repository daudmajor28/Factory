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

         //todo: add a parameter for model, isdobledecker, and lemth to the contructors

     }
     public AirPlane(int pCapacity, String pName,String pModel, int pLength, boolean pIsDoubleDeacker){
         capacity=pCapacity;

         model= pModel;
         length=157;
         name=pName;
         length=pLength;
         isDoubleDeacker=pIsDoubleDeacker;


     }
     //todo: make a method called printInfo() that prints the airplanes instance variables

    public void printInfo (){
        System.out.println(capacity);
        System.out.println("Model: " +model);
        System.out.println(isDoubleDeacker);
        System.out.println("this plane is named" +name);
        System.out.println("the length of the plane is" +length);

    }
}
