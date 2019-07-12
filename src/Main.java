public class Main {

    public static void main(String[] args) {
        HondaCity vehicle=new HondaCity();
        vehicle.setName("HondaCity");
        vehicle.setColor("Red");
        vehicle.setFuelType("Petrol");
        vehicle.setNoOfWheels(4);
        vehicle.setPrice(4000000);
        vehicle.setMilage(18);
        vehicle.setGear(2);
       //Displaying Car Details
        vehicle.displayCar();
        //Car Functions
        vehicle.moving();
        vehicle.handSteering();

        vehicle.changeGear(3);
        System.out.println("gear changed to " +vehicle.getGear());
        vehicle.changeGear(2);
        System.out.println("gear changed to " +vehicle.getGear());


    }
}
