package assign;

//Day-4 Assignment Questions:
//        1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
//        ---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
//        ---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and
//        fuel tank size(in inches)
//        Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
//        Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
//        Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type,
//        mileage and price.) Do the same for a Bajaj and a TVS bike.

class Vehicle {

    public double mileage;
    public double price;

    public Vehicle(double mileage, double price) {
        this.mileage = mileage;
        this.price = price;
    }
}
class Car extends  Vehicle {
    
    public double ownership_cost;
    public   int warranty;
    public   int seating_capacity;
    public   String fuel_type;

    public Car( double mileage, double price, double ownership_cost, int warranty, int seating_capacity, String  fuel_type) {
        super(mileage,price);
        this.ownership_cost = ownership_cost;
        this.warranty = warranty;
        this.seating_capacity = seating_capacity;
        this.fuel_type = fuel_type;
    }
}
class  Bike extends  Vehicle{
    public int number_of_cylinders;
    public  int number_of_gears;
    public String cooling_type;
    public  String wheel_type;
    public  double fuel_tank_size;

    public Bike(double mileage, double price, int number_of_cylinders, int number_of_gears, String cooling_type, String wheel_type, double fuel_tank_size) {
        super(mileage, price);
        this.number_of_cylinders = number_of_cylinders;
        this.number_of_gears = number_of_gears;
        this.cooling_type = cooling_type;
        this.wheel_type = wheel_type;
        this.fuel_tank_size = fuel_tank_size;
    }


}


class  Audi extends  Car{

    public  String model_type;

    public Audi(double mileage, double price, double cost, int warranty, int seating_capacity, String  fuel_type, String model_type) {
        super(mileage, price, cost, warranty, seating_capacity, fuel_type);
        this.model_type = model_type;
    }


    public  void  disply_data(){
        System.out.println("model type"+model_type);
        System.out.println("mileage"+  mileage );
        System.out.println("ownership_cost"+ ownership_cost);
        System.out.println("price"+ price);
        System.out.println("warrenty yesrs" +warranty);
        System.out.println("fuel types" +fuel_type);
        System.out.println("model_type"+model_type);
    }


}

class  Ford extends  Car{
    public  String model_type;

    public Ford(double mileage, double price, double cost, int warranty, int seating_capacity, String fuel_type,String model_type) {
        super(mileage, price, cost, warranty, seating_capacity, fuel_type);
        this.model_type=model_type;
    }


    public  void  disply_data(){
        System.out.println("model type"+model_type);
        System.out.println("mileage"+  mileage );
        System.out.println("ownership_cost"+ ownership_cost);
        System.out.println("price"+ price);
        System.out.println("warrenty yesrs" +warranty);
        System.out.println("fuel types" +fuel_type);
        System.out.println("model_type"+ model_type);

    }
}
class Bajaj extends Bike{
    public  String make_type;



    public Bajaj(double mileage, double price, int number_of_cylinders, int number_of_gears, String cooling_type, String wheel_type, double fuel_tank_size, String make_type) {
        super(mileage, price, number_of_cylinders, number_of_gears, cooling_type, wheel_type, fuel_tank_size);
        this.make_type = make_type;
    }
    public void displayInfo() {
        System.out.println("Bajaj Make Type: " + make_type);
        System.out.println("Number of Cylinders: " + number_of_cylinders);
        System.out.println("Number of Gears: " + number_of_gears);
        System.out.println("Cooling Type: " + cooling_type);
        System.out.println("Wheel Type: " + wheel_type);
        System.out.println("Fuel Tank Size (inches): " + fuel_tank_size);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
    }
}
class  TVS extends  Bike{
    public  String Make_type;



    public TVS(double mileage, double price, int number_of_cylinders, int number_of_gears, String cooling_type, String wheel_type, double fuel_tank_size, String make_type) {
        super(mileage, price, number_of_cylinders, number_of_gears, cooling_type, wheel_type, fuel_tank_size);
        Make_type = make_type;
    }
    public void displayInfo() {
        System.out.println("Bajaj Make Type: " + Make_type);
        System.out.println("Number of Cylinders: " + number_of_cylinders);
        System.out.println("Number of Gears: " + number_of_gears);
        System.out.println("Cooling Type: " + cooling_type);
        System.out.println("Wheel Type: " + wheel_type);
        System.out.println("Fuel Tank Size (inches): " + fuel_tank_size);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
    }
}

public class Vehicle_Main {
    public static void main(String[] args) {

        System.out.println("\n  ford car data");
  Ford f1      = new Ford(15.0,50.00000,50.000,5,6, "petrol","A6");
  f1.disply_data();
System.out.println("\n Audi car data");
  Audi a1=   new Audi( 13.0,10.00000,10.0000,10,4,"Disel","F6");
  a1.disply_data();


        Bajaj bajajBike = new Bajaj(50.0, 120000.0, 1, 5, "Alloys", "Air", 15.0, "pulsar");
        System.out.println("\n bajai bike data");
        bajajBike.displayInfo();


        TVS tvsBike = new TVS(55.0, 90000.0, 1, 1, "Spokes", "Oil", 12.0, "Apache");
        System.out.println("\n TVS bike data ");
        tvsBike.displayInfo();
    }


}
