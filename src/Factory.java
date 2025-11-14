
public class Factory {
    //make a variable called yearfound that is an integer
    //instance variable at the top of class, they can be seen by every class
    //they have to have the word public
// scope is the whole class
    public int yearFounded = 1798;
    public String factoryName = "airplane Factory";
    public boolean isOpen = true;


    public static void main(String[] args) {
        System.out.printf("Hello and welcome to Wonka Factory!");
        new Factory();
    }

    //constuctor
    public Factory() {
        isOpen= false;
        //scope manager is only in the constructor
        String manager = "Mr. major";
        System.out.println(manager);


// todo: change the variable yearfounded to be a different value
yearFounded= 2025;
        factoryInfo();
        //type value
        //object of type airplane
        AirPlane plane1=new AirPlane();
        plane1.name = "daud";
        System.out.println(plane1.name);
        plane1.capacity=500;
        plane1.isDoubleDeacker=true;
        plane1.length=70;
        plane1.model="b3 b lancer";
        System.out.println(plane1.model);


AirPlane plane2 = new AirPlane();
System.out.println(plane2.capacity);
plane2.capacity=615;

//hm: make 2 more airplane objects
        //for one of the object change all the instance variables
        //for both objects print all the instance variable

        plane2.name = "Jacobs";
        System.out.println(plane2.name);
        plane2.capacity=500;
        plane2.isDoubleDeacker=true;
        plane2.length=70;
        plane2.model="AK67";
        System.out.println(plane1.model);
        System.out.println(plane2.capacity);
        plane2.capacity=875;


        AirPlane plane3 = new AirPlane( 232);
        System.out.println(plane3.capacity);
        plane3.printInfo();



    }
    // make a method called factoryInfo, nothing should be in the method.
    public void factoryInfo(){
        System.out.println(yearFounded);
        System.out.println(factoryName);
System.out.println(isOpen);
System.out.println(factoryName+yearFounded+isOpen);
System.out.println("year founded" + yearFounded);



        }
}

